package br.com.titans.appchallengescania.scania.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Controle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_controle;

	@Column(nullable = false)
	private String tarefas;

	private String status;

	public Controle() {

	}

	public Controle(Long id_controle, String tarefas, String status) {
		super();
		this.id_controle = id_controle;
		this.tarefas = tarefas;
		this.status = status;
	}

	public Long getId_controle() {
		return id_controle;
	}

	public void setId_controle(Long id_controle) {
		this.id_controle = id_controle;
	}

	public String getTarefas() {
		return tarefas;
	}

	public void setTarefas(String tarefas) {
		this.tarefas = tarefas;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
