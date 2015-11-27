package com.bateponto.model;

import org.junit.Assert;
import org.junit.Test;

import com.bateponto.entities.Usuario;

public class ValidadorCadastroUsuarioTest {
		
	@Test
	public void helloTest(){
		Assert.assertEquals(false, false);
	}
	
	@Test
	public void deveriaRetornaFalsoSeLoginUsuarioFormularioForNulo(){
		ValidadorCadastroUsuario cadastro = new ValidadorCadastroUsuario();
		String login = null;
		Assert.assertEquals(false, cadastro.validaLogin(login));
	}
	
	@Test
	public void deveriaRetornaFalsoSeNomeUsuarioFormularioForNulo(){
		ValidadorCadastroUsuario cadastro = new ValidadorCadastroUsuario();
		String nome = null;
		Assert.assertEquals(false, cadastro.validaNome(nome));
	}
	
	@Test
	public void deveriaRetornaFalsoSeSenhaUsuarioFormularioForNulo(){
		ValidadorCadastroUsuario cadastro = new ValidadorCadastroUsuario();
		String senha = null;
		Assert.assertEquals(false, cadastro.validaSenha(senha));
	}
	
	@Test
	public void deveriaRetornaFalsoSeLoginUsuarioFormularioForDiferenteDeLetras(){
		ValidadorCadastroUsuario cadastro = new ValidadorCadastroUsuario();
		String login = "1564648";
		Assert.assertEquals(false, cadastro.validaLogin(login));
	}
	
	@Test
	public void deveriaRetornaFalsoSeNomeUsuarioFormularioForDiferenteDeLetras(){
		ValidadorCadastroUsuario cadastro = new ValidadorCadastroUsuario();
		String nome = "1564648";
		Assert.assertEquals(false, cadastro.validaNome(nome));
	}
	
	@Test
	public void deveriaRetornaFalsoSeNomeUsuarioFormularioForVazio(){
		ValidadorCadastroUsuario cadastro = new ValidadorCadastroUsuario();
		String nome = "";
		Assert.assertEquals(false, cadastro.validaNome(nome));
	}
	
	@Test
	public void deveriaRetornaFalsoSeLoginUsuarioFormularioForVazio(){
		ValidadorCadastroUsuario cadastro = new ValidadorCadastroUsuario();
		String login = "";
		Assert.assertEquals(false, cadastro.validaLogin(login));
	}
	
	@Test
	public void deveriaRetornaFalsoSeSenhaUsuarioFormularioForVazio(){
		ValidadorCadastroUsuario cadastro = new ValidadorCadastroUsuario();
		String senha = "";
		Assert.assertEquals(false, cadastro.validaSenha(senha));
	}
	
	@Test
	public void deveRetornarVerdadeiroSeUsuarioValido(){
		Usuario usuario = new Usuario("RAPHAEL REZZIERI", "RAPHAEL", "12345");
		ValidadorCadastroUsuario formulario = new ValidadorCadastroUsuario(usuario);		
		Assert.assertEquals(true, formulario.validaUsuario());
	}

}
