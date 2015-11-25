package com.bateponto.model;

import org.junit.Assert;
import org.junit.Test;

public class CadastroUsuarioTest {
		
	@Test
	public void helloTest(){
		Assert.assertEquals(false, false);
	}
	
	@Test
	public void deveriaRetornaFalsoSeLoginUsuarioFormularioForNulo(){
		FormularioCadastroUsuario cadastro = new FormularioCadastroUsuario();
		String login = null;
		Assert.assertEquals(false, cadastro.validaLogin(login));
	}
	
	@Test
	public void deveriaRetornaFalsoSeNomeUsuarioFormularioForNulo(){
		FormularioCadastroUsuario cadastro = new FormularioCadastroUsuario();
		String nome = null;
		Assert.assertEquals(false, cadastro.validaNome(nome));
	}
	
	@Test
	public void deveriaRetornaFalsoSeSenhaUsuarioFormularioForNulo(){
		FormularioCadastroUsuario cadastro = new FormularioCadastroUsuario();
		String senha = null;
		Assert.assertEquals(false, cadastro.validaSenha(senha));
	}
	
	@Test
	public void deveriaRetornaFalsoSeLoginUsuarioFormularioForDiferenteDeString(){
		FormularioCadastroUsuario cadastro = new FormularioCadastroUsuario();
		String login = "1564648";
		Assert.assertEquals(false, cadastro.validaLogin(login));
	}
	
	@Test
	public void deveriaRetornaFalsoSeNomeUsuarioFormularioForDiferenteDeString(){
		FormularioCadastroUsuario cadastro = new FormularioCadastroUsuario();
		String nome = "1564648";
		Assert.assertEquals(false, cadastro.validaNome(nome));
	}
	
	@Test
	public void deveriaRetornaFalsoSeNomeUsuarioFormularioForVazio(){
		FormularioCadastroUsuario cadastro = new FormularioCadastroUsuario();
		String nome = "";
		Assert.assertEquals(false, cadastro.validaNome(nome));
	}
	
	@Test
	public void deveriaRetornaFalsoSeLoginUsuarioFormularioForVazio(){
		FormularioCadastroUsuario cadastro = new FormularioCadastroUsuario();
		String login = "";
		Assert.assertEquals(false, cadastro.validaLogin(login));
	}
	
	@Test
	public void deveriaRetornaFalsoSeSenhaUsuarioFormularioForVazio(){
		FormularioCadastroUsuario cadastro = new FormularioCadastroUsuario();
		String senha = "";
		Assert.assertEquals(false, cadastro.validaSenha(senha));
	}

}
