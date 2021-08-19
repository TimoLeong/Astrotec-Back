package fr.solutec;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AstrotecBackApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(AstrotecBackApplication.class, args);
		System.out.println("Lancement Terminé");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Début Instruction");
	}

}
