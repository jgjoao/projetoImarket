package com.mballem.curso.Service;

import com.example.demo.domain.Admin;
import java.util.List;

public interface AdminService {
	


		void salvar(Admin admin);
		
		void editar(Admin admin);
		
		void excluir(Long id);
		
		Admin buscarPorId(Long id);
		
		List<Admin> buscarTodos();
	}



