package com.example.project0107;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class Project0107ApplicationTests {
    @GetMapping("api/hello")
    @ResponseBody
    public String hello() {
        return "Hello World!";
    }
}
