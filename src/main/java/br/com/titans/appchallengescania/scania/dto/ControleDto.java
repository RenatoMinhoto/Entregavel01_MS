package br.com.titans.appchallengescania.scania.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.titans.appchallengescania.scania.model.Controle;

public class ControleDto {

	private Long id_controle;

	@NotBlank
	@NotNull
	private String tarefas;

	private String status;

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

	public void fromControle(Controle controle) {
		this.tarefas = controle.getTarefas();
		this.status = controle.getStatus();
	}

}
