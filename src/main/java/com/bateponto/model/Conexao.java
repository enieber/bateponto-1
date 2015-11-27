package com.bateponto.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	private Connection conn;

	public Conexao() {
		initComponets();
	}

	private void initComponets() {
		try {
			String url = "jdbc:postgresql://localhost:5432/mboss";
			String usuario = "banco";
			String senha = "123456";
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, usuario, senha);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return conn;
	}

}
