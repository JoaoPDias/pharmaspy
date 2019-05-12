package com.br.ufjf.pharmaspy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @GetMapping("login.html")
    public ModelAndView atividadeLogin() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("");
        return mv;
    }
}
