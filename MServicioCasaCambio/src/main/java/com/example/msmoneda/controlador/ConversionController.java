package com.example.msmoneda.controlador;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.msmoneda.feign.IntercambioMonedaServiceProxy;
import com.example.msmoneda.modelo.Conversion;
import com.example.msmoneda.modelo.IntercambioMonedaDto;

@RestController
public class ConversionController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public ConversionController() {
		// TODO Auto-generated constructor stub
	}
	
	/*	
	@GetMapping("/convertir/de/{from}/a/{to}/cantidad/{quantity}")
	public Conversion getConversion(
			@PathVariable("from") String from,
			@PathVariable("to") String to,
			@PathVariable("quantity") BigDecimal quantity
			) {
	
		Map<String, String> uriVars = new HashMap<String, String>();
		uriVars.put("from", from);
		uriVars.put("to", to);
		ResponseEntity<IntercambioMonedaDto> responseEntity = 
				new RestTemplate()
				.getForEntity(
					"http://localhost:8000/intercambio/from/{from}/to/{to}",
					IntercambioMonedaDto.class, uriVars);  
		IntercambioMonedaDto response = responseEntity.getBody();
		return new Conversion(response.getId(),
				response.getMonedaOrigen(),
				response.getMonedaDestino(), 
				response.getConversion(), 
				quantity,
				response.getConversion().multiply(quantity),
				response.getPuerto());
				
	}
	
	*/
	@Autowired
	private IntercambioMonedaServiceProxy proxy;
	
	@GetMapping("/convertir/de/{from}/a/{to}/cantidad/{quantity}")
	public Conversion getConversion(
			@PathVariable("from") String from,
			@PathVariable("to") String to,
			@PathVariable("quantity") BigDecimal quantity
			) {
							  
		IntercambioMonedaDto response = proxy.retrieveExchange(from, to);
		logger.debug("{}", response);
		return new Conversion(response.getId(),
				response.getMonedaOrigen(),
				response.getMonedaDestino(), 
				response.getConversion(), 
				quantity,
				response.getConversion().multiply(quantity),
				response.getPuerto());
	}


}
