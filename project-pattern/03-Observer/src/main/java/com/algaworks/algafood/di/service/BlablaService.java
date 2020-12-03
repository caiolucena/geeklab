package com.algaworks.algafood.di.service;

import com.algaworks.algafood.di.event.ClienteAtivadoEvent;
import org.springframework.context.event.EventListener;

public class BlablaService {

  @EventListener
  public void clienteAtivadoListener(ClienteAtivadoEvent event) {

    System.out.println("Lucas eh mo legal");

  }

}
