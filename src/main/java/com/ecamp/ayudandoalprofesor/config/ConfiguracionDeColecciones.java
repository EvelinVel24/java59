package main.java.com.ecamp.ayudandoalprofesor.config;

import main.java.com.ecamp.ayudandoalprofesor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class ConfiguracionDeColecciones {

    @Bean(name = "listaAlumnosPoblada")
    public List<Alumno> getAlumnosList() {
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("15562563", "HeathSchowalter", Arrays.asList(6,7,2), 0f));
        alumnos.add(new Alumno("13635430", "RozellaBartoletti", Arrays.asList(3,2,6,6,6,4,3,3,4), 0f));
        // Agregar los demás alumnos...
        return alumnos;
    }
}
