package main.java.com.ecamp.ayudandoalprofesor;

import main.java.com.ecamp.ayudandoalprofesor.Profesor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AyudandoalprofesorApplication implements CommandLineRunner {

    @Autowired
    private Profesor profesor;

    public static void main(String[] args) {
        SpringApplication.run(AyudandoalprofesorApplication.class, args);
    }

    @Override
    public void run(String... args) {
        profesor.mostrarAlumnosConPromedios();
    }
}

