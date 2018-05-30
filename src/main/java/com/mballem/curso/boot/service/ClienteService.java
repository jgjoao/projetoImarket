package com.mballem.curso.boot.service;

import java.util.List;



import com.mballem.curso.boot.domain.*;

public interface ClienteService {

	void salvar(Cliente cliente);
	
	void editar(Cliente cliente);
	
	void excluir(Long id);
	
	Cliente buscarPorId(Long id);
	
	List<Cliente> buscarTodos();
}
