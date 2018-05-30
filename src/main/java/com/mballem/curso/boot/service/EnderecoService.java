package com.mballem.curso.boot.service;

import java.util.List;



import com.mballem.curso.boot.domain.*;

public interface EnderecoService {
	
	
void salvar(Endereco endereco);
	
	void editar(Endereco endereco);
	
	void excluir(Long id);
	
	Endereco buscarPorId(Long id);
	
	List<Endereco> buscarTodos();

}
