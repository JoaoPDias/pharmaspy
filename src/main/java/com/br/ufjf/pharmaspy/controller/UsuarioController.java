package com.br.ufjf.pharmaspy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuarioController {

    @RequestMapping("chamado.html")
    public ModelAndView chamado ()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("chamado");
        return mv;
    }

}
