package com.br.ufjf.pharmaspy.controller;

import com.br.ufjf.pharmaspy.model.Usuario;
import com.br.ufjf.pharmaspy.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

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
    public ModelAndView login(Usuario usuarioLogin, HttpSession session) {
        Usuario usuario = usuarioRepository.findByEmailIgnoreCase(usuarioLogin.getEmail());
        if (usuario!=null && !usuario.getSenha().equals(usuarioLogin.getSenha())) {
            ModelAndView mv = new ModelAndView();
            mv.setViewName("login");
            return mv;
        }
        session.setAttribute("usuarioId",usuario.getIdUsuario());
        ModelAndView mv = new ModelAndView().addObject("usuario",usuario);
        mv.setViewName("inicial");
        return mv;
    }

    @GetMapping({"inicio.html"})
    public ModelAndView inicio() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("inicial");
        return mv;
    }

    @GetMapping("graficopizza.html")
    public ModelAndView pizza(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("graficopizza");
        return mv;
    }

}