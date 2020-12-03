package com.algaworks.algafood.di.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.algaworks.algafood.di.modelo.Cliente;
import com.algaworks.algafood.di.service.AtivacaoClienteService;

@Controller
public class ClienteController {

  @Autowired
  private AtivacaoClienteService ativacaoClienteService;

  @GetMapping
  @ResponseBody
  public String hello() {

    Cliente joao = new Cliente("João", "joao@email.com", "2333555555");

    // cadastrar cliente
    ativacaoClienteService.ativar(joao);
    return "Hello!";

  }

}
