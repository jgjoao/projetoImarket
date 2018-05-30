package com.mballem.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.mballem.curso.boot.dao.*;
import com.mballem.curso.boot.domain.*;

	
	
	
	public class CartaoServiceImpl implements CartaoService  {
		
		
		
		@Autowired
		private CartaoDAO dao;

		@Override
		public void salvar(Cartao cartao) {
			dao.save(cartao);		
		}

		@Override
		public void editar(Cartao cartao) {
			dao.update(cartao);		
		}

		@Override
		public void excluir(Long id) {
			dao.delete(id);		
		}

		@Override @Transactional(readOnly = true)
		public Cartao buscarPorId(Long id) {
			
			return dao.findById(id);
		}

		@Override @Transactional(readOnly = true)
		public List<Cartao> buscarTodos() {
			
			return dao.findAll();
		}

		

	}
	
	

