package com.br.ufjf.pharmaspy.controller;

import com.br.ufjf.pharmaspy.ViaCEPClient;
import com.br.ufjf.pharmaspy.model.*;
import com.br.ufjf.pharmaspy.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
public class ChamadoController {
    @Autowired
    private MedicamentoRepository medicamentoRepository;

    @Autowired
    private ChamadoRepository chamadoRepository;

    @Autowired
    private ReacaoMedicamentoRepository reacaoMedicamentoRepository;

    @Autowired
    private FotoRepository fotoRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    public static final String uploadingDir = System.getProperty("user.dir") + "/uploadingDir/";

    @Autowired
    private ViaCEPClient viaCEPClient;

    @GetMapping({"chamado.html/{idMedicamento}"})
    public ModelAndView chamado(@PathVariable Long idMedicamento) {
        /* Long idMedicamento = Long.valueOf(idMedicamento);*/
        Medicamento medicamento = medicamentoRepository.findByIdMedicamento(idMedicamento);
        ModelAndView mv = new ModelAndView().addObject("medicamento", medicamento);
        mv.addObject("reacoes",reacaoMedicamentoRepository.findAllByMedicamento(medicamento));
        mv.setViewName("chamado");
        return mv;
    }

    @PostMapping("chamado.html")
    public String chamado_salvar(Chamado chamado, @RequestParam("uploadingFiles") MultipartFile[] uploadingFiles, HttpSession session,
                                       @RequestParam("cep") String cep, @RequestParam("logradouro") String logradouro, @RequestParam("bairro") String bairro
            , @RequestParam("complemento") String complemento, @RequestParam("localidade") String localidade, @RequestParam("uf") String uf) throws IOException {
        if (session.getAttribute("usuarioId") != null) {
            Endereco endereco = new Endereco().setBairro(bairro)
                    .setCep(cep)
                    .setComplemento(complemento)
                    .setLogradouro(logradouro)
                    .setLocalidade(localidade)
                    .setUf(uf);
            enderecoRepository.save(endereco);
            Long usuarioId = (Long) session.getAttribute("usuarioId");
            chamado.setUsuarioCriador(new Usuario().setIdUsuario(usuarioId));
            chamado.setLocalAquisicao(endereco);
            Chamado chamadoSaved = chamadoRepository.save(chamado);
            if(uploadingFiles != null) {
                fileSave(uploadingFiles, uploadingDir, chamadoSaved);
            }
            return "redirect:/inicio.html";
        }
        return "redirect:/login.html";
    }

    @PostMapping("endereco.html")
    public @ResponseBody
    Endereco getEndereco(@RequestBody String cep) {
        String cepPesquisa = cep.replace("-", "").replace(".", "").replace("\"", "");
        return viaCEPClient.buscaEnderecoPor(cepPesquisa);

    }

    private void fileSave(@RequestParam("uploadingFiles") MultipartFile[] uploadingFiles, String uploadingDir, Chamado chamado) throws IOException {
        File dir = new File(uploadingDir + "/" + chamado.getIdChamado());
        if (!dir.exists()) {
            dir.mkdirs();
        }
        for (MultipartFile uploadedFile : uploadingFiles) {
            File file = new File(dir + "/" + uploadedFile.getOriginalFilename());
            uploadedFile.transferTo(file);
            Foto foto = new Foto(dir.getAbsolutePath(), file.getName(), chamado);
            fotoRepository.save(foto);
        }
    }

    @GetMapping({"escolha-medicamento.html"})
    public ModelAndView busca() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("escolhamedicamento");
        return mv;
    }

    @PostMapping({"escolha-medicamento.html"})
    public ModelAndView buscaMedicamento(String buscamedicamento) {
        List<Medicamento> medicamentos = medicamentoRepository.findAllByNomeMedicamentoContaining(buscamedicamento);
        ModelAndView mv = new ModelAndView().addObject("medicamentos", medicamentos);
        mv.setViewName("escolhamedicamento");
        return mv;
    }
}
