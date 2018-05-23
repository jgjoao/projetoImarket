package com.mballem.curso.Service;

import java.util.List;

import com.example.demo.domain.Vendas;

public interface VendaService {

	
	
void salvar(Vendas vendas);
	
	void editar(Vendas vendas);
	
	void excluir(Long id);
	
	Vendas buscarPorId(Long id);
	
	List<Vendas> buscarTodos();
	
	
}
