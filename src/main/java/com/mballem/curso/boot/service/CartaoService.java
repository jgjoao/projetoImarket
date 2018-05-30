package com.mballem.curso.boot.service;

import java.util.List;



import com.mballem.curso.boot.domain.*;

public interface CartaoService {
	
    void salvar(Cartao cartao);
	
	void editar(Cartao cartao);
	
	void excluir(Long id);
	
	Cartao buscarPorId(Long id);
	
	List<Cartao> buscarTodos();

}
