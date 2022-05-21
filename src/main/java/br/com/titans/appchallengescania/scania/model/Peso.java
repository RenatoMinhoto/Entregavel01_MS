package br.com.titans.appchallengescania.scania.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Peso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_peso;

	@Column(nullable = false)
	private String peso_mercadoria;

	public Peso() {

	}

	public Peso(Long id_peso, String peso_mercadoria) {
		super();
		this.id_peso = id_peso;
		this.peso_mercadoria = peso_mercadoria;
	}

	public Long getId_peso() {
		return id_peso;
	}

	public void setId_peso(Long id_peso) {
		this.id_peso = id_peso;
	}

	public String getPeso_mercadoria() {
		return peso_mercadoria;
	}

	public void setPeso_mercadoria(String peso_mercadoria) {
		this.peso_mercadoria = peso_mercadoria;
	}

}
