package com.example.demo.render.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {
    @GetMapping("saludo/{nombre}")
    public String saludo (@PathVariable String nombre)  {
        if (nombre == null)  return "Hola amigo";
        return ("Hola "+ nombre);
    }
}
