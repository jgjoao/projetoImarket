
package com.mballem.curso.boot.dao;

import java.util.List;

import com.mballem.curso.boot.domain.*;

public interface ProDAO {

	void save(Produto produto );
	void update(Produto produto);
	 void delete(Long id);
	 Produto findById(Long id);
	 List<Produto> findAll();
	
}
