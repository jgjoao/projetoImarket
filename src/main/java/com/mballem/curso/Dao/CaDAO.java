package com.mballem.curso.Dao;

import java.util.List;

import com.example.demo.domain.Carrinho;

public interface CaDAO {
	
	
 

		   void save(Carrinho carrinho );

		    void update(Carrinho carrinho);

		    void delete(Long id);

		    Carrinho findById(Long id);

		    List<Carrinho> findAll();


	
}
