package dio.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* Atributo values para se referir a valores definidos no arquivo "application.properties"
Caso não encontre o valor, pode definir valor padrão usando ":" */
@SpringBootApplication
public class SpringPrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPrimeirosPassosApplication.class, args);
	}
	

}
