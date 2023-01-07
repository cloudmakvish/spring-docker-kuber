package com.devopstasks.springdockerkuber;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{

    @GetMapping(value = "/hello")
    public String sayHello() {
        return "Hello-World Java_SpringBoot-Docker-Kubernetes Demo";
    }
}