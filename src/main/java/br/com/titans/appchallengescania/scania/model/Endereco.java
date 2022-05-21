package br.com.titans.appchallengescania.scania.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_endereco;

	@Column(nullable = false)
	private String rua;

	@Column(nullable = false)
	private String uf;

	@Column(nullable = false)
	private String bairro;

	@Column(nullable = false)
	private String cep;

	@Column(nullable = false)
	private String complemento;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_cidade;

	public Endereco() {

	}

	public Endereco(Long id_endereco, String rua, String uf, String bairro, String cep, String complemento,
			Long id_cidade) {
		super();
		this.id_endereco = id_endereco;
		this.rua = rua;
		this.uf = uf;
		this.bairro = bairro;
		this.cep = cep;
		this.complemento = complemento;
		this.id_cidade = id_cidade;
	}

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

}
