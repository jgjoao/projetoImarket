package com.example.demo.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.dom4j.tree.AbstractEntity;



@Entity
@Table(name = "ADMS")

public class Admin extends AbstractEntity {
		
	@Id
	private long id;
	@Column(name = "nome", nullable = false, unique = true, length = 60)
	private String nome, email;
	@Column
	private int cpf;
	
	@OneToMany(mappedBy="admin")
	private List<Produto> produtos;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
	

}
