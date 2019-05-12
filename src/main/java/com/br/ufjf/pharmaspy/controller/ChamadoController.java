package com.br.ufjf.pharmaspy.controller;

import com.br.ufjf.pharmaspy.model.Medicamento;
import com.br.ufjf.pharmaspy.repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ChamadoController {
    @Autowired
    private MedicamentoRepository medicamentoRepository;
    @GetMapping({"chamado.html/{idMedicamento}"})
    public ModelAndView chamado(@PathVariable Long id) {
        Medicamento medicamento = medicamentoRepository.getOne(id);
        ModelAndView mv = new ModelAndView().addObject("medicamento",medicamento);
        mv.setViewName("chamado");
        return mv;
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
