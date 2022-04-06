package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;

@RestController
public class TestController {
    @GetMapping("/host")
    public String test(){
        return InetAddress.getLoopbackAddress().getHostName();
    }
}
