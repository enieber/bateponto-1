package com.bateponto.entities;

import java.util.Calendar;

public class HoraPonto {

	private Long horaPontoId;
	private Calendar horaEntradaMatutino;
	private Calendar horaEntradaVespertino;
	private Calendar horaSaidaMatutino;
	private Calendar horaSaidaVespertino;
	private Usuario usuario;

	public Long getHoraPontoId() {
		return horaPontoId;
	}

	public void setHoraPontoId(Long horaPontoId) {
		this.horaPontoId = horaPontoId;
	}

	public Calendar getHoraEntradaMatutino() {
		return horaEntradaMatutino;
	}

	public void setHoraEntradaMatutino(Calendar horaEntradaMatutino) {
		this.horaEntradaMatutino = horaEntradaMatutino;
	}

	public Calendar getHoraEntradaVespertino() {
		return horaEntradaVespertino;
	}

	public void setHoraEntradaVespertino(Calendar horaEntradaVespertino) {
		this.horaEntradaVespertino = horaEntradaVespertino;
	}

	public Calendar getHoraSaidaMatutino() {
		return horaSaidaMatutino;
	}

	public void setHoraSaidaMatutino(Calendar horaSaidaMatutino) {
		this.horaSaidaMatutino = horaSaidaMatutino;
	}

	public Calendar getHoraSaidaVespertino() {
		return horaSaidaVespertino;
	}

	public void setHoraSaidaVespertino(Calendar horaSaidaVespertino) {
		this.horaSaidaVespertino = horaSaidaVespertino;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
