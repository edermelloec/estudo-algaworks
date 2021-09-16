package com.edermello.emfood.domain.repository;

import java.util.List;

import com.edermello.emfood.domain.model.FormaPagamento;

public interface FormaPagamentoRepository {

    List<FormaPagamento> listar();
    FormaPagamento buscar(Long id);
    FormaPagamento salvar(FormaPagamento formaPagamento);
    void remover(FormaPagamento formaPagamento);
    
} 