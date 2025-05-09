package com.aragon.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.aragon.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        
        User user = new User("daniel", "aragon");
        model.addAttribute("title", "Hola mundo springboot");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model){
        List<User> users = usersModel();


        model.addAttribute("users",users);
        model.addAttribute("title","Listado usuarios");
        return "list";
    } 

    @ModelAttribute("users")
    public List<User> usersModel(){
        return Arrays.asList(
            new User("Pepa","Gonzales"),
            new User("Lalo","Perez","lalo@correo.com"),
            new User("Juanita","Roe","juana@correo.com"),
            new User("Andres","Doe")
            );
    }
}
