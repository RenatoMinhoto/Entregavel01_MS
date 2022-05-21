package br.com.titans.appchallengescania.scania.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.titans.appchallengescania.scania.model.Operador;

public class OperadorDto {

	private Long id_funcionario;

	@NotBlank
	@NotNull
	private String tipo_operador;

	private Long id_caminhao;

	public Long getId_funcionario() {
		return id_funcionario;
	}

	public void setId_funcionario(Long id_funcionario) {
		this.id_funcionario = id_funcionario;
	}

	public String getTipo_operador() {
		return tipo_operador;
	}

	public void setTipo_operador(String tipo_operador) {
		this.tipo_operador = tipo_operador;
	}

	public Long getId_caminhao() {
		return id_caminhao;
	}

	public void setId_caminhao(Long id_caminhao) {
		this.id_caminhao = id_caminhao;
	}

	public void fromOperador (Operador operador) {
		this.tipo_operador = operador.getTipo_operador();
	}

}
