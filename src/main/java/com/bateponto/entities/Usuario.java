package com.bateponto.entities;

public class Usuario {

	private Long usuarioId;
	private String nome;
	private String login;
	private String senha;
	
	public Usuario(){
	}
	
	public Usuario(String nome, String login, String senha){
		this.login = login;
		this.nome = nome;
		this.senha = senha;
	}

	public Long getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Long usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}