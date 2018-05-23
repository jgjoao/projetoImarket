	package com.mballem.curso.Dao;
	
	import java.util.List;
	import com.example.demo.domain.Cliente;

public interface ClDAO {

	
void save(Cliente cliente );
void update(Cliente cliente);
 void delete(Long id);
 Cliente findById(Long id);
 List<Cliente> findAll();



}
			


		
	

