package com.mballem.curso.Service;

import java.util.List;

import com.example.demo.domain.Entrega;

public interface EntregaService {
	
void salvar(Entrega entrega);
	
	void editar(Entrega entrega);
	
	void excluir(Long id);
	
	Entrega buscarPorId(Long id);
	
	List<Entrega> buscarTodos();
	

}
