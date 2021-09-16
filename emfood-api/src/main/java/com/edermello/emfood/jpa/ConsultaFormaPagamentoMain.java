package com.edermello.emfood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.edermello.emfood.EmfoodApiApplication;
import com.edermello.emfood.domain.model.FormaPagamento;
import com.edermello.emfood.domain.repository.FormaPagamentoRepository;

public class ConsultaFormaPagamentoMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new SpringApplicationBuilder(EmfoodApiApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
        
        FormaPagamentoRepository formaPagamentoRepository = applicationContext.getBean(FormaPagamentoRepository.class);
        
        List<FormaPagamento> todasFormasPagamentos = formaPagamentoRepository.listar();
        
        for (FormaPagamento formaPagamento : todasFormasPagamentos) {
            System.out.println(formaPagamento.getDescricao());
        }
    }
    
}
