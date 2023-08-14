package com.example.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// 브라우저와 서버가 통신하기 위한 인터페이스가 컨트롤러이다.
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "homepage";
    }
}
