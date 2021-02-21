package com.example.msmoneda.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.msmoneda.dominio.IntercambioMoneda;

public interface IntercambioMonedaRepository 
extends JpaRepository<IntercambioMoneda, Long> {

	@Query("Select exch from IntercambioMoneda exch "
			+ "WHERE exch.monedaOrigen = ?1 "
			+ "AND   exch.monedaDestino = ?2")
	IntercambioMoneda findByOrigenADetino(String from, String to);
}
