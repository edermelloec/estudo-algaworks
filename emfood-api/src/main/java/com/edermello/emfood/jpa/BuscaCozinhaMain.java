package com.edermello.emfood.jpa;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.edermello.emfood.EmfoodApiApplication;
import com.edermello.emfood.domain.model.Cozinha;
import com.edermello.emfood.domain.repository.CozinhaRepository;

public class BuscaCozinhaMain {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new SpringApplicationBuilder(EmfoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		
		CozinhaRepository cadastroCozinha= applicationContext.getBean(CozinhaRepository.class);
		
		Cozinha cozinha1 = cadastroCozinha.porId(1l);
		
		System.out.println(cozinha1.getNome());
	}
}
