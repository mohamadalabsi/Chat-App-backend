package org.me.learning.chatappbackend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth/")
public class MainController {

//     i will change them , it is just testing

    @PostMapping ("register")
    public String userRegister (){
        return "register";
    }

    @PostMapping ("login")
    public String userLogin (){
        return "login";
    }

    @PostMapping ("logout")
    public String userLogout (){
        return "logout";
    }


}
