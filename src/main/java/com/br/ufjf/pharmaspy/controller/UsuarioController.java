package com.br.ufjf.pharmaspy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuarioController {

    @RequestMapping("cadastro-usuario.html")
    public ModelAndView cadastroUsuario ()
    {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("cadastro-usuario");
        return mv;
    }

}
