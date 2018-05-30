package com.mballem.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.mballem.curso.boot.dao.*;
import com.mballem.curso.boot.domain.*;

public class CarrinhoServiceImpl implements CarrinhoService  {
	
	
	
	@Autowired
	private CarrinhoDAO dao;

	@Override
	public void salvar(Carrinho carrinho) {
		dao.save(carrinho);		
	}

	@Override
	public void editar(Carrinho carrinho) {
		dao.update(carrinho);		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);		
	}

	@Override @Transactional(readOnly = true)
	public Carrinho buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Carrinho> buscarTodos() {
		
		return dao.findAll();
	}

	

}
