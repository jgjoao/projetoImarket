package com.mballem.curso.Dao;
import java.util.List;

import com.example.demo.domain.Cartao;

public interface CaTDAO {
	
		
	 

			   void save(Cartao cartao );

			    void update(Cartao cartao);

			    void delete(Long id);

			    Cartao findById(Long id);

			    List<Cartao> findAll();

	
		
	}

	
	
	


