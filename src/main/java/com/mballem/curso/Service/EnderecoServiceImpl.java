package com.mballem.curso.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Endereco;
import com.mballem.curso.Dao.EnderecoDAO;

public class EnderecoServiceImpl implements EnderecoService  {
	
	
	
	@Autowired
	private EnderecoDAO dao;

	@Override
	public void salvar(Endereco endereco) {
		dao.save(endereco);		
	}

	@Override
	public void editar(Endereco endereco) {
		dao.update(endereco);		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);		
	}

	@Override @Transactional(readOnly = true)
	public Endereco buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Endereco> buscarTodos() {
		
		return dao.findAll();
	}

	

}