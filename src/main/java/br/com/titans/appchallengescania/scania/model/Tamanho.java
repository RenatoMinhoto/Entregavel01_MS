package br.com.titans.appchallengescania.scania.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tamanho {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_tamanho;

	@Column(nullable = false)
	private String tamanho_mercadoria;

	public Tamanho() {

	}

	public Tamanho(Long id_tamanho, String tamanho_mercadoria) {
		super();
		this.id_tamanho = id_tamanho;
		this.tamanho_mercadoria = tamanho_mercadoria;
	}

	public Long getId_tamanho() {
		return id_tamanho;
	}

	public void setId_tamanho(Long id_tamanho) {
		this.id_tamanho = id_tamanho;
	}

	public String getTamanho_mercadoria() {
		return tamanho_mercadoria;
	}

	public void setTamanho_mercadoria(String tamanho_mercadoria) {
		this.tamanho_mercadoria = tamanho_mercadoria;
	}

}
