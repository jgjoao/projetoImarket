package com.mballem.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mballem.curso.boot.dao.*;
import com.mballem.curso.boot.domain.*;

@Service @Transactional(readOnly = false)
public class AdminServiceImpl  implements AdminService{
	
	



	
	@Autowired
	private AdminDAO dao;

	@Override
	public void salvar(Admin admin) {
		dao.save(admin);		
	}

	@Override
	public void editar(Admin admin) {
		dao.update(admin);		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);		
	}

	@Override @Transactional(readOnly = true)
	public Admin buscarPorId(Long id) {
		
		return dao.findById(id);
	}

	@Override @Transactional(readOnly = true)
	public List<Admin> buscarTodos() {
		
		return dao.findAll();
	}

}


