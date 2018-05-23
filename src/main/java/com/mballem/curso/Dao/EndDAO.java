package com.mballem.curso.Dao;

import java.util.List;

import com.example.demo.domain.Endereco;

public interface EndDAO {

	 void save(Endereco endereco );
	 void update(Endereco endereco);
	 void delete(Long id);
	 Endereco findById(Long id);
	 List<Endereco> findAll();
}
