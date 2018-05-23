package com.example.demo.domain;

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
@Table(name = "Vendas")
public class Vendas extends AbstractEntity {
	
	@Id
	
	private Long id;
	@Column
	private String statusEntrega;
	
	@OneToOne
	private Endereco endereco;
	
	@OneToOne
	private Entrega entregas;
	
	@OneToOne
	private Carrinho carrinho;
	
	
	
	
	/* ******************** */
	
	public String getStatusEntrega() {
		return statusEntrega;
	}
	public void setStatusEntrega(String statusEntrega) {
		this.statusEntrega = statusEntrega;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


	
	
	
	
	
}
