package com.mballem.curso.boot.service;

import java.util.List;


import com.mballem.curso.boot.domain.*;

public interface VendaService {

	
	
void salvar(Vendas vendas);
	
	void editar(Vendas vendas);
	
	void excluir(Long id);
	
	Vendas buscarPorId(Long id);
	
	List<Vendas> buscarTodos();
	
	
}
