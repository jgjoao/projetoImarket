package com.mballem.curso.boot.dao;

import java.util.List;

import com.mballem.curso.boot.domain.Admin;

public interface AdDao {


		   void save(Admin admin );

		    void update(Admin admin);

		    void delete(Long id);

		    Admin findById(Long id);

		    List<Admin> findAll();



}
