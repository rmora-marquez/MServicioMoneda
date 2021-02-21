package com.example.msmoneda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.msmoneda.dominio.IntercambioMoneda;
import com.example.msmoneda.negocio.IIntercambioService;

@RestController
@RequestMapping(path="/intercambio")
public class IntercambioController {
	@Autowired
	private Environment enviroment;
	@Autowired
	private IIntercambioService service;
	
	public IntercambioController() {
		
	}
	
	@GetMapping("/from/{origen}/to/{destino}")
	public IntercambioMoneda getIntercambio(
			@PathVariable("origen") String from,
			@PathVariable("destino") String to) {
		IntercambioMoneda ex = service.findByOrigenADestino(from, to);
		String puerto = enviroment.getProperty("local.server.port");
		// System.out.println("puerto:" + puerto);
		if(ex != null)
			ex.setPuerto(Integer.parseInt(puerto));
		
		return ex;
	}

}
