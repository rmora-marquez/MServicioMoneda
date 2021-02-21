package com.example.msmoneda.controlador;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.msmoneda.modelo.Conversion;

@RestController
public class ConversionController {

	public ConversionController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/convertir/de/{from}/a/{to}/cantidad/{quantity}")
	public Conversion getConversion(
			@PathVariable("from") String from,
			@PathVariable("to") String to,
			@PathVariable("quantity") BigDecimal quantity
			) {
		
		Map<String, String> uriVars = new HashMap<String, String>();
		uriVars.put("from", from);
		uriVars.put("to", to);
		ResponseEntity<Conversion> responseEntity = 
				new RestTemplate()
				.getForEntity(
					"http://localhost:8000/intercambio/from/{}/to/{}",
					Conversion.class, uriVars);  
		Conversion response = responseEntity.getBody();
		return new Conversion(response.getId(),
				response.getDe(),
				response.getA(), 
				response.getTipoCambio(), 
				quantity,
				response.getTipoCambio().multiply(quantity),
				response.getPuerto());
	}

}
