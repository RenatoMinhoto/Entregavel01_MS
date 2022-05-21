package br.com.titans.appchallengescania.scania.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Operador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_funcionario;

	@Column(nullable = false)
	private String tipo_operador;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_caminhao;

	public Operador() {

	}

	public Operador(Long id_funcionario, String tipo_operador, Long id_caminhao) {
		super();
		this.id_funcionario = id_funcionario;
		this.tipo_operador = tipo_operador;
		this.id_caminhao = id_caminhao;
	}

	public Long get_id_funcionario() {
		return id_funcionario;
	}

	public void set_id_funcionario(Long id_funcionario) {
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

	
}
