package com.example.demo.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.dom4j.tree.AbstractEntity;

@Entity
@Table(name = "status entrega")
public class Entrega extends AbstractEntity {
	
	
	@Id
	
	private long id;
	@Column
	private String statusEntrega;
	
	@OneToOne
	private Vendas vendas;
	
	@OneToMany(mappedBy="entrega")
	private List<Endereco> enderecos;
	


	public String getStatusEntrega() {
		return statusEntrega;
	}

	public void setStatusEntrega(String statusEntrega) {
		this.statusEntrega = statusEntrega;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	

}
