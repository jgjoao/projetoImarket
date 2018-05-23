package com.mballem.curso.Service;

import java.util.List;

import com.example.demo.domain.Endereco;

public interface EnderecoService {
	
	
void salvar(Endereco endereco);
	
	void editar(Endereco endereco);
	
	void excluir(Long id);
	
	Endereco buscarPorId(Long id);
	
	List<Endereco> buscarTodos();

}
