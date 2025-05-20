package com.practice.auth_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {


    @GetMapping("/ping")
    public String ping() {
        return "git actions + discord 연동 후 알림이 가는지 확인해보자 !";
    }
}
