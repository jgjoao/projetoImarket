package com.example.Application.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/carrinhos")
public class CarrinhoController {

	
	
	@GetMapping("/carrinho")
	public String exibeCarrinho() {
		return "/carrinho/carrinho";
	}
	
	
}
