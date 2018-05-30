
package com.mballem.curso.boot.dao;
import java.util.List;

import com.mballem.curso.boot.domain.*;

public interface CaTDAO {
	
		
	 

			   void save(Cartao cartao );

			    void update(Cartao cartao);

			    void delete(Long id);

			    Cartao findById(Long id);

			    List<Cartao> findAll();

	
		
	}

	
	
	


