package com.mballem.curso.Dao;

import java.util.List;

import com.example.demo.domain.ItensDoCarrinho;

public interface ItenDoCDAO {
	
	 void save(ItensDoCarrinho itencarrinho );
	 void update(ItensDoCarrinho itencarrinho);
	 void delete(Long id);
	 ItensDoCarrinho findById(Long id);
	 List<ItensDoCarrinho> findAll();

}
