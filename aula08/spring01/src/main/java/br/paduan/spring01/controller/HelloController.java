package br.paduan.spring01.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*") // aceita requisições de qualquer fonte
@RequestMapping("/hello") // qual recurso ele corresponde
public class HelloController {

    @GetMapping("/ola") //este método é acionado via GET
    public String respondeOla() {
        return "Meu primeiro Spring Boot.";
    }

}
