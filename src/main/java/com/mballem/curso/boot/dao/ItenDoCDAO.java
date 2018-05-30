
package com.mballem.curso.boot.dao;

import java.util.List;

import com.mballem.curso.boot.domain.*;

public interface ItenDoCDAO {
	
	 void save(ItensDoCarrinho itencarrinho );
	 void update(ItensDoCarrinho itencarrinho);
	 void delete(Long id);
	 ItensDoCarrinho findById(Long id);
	 List<ItensDoCarrinho> findAll();

}
