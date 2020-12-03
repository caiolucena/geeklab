package com.algaworks.algafood.config;

import org.springframework.context.annotation.Bean;
import com.algaworks.algafood.di.service.AtivacaoClienteService;

// @Configuration
public class ServiceConfig {

  @Bean(initMethod = "init", destroyMethod = "destroy")
  public AtivacaoClienteService ativacaoClienteService() {

    return new AtivacaoClienteService();

  }

}
