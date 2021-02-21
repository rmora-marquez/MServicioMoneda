package com.example.msmoneda.modelo;

import java.math.BigDecimal;

public class IntercambioMonedaDto {
	private Long id;
	private String monedaOrigen;
	private String monedaDestino;
	private BigDecimal conversion;
	private int puerto;
	
	public IntercambioMonedaDto() {
		// TODO Auto-generated constructor stub
	}	

	public IntercambioMonedaDto(Long id, String monedaOrigen, String monedaDestino, BigDecimal conversion) {
		super();
		this.id = id;
		this.monedaOrigen = monedaOrigen;
		this.monedaDestino = monedaDestino;
		this.conversion = conversion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMonedaOrigen() {
		return monedaOrigen;
	}

	public void setMonedaOrigen(String monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}

	public String getMonedaDestino() {
		return monedaDestino;
	}

	public void setMonedaDestino(String monedaDestino) {
		this.monedaDestino = monedaDestino;
	}

	public BigDecimal getConversion() {
		return conversion;
	}

	public void setConversion(BigDecimal conversion) {
		this.conversion = conversion;
	}

	public int getPuerto() {
		return puerto;
	}

	public void setPuerto(int puerto) {
		this.puerto = puerto;
	}
	
}
