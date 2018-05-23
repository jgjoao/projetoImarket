package com.mballem.curso.Service;

import java.util.List;

import com.example.demo.domain.Carrinho;

public interface CarrinhoService {
	
	void salvar(Carrinho carrinho);
	
	void editar(Carrinho carrinho);
	
	void excluir(Long id);
	
	Carrinho buscarPorId(Long id);
	
	List<Carrinho> buscarTodos();

}
