package com.algaworks.algafood.di.notificacao.impl;

import com.algaworks.algafood.di.notificacao.Notificador;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import com.algaworks.algafood.di.enums.NivelUrgencia;
import com.algaworks.algafood.di.anotations.TipoDoNotificador;
import com.algaworks.algafood.di.modelo.Cliente;

@Profile("prod")
@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {

  public NotificadorEmail() {
    System.out.println("Notificador Email instanciado");
  }

  @Override
  public void notificar(Cliente cliente, String mensagem) {

      mensagem = mensagem.toUpperCase();


    System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(),
        cliente.getEmail(), mensagem);

  }

}
