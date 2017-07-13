package br.fpl.dev.beans;

import java.io.Serializable;
import java.util.Date;

public class Pessoa implements Serializable {

	private String nomeCompleto;
	private String cidade;
	private String estado;
	private Date nascimento;
	private char sexo;
	private String estadoCivil;
	private String telefone;
	private String cep;
	private String endereco;
	private Integer numero;
	private String complemento;
	private String bairro;
	private String email;
	private String usuario;
	private String senha;

	public Pessoa() { // Constructor
		
	}
	
	public Pessoa(String nomeCompleto, String cidade, String estado, Date nascimento, char sexo, String estadoCivil,
			String telefone, String cep, String endereco, int numero, String complemento, String bairro, String email,
			String usuario, String senha) { // Full Constructor
		super();
		this.nomeCompleto = nomeCompleto;
		this.cidade = cidade;
		this.estado = estado;
		this.nascimento = nascimento;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.telefone = telefone;
		this.cep = cep;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.email = email;
		this.usuario = usuario;
		this.senha = senha;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	

}
