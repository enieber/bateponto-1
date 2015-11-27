package com.bateponto.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bateponto.entities.Usuario;

public class ValidadorCadastroUsuario {
	
	private Usuario usuario = new Usuario();
	
	public ValidadorCadastroUsuario(){
	}
	
	public ValidadorCadastroUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public boolean validaUsuario(){
		if (!validaLogin(usuario.getLogin()))
			return false;
		
		if (!validaSenha(usuario.getSenha()))
			return false;
		
		if (!validaNome(usuario.getNome()))
			return false;
		
		return true;
	}

	public boolean validaLogin(String login) {
		if (login == null || login.isEmpty())
			return false;

		return isSomenteLetrasDiferenteNull(login);
	}

	public boolean validaNome(String nome) {
		if (nome == null || nome.isEmpty())
			return false;

		return isSomenteLetrasDiferenteNull(nome);
	}

	public boolean validaSenha(String senha) {
		return senha != null && !senha.isEmpty();
	}

	private boolean isSomenteLetrasDiferenteNull(String value) {
		if (value == null)
			return false;

		Pattern pattern = Pattern.compile("[0-9]");
		Matcher match = pattern.matcher(value);

		return !match.find();
	}

}
