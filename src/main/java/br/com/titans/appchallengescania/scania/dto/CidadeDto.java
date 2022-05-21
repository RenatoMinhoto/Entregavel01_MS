package br.com.titans.appchallengescania.scania.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.titans.appchallengescania.scania.model.Cidade;

public class CidadeDto {

	private Long id_cidade;
	
	@NotBlank
	@NotNull
	private String nome_cidade;

	public Long getId_cidade() {
		return id_cidade;
	}

	public void setId_cidade(Long id_cidade) {
		this.id_cidade = id_cidade;
	}

	public String getNome_cidade() {
		return nome_cidade;
	}

	public void setNome_cidade(String nome_cidade) {
		this.nome_cidade = nome_cidade;
	}
	
	public void fromCidade(Cidade cidade) {
		this.nome_cidade = cidade.getNome_cidade();
	}
	
}
