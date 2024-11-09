package main.java.com.ecamp.ayudandoalprofesor.services;

import main.java.com.ecamp.ayudandoalprofesor.services;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@AllArgsConstructor
@Component
public class Calculadora implements ICalculadora {

    @Autowired
    private List<Alumno> alumnos;

    @Override
    public List<Alumno> calcularPromedios() {
        for (Alumno alumno : alumnos) {
            float sum = 0;
            for (int nota : alumno.getNotas()) {
                sum += nota;
            }
            alumno.setPromedio(sum / alumno.getNotas().size());
        }
        return alumnos;
    }
}
