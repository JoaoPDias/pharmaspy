package com.br.ufjf.pharmaspy.controller;

import com.br.ufjf.pharmaspy.model.Usuario;
import com.br.ufjf.pharmaspy.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InicioController {
    @Autowired
    private UsuarioRepository usuarioRepository;
    @GetMapping({"login.html"})
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return mv;
    }

    @PostMapping({"login.html"})
    public ModelAndView login(String email,String senha) {
    Usuario usuario = usuarioRepository.findByEmailIgnoreCase(email);
        if(usuario.g)
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