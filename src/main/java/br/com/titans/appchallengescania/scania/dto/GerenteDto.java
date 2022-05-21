package br.com.titans.appchallengescania.scania.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.titans.appchallengescania.scania.model.Gerente;

public class GerenteDto {

	private Long id_funcionario;
	
	@NotBlank
	@NotNull
	private String tipo_gerente;

	public Long getId_funcionario() {
		return id_funcionario;
	}

	public void setId_funcionario(Long id_funcionario) {
		this.id_funcionario = id_funcionario;
	}

	public String getTipo_gerente() {
		return tipo_gerente;
	}

	public void setTipo_gerente(String tipo_gerente) {
		this.tipo_gerente = tipo_gerente;
	}
	
	public void fromGerente (Gerente gerente) {
		this.tipo_gerente = gerente.getTipo_gerente();
	}
	
}
