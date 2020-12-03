package com.algaworks.algafood.di.notificacao.impl;

import com.algaworks.algafood.di.notificacao.Notificador;
import org.springframework.stereotype.Component;
import com.algaworks.algafood.di.enums.NivelUrgencia;
import com.algaworks.algafood.di.anotations.TipoDoNotificador;
import com.algaworks.algafood.di.modelo.Cliente;

@TipoDoNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorSMS implements Notificador {

  private boolean caixaAlta;

  public NotificadorSMS() {
    System.out.println("Notificador SMS instanciado");
  }

  @Override
  public void notificar(Cliente cliente, String mensagem) {

    if (this.caixaAlta) {
      mensagem = mensagem.toUpperCase();
    }

    System.out.printf("Notificando %s através do celular %s: %s\n", cliente.getNome(),
        cliente.getTelefone(), mensagem);

  }

  public void setCaixaAlta(boolean caixaAlta) {
    this.caixaAlta = caixaAlta;
  }

}
