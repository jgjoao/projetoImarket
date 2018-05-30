
package com.mballem.curso.boot.dao;
	
	import java.util.List;

	import com.mballem.curso.boot.domain.*;

public interface ClDAO {

	
void save(Cliente cliente );
void update(Cliente cliente);
 void delete(Long id);
 Cliente findById(Long id);
 List<Cliente> findAll();



}
			


		
	

