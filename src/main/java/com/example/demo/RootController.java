package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {




    @GetMapping("/")
    public String root() {
//        return "수정전 텍스트 문자열 입니다.";
        return "버전 1.0 - cicd 테스트 입니다.";
    }

}
