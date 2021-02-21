package com.example.msmoneda.modelo;

import java.math.BigDecimal;

public class Conversion {
	private Long id;
	private String de;
	private String a;
	private BigDecimal tipoCambio;
	private BigDecimal cantidad;
	private BigDecimal valorCambio;
	private int puerto;

	public Conversion() {
	}

	public Conversion(Long id, String de, String a, BigDecimal tipoCambio, BigDecimal cantidad, BigDecimal valorCambio,
			int puerto) {
		super();
		this.id = id;
		this.de = de;
		this.a = a;
		this.tipoCambio = tipoCambio;
		this.cantidad = cantidad;
		this.valorCambio = valorCambio;
		this.puerto = puerto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public BigDecimal getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(BigDecimal tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getValorCambio() {
		return valorCambio;
	}

	public void setValorCambio(BigDecimal valorCambio) {
		this.valorCambio = valorCambio;
	}

	public int getPuerto() {
		return puerto;
	}

	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}

}
