//package com.algaworks.algafoodapi.notificacao;
//
//import com.algaworks.algafoodapi.modelo.Cliente;
//import org.springframework.context.annotation.Profile;
//import org.springframework.stereotype.Component;
//
////@Profile("dev")
//@TipoDoNotificador(NivelUrgencia.SEM_URGENCIA)
//@Component
//public class NotificadorEmailMock implements Notificador {
//
//    @Override
//    public void notificar(Cliente cliente, String mensagem) {
//        System.out.printf("MOCK: Notificação seria enviada para %s através do email %s: %s\n",
//                cliente.getNome(), cliente.getEmail(), mensagem);
//    }
//}
