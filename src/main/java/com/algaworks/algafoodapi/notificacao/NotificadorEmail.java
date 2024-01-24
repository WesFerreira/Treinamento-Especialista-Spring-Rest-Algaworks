package com.algaworks.algafoodapi.notificacao;

import com.algaworks.algafoodapi.modelo.Cliente;
import org.springframework.stereotype.Component;

//@Profile("prod")
@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
@Component
public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do email %s usando SMTP: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
