package com.example.msmoneda.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.msmoneda.modelo.IntercambioMonedaDto;

@FeignClient(name="intercambio-service", url = "localhost:8000")
public interface IntercambioMonedaServiceProxy {
	@GetMapping("/intercambio/from/{origen}/to/{destino}")
	IntercambioMonedaDto retrieveExchange(
			@PathVariable("origen") String origen,
			@PathVariable("destino") String destino
			);
}
