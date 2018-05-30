package com.example.Application.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/content")
public class ConteudoController {

	
	@GetMapping("/conteudo")
	public String exibeConteudos() {
		return "/conteudo/conteudo";
	}
	
	
	
}
