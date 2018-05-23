package com.mballem.curso.Dao;

import java.util.List;

import com.example.demo.domain.Vendas;

public interface VenDAO {
	
	void save(Vendas venda );
	void update(Vendas venda);
	 void delete(Long id);
	 Vendas findById(Long id);
	 List<Vendas> findAll();
	
	

}
