package com.mballem.curso.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.Produto;
import com.mballem.curso.Dao.ProdutoDAO;

public class ProdutoServieImpl implements ProdutoService{
	
	
	
	@Autowired
	private ProdutoDAO dao;

	@Override
	public void salvar(Produto produto) {
		dao.save(produto);		
	}

	@Override
	public void editar(Produto produto) {
		dao.update(produto);		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);		
	}

	@Override @Transactional(readOnly = true)
	public Produto buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Produto> buscarTodos() {
		
		return dao.findAll();
	}

	

}