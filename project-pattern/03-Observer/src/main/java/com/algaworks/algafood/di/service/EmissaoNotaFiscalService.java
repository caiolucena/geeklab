package com.algaworks.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import com.algaworks.algafood.di.enums.NivelUrgencia;
import com.algaworks.algafood.di.anotations.TipoDoNotificador;
import com.algaworks.algafood.di.event.ClienteAtivadoEvent;
import com.algaworks.algafood.di.notificacao.Notificador;

@Component
public class EmissaoNotaFiscalService {

  @TipoDoNotificador(NivelUrgencia.NORMAL)
  @Autowired
  private Notificador notificador;

  @EventListener
  public void clienteAtivadoListener(ClienteAtivadoEvent event) {

    notificador.notificar(event.getCliente(), "Nota fiscal emitida com sucesso!!");

  }

}
