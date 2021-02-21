package com.example.msmoneda.negocio;

import com.example.msmoneda.dominio.IntercambioMoneda;

public interface IIntercambioService {

	IntercambioMoneda findByOrigenADestino(String origen, String destino);
}
