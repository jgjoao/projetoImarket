
package com.mballem.curso.boot.dao;
import org.springframework.stereotype.Repository;

import com.mballem.curso.boot.domain.*;


@Repository
public class ProdutoDAO extends AbstractDao<Produto, Long> implements ProDAO {

}