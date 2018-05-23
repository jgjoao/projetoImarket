package com.mballem.curso.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Entrega;
import com.mballem.curso.Dao.EntregaDAO;

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


