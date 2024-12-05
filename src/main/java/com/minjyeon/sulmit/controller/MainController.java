package com.minjyeon.sulmit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    
    // 홈
    @GetMapping("/")
    public String index(){
        return "index";
    }
    
    // 로그인 화면
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    
    // 회원가입
    @GetMapping("/register")
    public String register(){
        return "register";
    }
}
