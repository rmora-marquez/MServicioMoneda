package com.example.msmoneda.dominio;

import java.math.BigDecimal;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "intercambio")
public class IntercambioMoneda implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	
	@Column(name="monedaorigen")
	private String monedaOrigen;
	
	@Column(name="monedadestino")
	private String monedaDestino;
		
	private BigDecimal conversion;
	
	private int puerto;
	
	public IntercambioMoneda() {
	}

	public IntercambioMoneda(Long id, String monedaOrigen, String monedaDestino, BigDecimal conversion) {
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
