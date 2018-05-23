package com.mballem.curso.Dao;

import java.util.List;

import com.example.demo.domain.Produto;

public interface ProDAO {

	void save(Produto produto );
	void update(Produto produto);
	 void delete(Long id);
	 Produto findById(Long id);
	 List<Produto> findAll();
	
}
