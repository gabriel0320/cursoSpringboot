package com.gabriel.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.curso.springboot.webapp.springboot_web.models.User;

// Notacion para crear un Rest
@RestController
//se usa para establecer una ruta principal
@RequestMapping("/api")
public class UserRestController {   
// para Pasar datos a la vista teenemos dos opciones: 
// 1. usando Model de Spring Framework ui
    @GetMapping("/detailController")
    public Map<String, Object> details(){
    
        User user = new User("Gabriel", "Orrego");
        // se crea un json 
        Map<String , Object> body = new HashMap<>();
        body.put("tittle","Hola Mundo Spring Boot");
        body.put("user", user);
     
        
        return body;

    }

    
}
