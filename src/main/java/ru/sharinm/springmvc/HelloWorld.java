package ru.sharinm.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorld {
    @GetMapping("/hello-world")
    public String sayHello() {
        return "hello_world";
    }
}
