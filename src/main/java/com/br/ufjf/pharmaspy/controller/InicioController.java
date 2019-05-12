package com.br.ufjf.pharmaspy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InicioController {

    @GetMapping({"login.html"})
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return mv;
    }

    @GetMapping({"inicio.html"})
    public ModelAndView inicio() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("inicial");
        return mv;
    }

}