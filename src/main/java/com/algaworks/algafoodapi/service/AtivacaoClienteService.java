package com.algaworks.algafoodapi.service;

import com.algaworks.algafoodapi.modelo.Cliente;
import com.algaworks.algafoodapi.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AtivacaoClienteService {

    @Qualifier("email")
    @Autowired
    private Notificador notificador;

    public void ativar(Cliente cliente){
        cliente.ativar();

            notificador.notificar(cliente, "Seu cadastro no sistema esstá ativo!");

    }

}
