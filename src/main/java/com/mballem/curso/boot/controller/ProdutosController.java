package com.mballem.curso.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {
	
	@GetMapping("/alface")
	public String exibeAlface() {
		return "/produtos/alface";
	}
	
	@GetMapping("/alho")
	public String exibeAlho() {
		return "/produtos/alho";
	}
	
	@GetMapping("/cenoura")
	public String exibeCenoura() {
		return "/produtos/cenoura";
	}
	
	@GetMapping("/repolho")
	public String exibeRepolho() {
		return "/produtos/repolho";
	}
	
	
	

}
