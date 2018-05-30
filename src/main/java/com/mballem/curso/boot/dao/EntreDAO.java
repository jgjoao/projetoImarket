
package com.mballem.curso.boot.dao;

import java.util.List;

import com.mballem.curso.boot.domain.*;

public interface EntreDAO {
	
	
 void save(Entrega entrega );
 void update(Entrega entrega);
 void delete(Long id);
 Entrega findById(Long id);
 List<Entrega> findAll();


}
