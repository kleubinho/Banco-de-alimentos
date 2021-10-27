package br.com.exemplo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idalimento;
	
	@Column(nullable = false, length = 20)
	private String nomealimento;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private Double preco;

	public Long getIdalimento() {
		return idalimento;
	}

	public void setIdalimento(Long idalimento) {
		this.idalimento = idalimento;
	}

	public String getNomealimento() {
		return nomealimento;
	}

	public void setNomealimento(String nomealimento) {
		this.nomealimento = nomealimento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
	
}
