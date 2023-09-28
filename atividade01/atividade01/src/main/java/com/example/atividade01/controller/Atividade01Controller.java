package com.example.atividade01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/atividade01")
public class Atividade01Controller {

    @GetMapping("/helloworld")
    public String helloworld() {
        return "Hello World!";
    }

    @GetMapping("/bsms")
    public ArrayList<String> bsms() {
        return new ArrayList<>(List.of("Persistência", "Mentalidade de Crescimento", "Orientação ao Futuro",
                "Responsabilidade Pessoal", "Trabalho em Equipe", "Comunicação",
                "Orientação aos Detalhes", "Proatividade"));
    }

    @GetMapping("/objs")
    public ArrayList<String> objs() {
        return new ArrayList<>(List.of("Desejo aprender as funcionalidades do Spring",
                "Desejo aprender mais sobre metódos HTTP!",
                "Desejo aprimorar minha soft skill de comunicação!"));
    }

}

