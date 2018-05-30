package com.mballem.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.mballem.curso.boot.dao.*;
import com.mballem.curso.boot.domain.*;

public class VendasServiceImpl implements VendaService{
	
	
	
	@Autowired
	private VendasDAO dao;

	@Override
	public void salvar(Vendas vendas) {
		dao.save(vendas);		
	}

	@Override
	public void editar(Vendas vendas) {
		dao.update(vendas);		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);		
	}

	@Override @Transactional(readOnly = true)
	public Vendas buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Vendas> buscarTodos() {
		
		return dao.findAll();
	}

	

}