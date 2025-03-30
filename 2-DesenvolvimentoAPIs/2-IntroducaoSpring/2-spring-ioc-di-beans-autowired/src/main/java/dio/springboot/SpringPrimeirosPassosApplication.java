package dio.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dio.springboot.app.ConversorJson;
import dio.springboot.app.ViaCepResponse;

/* Componenet é utilizado quando eu tenho acesso ao código fonte e Bean é utilizado quando eu não tenho acesso */
@SpringBootApplication
public class SpringPrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPrimeirosPassosApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner run(ConversorJson conversor) throws Exception {
		return args -> {
			String json = "{\"cep\": \"01001-000\",\"logradouro\": \"Praça da Sé\",\"localidade\": \"São Paulo\"}";
			ViaCepResponse response = conversor.converter(json);
			System.out.println("Dados do CEP: " + response);
		};
	}

}
