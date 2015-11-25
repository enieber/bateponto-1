package com.bateponto.entities;

public class Ponto {

	private Long pontoId;
	private HoraPonto horaPonto;
	private String justificativa;
	private Usuario usuario;

	public Long getPontoId() {
		return pontoId;
	}

	public void setPontoId(Long pontoId) {
		this.pontoId = pontoId;
	}

	public HoraPonto getHoraPonto() {
		return horaPonto;
	}

	public void setHoraPonto(HoraPonto horaPonto) {
		this.horaPonto = horaPonto;
	}

	public String getJustificativa() {
		return justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
