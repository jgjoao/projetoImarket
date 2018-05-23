package com.example.demo.domain;
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
@Table(name = "produtos")
public class Produto extends AbstractEntity {
	
	@Id

	private Long id;
	@Column
	private String tiposProduto;
	@Column
	private double precoProduto;
	
	@ManyToOne
	private Admin admin;
	@OneToMany(mappedBy="produto")
	private List<ItensDoCarrinho> itens;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}


}
