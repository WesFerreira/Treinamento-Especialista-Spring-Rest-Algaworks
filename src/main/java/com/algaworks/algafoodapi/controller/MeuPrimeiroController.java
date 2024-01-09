package com.algaworks.algafoodapi.controller;

import com.algaworks.algafoodapi.modelo.Cliente;
import com.algaworks.algafoodapi.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    private AtivacaoClienteService service;

    public MeuPrimeiroController(AtivacaoClienteService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Cliente joao = new Cliente("João", "joao@xyz.com", "39462859");

        service.ativar(joao);

        return "Hello";
    }

}
