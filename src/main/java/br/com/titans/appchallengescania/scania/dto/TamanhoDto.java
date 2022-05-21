package br.com.titans.appchallengescania.scania.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.titans.appchallengescania.scania.model.Tamanho;

public class TamanhoDto {

	private Long id_tamanho;

	@NotNull
	@NotBlank
	private String tamanho_mercadoria;

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
	
	public void fromTamanho(Tamanho tamanho) {
		this.tamanho_mercadoria = tamanho.getTamanho_mercadoria();
	}

}
