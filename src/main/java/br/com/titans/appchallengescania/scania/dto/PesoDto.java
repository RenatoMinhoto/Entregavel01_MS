package br.com.titans.appchallengescania.scania.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.titans.appchallengescania.scania.model.Peso;

public class PesoDto {
	
	private Long id_peso;
	
	@NotNull
	@NotBlank
	private String peso_mercadoria;

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
	
	public void fromPeso(Peso peso) {
		this.peso_mercadoria = getPeso_mercadoria();
	}

}
