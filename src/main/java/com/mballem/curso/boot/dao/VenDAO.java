
package com.mballem.curso.boot.dao;

import java.util.List;

import com.mballem.curso.boot.domain.*;

public interface VenDAO {
	
	void save(Vendas venda );
	void update(Vendas venda);
	 void delete(Long id);
	 Vendas findById(Long id);
	 List<Vendas> findAll();
	
	

}
