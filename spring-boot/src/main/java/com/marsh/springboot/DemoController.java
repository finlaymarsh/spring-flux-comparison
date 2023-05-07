package com.marsh.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public Map<String, String> demoEndpoint(){
        return Collections.singletonMap("result", "Hello World");
    }
}
