package com.aragon.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title", "Hola mundo from spring boot");
        model.addAttribute("name", "Luis Daniel");
        model.addAttribute("lastName", "Aragón Sánchez");
        return "details";
    }

}
