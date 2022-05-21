package br.com.titans.appchallengescania.scania.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Caminhao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_caminhao;

	private String modelo;

	@Column(nullable = false)
	private String placa;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_funcionario;

	public Caminhao() {

	}

	public Caminhao(Long id_caminhao, String modelo, String placa, Long id_funcionario) {
		super();
		this.id_caminhao = id_caminhao;
		this.modelo = modelo;
		this.placa = placa;
		this.id_funcionario = id_funcionario;
	}

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

}
