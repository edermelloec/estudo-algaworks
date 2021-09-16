package com.edermello.emfood.domain.repository;

import java.util.List;

import com.edermello.emfood.domain.model.Cidade;

public interface CidadeRepository {

    List<Cidade> listar();
    Cidade buscar(Long id);
    Cidade salvar(Cidade cidade);
    void remover(Cidade cidade);
    
}
