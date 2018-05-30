package com.mballem.curso.boot.domain;
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
@Table(name = "cliente")
public class Cliente extends AbstractEntity{
	
	@Id 

	private Long id;
	@Column
	private int cpf = 564654654;
	@Column
	private String telefone = "asdas";
	@Column
	private String nome = "pedro";
	@Column
	private String email = "sadjas";
	
	@OneToMany(mappedBy="cliente")
	private List<Endereco> enderecos;
	
	@OneToMany(mappedBy="cliente")
	private List<Cartao> cartoes;
	
	@OneToMany(mappedBy="cliente")
	private List<Carrinho> carrinhos;
	

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
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
	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	public List<Cartao> getCartoes() {
		return cartoes;
	}
	public void setCartoes(List<Cartao> cartoes) {
		this.cartoes = cartoes;
	}
	public List<Carrinho> getCarrinhos() {
		return carrinhos;
	}
	public void setCarrinhos(List<Carrinho> carrinhos) {
		this.carrinhos = carrinhos;
	}
	
	
	
	
	

}
