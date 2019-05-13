package com.br.ufjf.pharmaspy.controller;

import com.br.ufjf.pharmaspy.model.Chamado;
import com.br.ufjf.pharmaspy.model.Foto;
import com.br.ufjf.pharmaspy.model.Medicamento;
import com.br.ufjf.pharmaspy.model.Usuario;
import com.br.ufjf.pharmaspy.repository.ChamadoRepository;
import com.br.ufjf.pharmaspy.repository.FotoRepository;
import com.br.ufjf.pharmaspy.repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    private FotoRepository fotoRepository;
    public static final String uploadingDir = System.getProperty("user.dir") + "/uploadingDir/";

    @GetMapping({"chamado.html/{idMedicamento}"})
    public ModelAndView chamado(@PathVariable Long id) {
        Medicamento medicamento = medicamentoRepository.getOne(id);
        ModelAndView mv = new ModelAndView().addObject("medicamento",medicamento);
        mv.setViewName("chamado");
        return mv;
    }

    @PostMapping("chamado.html")
    public ModelAndView chamado_salvar(Chamado chamado, @RequestParam("uploadingFiles") MultipartFile[] uploadingFiles, HttpSession session) throws IOException {
        if(session.getAttribute("usuarioId")!=null) {
            Long usuarioId = (Long) session.getAttribute("usuarioId");
            chamado.setUsuarioCriador(new Usuario().setIdUsuario(usuarioId));
            Chamado chamadoSaved = chamadoRepository.save(chamado);
            fileSave(uploadingFiles, uploadingDir, chamadoSaved);
            ModelAndView mv = new ModelAndView();
            mv.setViewName("chamado");
            return mv;
        }
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return mv;
    }

    private void fileSave(@RequestParam("uploadingFiles") MultipartFile[] uploadingFiles, String uploadingDir, Chamado chamado) throws IOException {
        File dir = new File(uploadingDir +"/"+chamado.getIdChamado());
        if(!dir.exists()){
            dir.mkdirs();
        }
        for(MultipartFile uploadedFile : uploadingFiles) {
            File file = new File(dir +"/"+ uploadedFile.getOriginalFilename());
            uploadedFile.transferTo(file);
            Foto foto = new Foto(dir.getAbsolutePath(),file.getName(),chamado);
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
        ModelAndView mv = new ModelAndView().addObject("medicamentos",medicamentos);
        mv.setViewName("escolhamedicamento");
        return mv;
    }
}
