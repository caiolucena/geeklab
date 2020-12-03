package com.algaworks.algafood.di.event;

import com.algaworks.algafood.di.modelo.Cliente;

public class ClienteAtivadoEvent {

  private Cliente cliente;

  public ClienteAtivadoEvent(Cliente cliente) {
    this.cliente = cliente;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }



}
