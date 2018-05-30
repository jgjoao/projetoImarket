package com.mballem.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.mballem.curso.boot.dao.*;
import com.mballem.curso.boot.domain.*;

@Service @Transactional(readOnly = false)
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteDAO dao;

	@Override
	public void salvar(Cliente cliente) {
		dao.save(cliente);		
	}

	@Override
	public void editar(Cliente cliente) {
		dao.update(cliente);		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);		
	}

	@Override @Transactional(readOnly = true)
	public Cliente buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Cliente> buscarTodos() {
		
		return dao.findAll();
	}

}
