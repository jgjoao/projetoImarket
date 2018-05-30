package com.mballem.curso.boot.service;

import java.util.List;

import com.mballem.curso.boot.domain.*;

public interface AdminService {
	


		void salvar(Admin admin);
		
		void editar(Admin admin);
		
		void excluir(Long id);
		
		Admin buscarPorId(Long id);
		
		List<Admin> buscarTodos();
	}



