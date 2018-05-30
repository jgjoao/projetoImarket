package com.example.Application.web.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mballem.curso.boot.domain.Produto;
import com.mballem.curso.boot.service.ProdutoService;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {
	
	private ProdutoService service;
	
	@GetMapping("/repolho")
	public String exibeRepolho() {
		return "produtos/repolho";
	}
	
	@GetMapping("/cadastrar")
	 public String cadastrar(Produto produto) {
		 return "produtos/cadastro";
	 }
 
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("produto",service.buscarTodos());
		return "produtos/listar";
	}
	
	
	@PostMapping("/salvar")
	public String salvar(@Valid Produto produto ,BindingResult result , RedirectAttributes attr) {
		
		if (result.hasErrors()) {
			return"produtos/cadastro";
		}
		
		service.salvar(produto);
		attr.addFlashAttribute("sucesso", "produto registrado com sucesso");
		
		
		return "redirect:/produtos/cadastro";
	}
	
	
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id,ModelMap model) {
		
		service.excluir(id);
        model.addAttribute("sucesso", "departamento excluido com sucesso");	
	
	
    return listar(model);
}

	
	
	
	
	
}