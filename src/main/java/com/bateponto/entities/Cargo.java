package com.bateponto.entities;

public class Cargo {

	private Long cargoId;
	private String nome;
	private boolean flexivel;

	public Long getCargoId() {
		return cargoId;
	}

	public void setCargoId(Long cargoId) {
		this.cargoId = cargoId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isFlexivel() {
		return flexivel;
	}

	public void setFlexivel(boolean flexivel) {
		this.flexivel = flexivel;
	}

}
