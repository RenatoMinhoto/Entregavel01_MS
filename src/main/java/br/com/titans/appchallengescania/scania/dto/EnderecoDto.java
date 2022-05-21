package br.com.titans.appchallengescania.scania.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.titans.appchallengescania.scania.model.Endereco;

public class EnderecoDto {
	
	private Long id_endereco;
	
	@NotBlank
	@NotNull
	private String rua;
	
	private String uf;
	
	private String bairro;
	
	private String cep;
	
	private String complemento;
	
	private Long id_cidade;

	public Long getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(Long id_endereco) {
		this.id_endereco = id_endereco;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public Long getId_cidade() {
		return id_cidade;
	}

	public void setId_cidade(Long id_cidade) {
		this.id_cidade = id_cidade;
	}
	
	public void fromEndereco(Endereco endereco) {
		this.rua = endereco.getRua();
		this.uf = endereco.getUf();
		this.bairro = endereco.getBairro();
		this.cep = endereco.getCep();
		this.complemento = endereco.getComplemento();
	}
	

}
