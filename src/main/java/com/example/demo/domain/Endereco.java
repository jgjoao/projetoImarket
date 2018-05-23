package com.example.demo.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.dom4j.tree.AbstractEntity;

@Entity
@Table(name = "endereco")
public class Endereco extends AbstractEntity {
	
	
	@Id
	
	private long id;
	@Column
	private String rua;
	@Column
	private String bairro;
	@Column
	private int cep;
	@Column
	private String complemento;
	
	@ManyToOne
	private Cliente cliente;
	@ManyToOne
	private Entrega entrega;
	
	@OneToOne
	private Vendas venda;

	public Vendas getVenda() {
		return venda;
	}
	public void setVenda(Vendas venda) {
		this.venda = venda;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Entrega getEntrega() {
		return entrega;
	}
	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}
	
	public Long getId() {
	
		return id;
	}

	public void setId(Long id) {
		this.id = id;
		
	}
	

	
	
	
	
	
}
	
	

