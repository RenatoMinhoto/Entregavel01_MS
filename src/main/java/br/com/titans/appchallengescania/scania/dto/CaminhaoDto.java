package br.com.titans.appchallengescania.scania.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.titans.appchallengescania.scania.model.Caminhao;

public class CaminhaoDto {

	private Long id_caminhao;

	private String modelo;

	@NotBlank
	@NotNull
	private String placa;

	private Long id_funcionario;

	public Long getId_caminhao() {
		return id_caminhao;
	}

	public void setId_caminhao(Long id_caminhao) {
		this.id_caminhao = id_caminhao;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Long getId_funcionario() {
		return id_funcionario;
	}

	public void setId_funcionario(Long id_funcionario) {
		this.id_funcionario = id_funcionario;
	}

	public void fromCaminhao(Caminhao caminhao) {
		this.modelo = caminhao.getModelo();
		this.placa = caminhao.getPlaca();
	}

}
