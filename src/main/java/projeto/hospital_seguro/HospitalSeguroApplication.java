package projeto.hospital_seguro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class HospitalSeguroApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalSeguroApplication.class, args);
	}

}
