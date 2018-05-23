package com.mballem.curso.Dao;

import java.util.List;

import com.example.demo.domain.Entrega;

public interface EntreDAO {
	
	
 void save(Entrega entrega );
 void update(Entrega entrega);
 void delete(Long id);
 Entrega findById(Long id);
 List<Entrega> findAll();


}
