package com.mballem.curso.boot.domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.dom4j.tree.AbstractEntity;

@Entity
@Table(name = "itens do carrinho")
public class ItensDoCarrinho extends AbstractEntity {
	
	@Id 
	
	private Long id;
	@Column
	private int codigoProduto, codigoCarrinho, quantidadeProduto;
	
	@ManyToOne
	private Carrinho carrinho;
	
	@ManyToOne
	private Produto produto;

	

	

	public int getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public int getCodigoCarrinho() {
		return codigoCarrinho;
	}
	public void setCodigoCarrinho(int codigoCarrinho) {
		this.codigoCarrinho = codigoCarrinho;
	}
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	public Carrinho getCarrinho() {
		return carrinho;
	}
	public void setCarrinho(Carrinho carrinho) {
		this.carrinho = carrinho;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


}
