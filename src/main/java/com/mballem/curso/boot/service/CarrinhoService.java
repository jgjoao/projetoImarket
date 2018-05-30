package com.mballem.curso.boot.service;

import java.util.List;


import com.mballem.curso.boot.domain.*;

public interface CarrinhoService {
	
	void salvar(Carrinho carrinho);
	
	void editar(Carrinho carrinho);
	
	void excluir(Long id);
	
	Carrinho buscarPorId(Long id);
	
	List<Carrinho>buscarTodos();

}
