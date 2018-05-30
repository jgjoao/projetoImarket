package com.mballem.curso.boot.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.dom4j.tree.AbstractEntity;

@Entity
@Table(name = "cartao")
public class Cartao extends AbstractEntity{
	
	
	@Id

	private long id;
	@Column
	private int numeroCartao;
	@Column
	private String nomeCartao;
	
	@ManyToOne
	private Cliente cliente;
	@OneToMany (mappedBy="cartao")
	private List<Carrinho> carrinho;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNumeroCartao() {
		return numeroCartao;
	}
	public void setNumeroCartao(int numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	public String getNomeCartao() {
		return nomeCartao;
	}
	public void setNomeCartao(String nomeCartao) {
		this.nomeCartao = nomeCartao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Carrinho> getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(List<Carrinho> carrinho) {
		this.carrinho = carrinho;
	}

	
	
	
	
	
	
	
	
	

}
