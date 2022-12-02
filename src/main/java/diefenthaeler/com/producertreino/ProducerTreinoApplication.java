package diefenthaeler.com.producertreino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class ProducerTreinoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerTreinoApplication.class, args);
	}

}
