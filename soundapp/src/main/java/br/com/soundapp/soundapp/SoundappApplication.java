package br.com.soundapp.soundapp;

import br.com.soundapp.soundapp.principal.Principal;
import br.com.soundapp.soundapp.repository.ArtistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoundappApplication implements CommandLineRunner {
    @Autowired
    private ArtistaRepository repositorio;

    @Override
    public void run(String... args) throws Exception {
        Principal principal = new Principal(repositorio);
        principal.exibeMenu();
    }

    public static void main(String[] args) {
		SpringApplication.run(SoundappApplication.class, args);
	}

}
