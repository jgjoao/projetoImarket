package com.mballem.curso.Dao;

import com.example.demo.domain.Produto;
import org.springframework.stereotype.Repository;


@Repository
public class ProdutoDAO extends AbstractDao<Produto, Long> implements ProDAO {

}