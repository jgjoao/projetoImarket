package com.mballem.curso.Service;

import java.util.List;

import com.example.demo.domain.Cartao;

public interface CartaoService {
	
    void salvar(Cartao cartao);
	
	void editar(Cartao cartao);
	
	void excluir(Long id);
	
	Cartao buscarPorId(Long id);
	
	List<Cartao> buscarTodos();

}
