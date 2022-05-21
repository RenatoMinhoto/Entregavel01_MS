package br.com.titans.appchallengescania.scania.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gerente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_funcionario;
	
	
	@Column(nullable = false)
	private String tipo_gerente;
	
	public Gerente() {
		
	}

	public Gerente(Long id_funcionario, String tipo_gerente) {
		super();
		this.id_funcionario = id_funcionario;
		this.tipo_gerente = tipo_gerente;
	}

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

	
	
}
