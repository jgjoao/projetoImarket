package com.mballem.curso.boot.service;

import java.util.List;


import com.mballem.curso.boot.domain.*;

public interface EntregaService {
	
void salvar(Entrega entrega);
	
	void editar(Entrega entrega);
	
	void excluir(Long id);
	
	Entrega buscarPorId(Long id);
	
	List<Entrega> buscarTodos();
	

}
