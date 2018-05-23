package com.example.demo.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.dom4j.tree.AbstractEntity;



@Entity
@Table(name = "carrinho")
public class Carrinho extends AbstractEntity {
	
	@Id 
	 
	private Long id;
	
	@ManyToOne
	private Cliente cliente;
	
	@OneToOne
	private Vendas venda;
	
	@OneToMany(mappedBy="carrinho")
	private List<ItensDoCarrinho> itensDoCarrinho;
	
	@ManyToOne
	private Cartao cartao;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vendas getVenda() {
		return venda;
	}
	public void setVenda(Vendas venda) {
		this.venda = venda;
	}
	public List<ItensDoCarrinho> getItensDoCarrinho() {
		return itensDoCarrinho;
	}
	public void setItensDoCarrinho(List<ItensDoCarrinho> itensDoCarrinho) {
		this.itensDoCarrinho = itensDoCarrinho;
	}
	public Cartao getCartao() {
		return cartao;
	}
	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}
	
	
	
	
	

}
