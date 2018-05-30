package com.mballem.curso.boot.service;

import java.util.List;


import com.mballem.curso.boot.domain.*;

public interface ProdutoService {
	
	
	
void salvar(Produto produto);
	
	void editar(Produto produto);
	
	void excluir(Long id);
	
	Produto buscarPorId(Long id);
	
	List<Produto> buscarTodos();
	

}
