package br.com.titans.appchallengescania.scania.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.titans.appchallengescania.scania.model.Entrega;

public class EntregaDto {

	private Long id_mercadoria;
	
	@NotBlank
	@NotNull
	private String tipo_mercadoria;
	
	private Long id_tamanho;
	
	private Long id_peso;
	
	private Long id_funcionario;
	
	private Long id_endereco;

	public Long getId_mercadoria() {
		return id_mercadoria;
	}

	public void setId_mercadoria(Long id_mercadoria) {
		this.id_mercadoria = id_mercadoria;
	}

	public String getTipo_mercadoria() {
		return tipo_mercadoria;
	}

	public void setTipo_mercadoria(String tipo_mercadoria) {
		this.tipo_mercadoria = tipo_mercadoria;
	}

	public Long getId_tamanho() {
		return id_tamanho;
	}

	public void setId_tamanho(Long id_tamanho) {
		this.id_tamanho = id_tamanho;
	}

	public Long getId_peso() {
		return id_peso;
	}

	public void setId_peso(Long id_peso) {
		this.id_peso = id_peso;
	}

	public Long getId_funcionario() {
		return id_funcionario;
	}

	public void setId_funcionario(Long id_funcionario) {
		this.id_funcionario = id_funcionario;
	}

	public Long getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(Long id_endereco) {
		this.id_endereco = id_endereco;
	}
	
	public void fromEntrega(Entrega entrega) {
		this.tipo_mercadoria = entrega.getTipo_mercadoria();
	}
	
}
