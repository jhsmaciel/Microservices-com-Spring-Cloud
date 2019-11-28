package br.com.alura.microservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.microservice.loja.dto.InfoFornecedorDTO;

@FeignClient("fornecedor")
public interface FornecedorCliente {
	@RequestMapping("/info/{estado}")
	@Bean
	InfoFornecedorDTO getInfoPorEstado(@PathVariable String estado);
}
