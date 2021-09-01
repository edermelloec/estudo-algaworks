package com.edermello.emfood.domain.repository;

import java.util.List;

import com.edermello.emfood.domain.model.Cozinha;

public interface CozinhaRepository {
	List<Cozinha> todas();
	Cozinha porId(Long id);
	Cozinha salvar(Cozinha cozinha);
	void remover(Cozinha cozinha);

}
