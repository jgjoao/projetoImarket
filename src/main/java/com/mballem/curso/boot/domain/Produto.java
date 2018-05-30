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
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.dom4j.tree.AbstractEntity;




@SuppressWarnings("serial")
@Entity
@Table(name = "produtos")
public class Produto extends AbstractEntity {
	
	@Id

	private Long id;
	
	@NotBlank(message = "digite algo")
	@Size(min = 3, max = 60, message = "testando")
	@Column(name = "nome", nullable = false, unique = true, length = 60)
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
