package com.algaworks.algafoodapi.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//quando vai ser lido a classe pelo container
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface TipoDoNotificador {

    NivelUrgencia value();

}
