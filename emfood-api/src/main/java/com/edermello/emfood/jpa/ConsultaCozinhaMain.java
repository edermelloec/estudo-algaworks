package com.edermello.emfood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.edermello.emfood.EmfoodApiApplication;
import com.edermello.emfood.domain.model.Cozinha;
import com.edermello.emfood.domain.repository.CozinhaRepository;

public class ConsultaCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(EmfoodApiApplication.class)
				.web(WebApplicationType.NONE).run(args);

		CozinhaRepository cadastroCozinha = applicationContext.getBean(CozinhaRepository.class);

		List<Cozinha> cozinhas = cadastroCozinha.todas();

		for (Cozinha cozinha : cozinhas) {
			System.out.println(cozinha.getNome());
		}
	}
}
