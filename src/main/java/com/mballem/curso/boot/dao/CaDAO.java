package com.mballem.curso.boot.dao;

import java.util.List;

import com.mballem.curso.boot.domain.*;

public interface CaDAO {
	
	
 

		   void save(Carrinho carrinho );

		    void update(Carrinho carrinho);

		    void delete(Long id);

		    Carrinho findById(Long id);

		    List<Carrinho> findAll();


	
}
