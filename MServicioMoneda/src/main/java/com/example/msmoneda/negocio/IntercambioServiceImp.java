package com.example.msmoneda.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.msmoneda.data.IntercambioMonedaRepository;
import com.example.msmoneda.dominio.IntercambioMoneda;

@Service
@Transactional
public class IntercambioServiceImp implements IIntercambioService {
	@Autowired
	private IntercambioMonedaRepository exDao;
	
	public IntercambioServiceImp() {
		System.out.println("ExService");
	}

	@Override
	public IntercambioMoneda findByOrigenADestino(String origen, String destino) {
		//System.out.print("Origen: " + origen + " a " );
		//System.out.println("Destion: " + destino);
		return exDao.findByOrigenADetino(origen, destino);
	}
	
	

}
