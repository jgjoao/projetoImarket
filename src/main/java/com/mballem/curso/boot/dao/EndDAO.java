
package com.mballem.curso.boot.dao;

import java.util.List;

import com.mballem.curso.boot.domain.*;

public interface EndDAO {

	 void save(Endereco endereco );
	 void update(Endereco endereco);
	 void delete(Long id);
	 Endereco findById(Long id);
	 List<Endereco> findAll();
}
