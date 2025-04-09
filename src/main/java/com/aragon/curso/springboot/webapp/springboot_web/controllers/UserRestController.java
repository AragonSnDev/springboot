package com.aragon.curso.springboot.webapp.springboot_web.controllers;


import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aragon.curso.springboot.webapp.springboot_web.models.User;
import com.aragon.curso.springboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details(){
        UserDto userDto = new UserDto();
        User user = new User("daniel", "aragon");
        userDto.setUser(user);
        userDto.setTitle("Hola desde dto");
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list(){
        User user = new User("daniel", "aragon");
        User user2 = new User("andres", "doe");
        User user3 = new User("pepe", "toño");
        
        List<User> users = Arrays.asList(user,user2,user3);

        return users;
    }

}
