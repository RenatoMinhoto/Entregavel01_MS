package br.com.titans.appchallengescania.scania.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.titans.appchallengescania.scania.model.Funcionario;

public class FuncionarioDto {
	
	private Long id_funcionario;
	
	@NotBlank
	@NotNull
	private String nome;
	
	@NotBlank
	@NotNull
	private String email;
	
	@NotBlank
	@NotNull
	private String cpf;
	
	@NotBlank
	@NotNull
	private String sexo;

	public Long getId_funcionario() {
		return id_funcionario;
	}

	public void setId_funcionario(Long id_funcionario) {
		this.id_funcionario = id_funcionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void fromFuncionario (Funcionario funcionario) {
		this.nome = funcionario.getNome();
		this.email = funcionario.getEmail();
		this.cpf = funcionario.getCpf();
		this.sexo = funcionario.getSexo();
	}

}
