package com.gabriel.curso.springboot.webapp.springboot_web.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {   
// para Pasar datos a la vista teenemos dos opciones: 
// 1. usando Model de Spring Framework ui
    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("tittle", "Hola Spring");
        model.addAttribute("name", "Gabriel");
        model.addAttribute("lastname", "Orrego");
        
        return "details";

    }

// 2. Usando Map java Util
// se puede pasar cualquier objeto
     @GetMapping("/details2")
    public String details2(Map<String, Object>model){
        model.put("tittle", "Hola Spring");
        model.put("name", "Gabriel");
        model.put("lastname", "Orrego");
        
        return "details";

    }
    
}
