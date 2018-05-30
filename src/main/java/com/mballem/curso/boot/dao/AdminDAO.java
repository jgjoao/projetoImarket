
package com.mballem.curso.boot.dao;

import org.springframework.stereotype.Repository;


import com.mballem.curso.boot.domain.Admin;

@Repository
public class AdminDAO extends AbstractDao<Admin, Long> implements AdDao {

}
