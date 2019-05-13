package com.br.ufjf.pharmaspy.controller;

import com.br.ufjf.pharmaspy.repository.FotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;

@Controller
public class FotoController {
  /*  public static final String uploadingDir = System.getProperty("user.dir") + "/uploadingDir/";

    @Autowired
    private FotoRepository fotoRepository;

    @GetMapping("/upload.html")
    public ModelAndView uploading() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("uploadAnexo");
        return mv;
    }

    @PostMapping(value = "/upload.html")
    public String uploadingPost(@RequestParam("uploadingFiles") MultipartFile[] uploadingFiles) throws IOException {
        ChamadoController.fileSave(uploadingFiles, uploadingDir);


        return "redirect:/upload.html";
    }*/
}
