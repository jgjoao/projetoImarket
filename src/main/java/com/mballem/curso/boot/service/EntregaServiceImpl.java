package com.mballem.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


import com.mballem.curso.boot.dao.*;
import com.mballem.curso.boot.domain.*;

public class EntregaServiceImpl implements EntregaService  {
	
	
	
	@Autowired
	private EntregaDAO dao;

	@Override
	public void salvar(Entrega entrega) {
		dao.save(entrega);		
	}

	@Override
	public void editar(Entrega entrega) {
		dao.update(entrega);		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);		
	}

	@Override @Transactional(readOnly = true)
	public Entrega buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Entrega> buscarTodos() {
		
		return dao.findAll();
	}

	

}


