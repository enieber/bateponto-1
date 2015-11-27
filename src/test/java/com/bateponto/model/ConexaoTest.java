package com.bateponto.model;

import org.junit.Assert;
import org.junit.Test;

public class ConexaoTest {
	
	@Test
	public void deveRetornarVerdadeSeConexaoForFeita(){
		Conexao conexao = new Conexao();
		Assert.assertEquals(true, conexao.getConnection() != null);
	}

}
