package com.springdemo.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping
    public String helloWorld() {
        return "Hello World from spring boot";
    }

    @RequestMapping("/goodbye")
    public String goodBye() {
        return "good bye spring boot";
    }

    @RequestMapping("/checkGit")
    public String checkGit() {
        return "git from intellij is working fine";
    }
}
