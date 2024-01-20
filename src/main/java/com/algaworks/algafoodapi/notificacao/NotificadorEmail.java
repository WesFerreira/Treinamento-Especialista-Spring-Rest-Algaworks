package com.algaworks.algafoodapi.notificacao;

import com.algaworks.algafoodapi.modelo.Cliente;

public class NotificadorEmail implements Notificador {

    private Boolean caixaAlta;
    private String hostServidorSmtp;

    public NotificadorEmail(String hostServidorSmtp) {
        this.hostServidorSmtp = hostServidorSmtp;
        System.out.println("NotificadorEmail");
    }

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        if (this.caixaAlta)
            mensagem = mensagem.toUpperCase();
        System.out.printf("Notificando %s através do email %s usando SMTP %s: %s\n",
                cliente.getNome(), cliente.getEmail(), this.hostServidorSmtp, mensagem);
    }

    public void setCaixaAlta(Boolean caixaAlta) {
        this.caixaAlta = caixaAlta;
    }
}
