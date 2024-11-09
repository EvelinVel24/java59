package main.java.com.ecamp.ayudandoalprofesor;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Profesor {

    @Autowired
    private ICalculadora calculadora;

    public void mostrarAlumnosConPromedios() {
        calculadora.calcularPromedios().forEach(System.out::println);
    }
}
