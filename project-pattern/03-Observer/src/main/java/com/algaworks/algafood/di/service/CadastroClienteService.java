package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import com.algaworks.algafood.di.enums.NivelUrgencia;
import com.algaworks.algafood.di.anotations.TipoDoNotificador;
import com.algaworks.algafood.di.event.ClienteAtivadoEvent;
import com.algaworks.algafood.di.notificacao.Notificador;

@Component
public class CadastroClienteService {

  @TipoDoNotificador(NivelUrgencia.URGENTE)
  @Autowired
  private Notificador notificador;

  @EventListener
  public void clienteAtivadoListener(ClienteAtivadoEvent event) {

    notificador.notificar(event.getCliente(), "Seu cadastro no sistema agora está ativo!");

  }

}
