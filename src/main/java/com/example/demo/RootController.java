package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {




    @GetMapping("/")
    public String root() {
//        return "수정전 텍스트 문자열 입니다.";
        return "github actions 동작 및 docker hub 푸시테스트";
    }

}
