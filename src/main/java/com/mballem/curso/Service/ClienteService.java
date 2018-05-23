package com.mballem.curso.Service;

import java.util.List;

import com.example.demo.domain.Cliente;

public interface ClienteService {

	void salvar(Cliente cliente);
	
	void editar(Cliente cliente);
	
	void excluir(Long id);
	
	Cliente buscarPorId(Long id);
	
	List<Cliente> buscarTodos();
}
