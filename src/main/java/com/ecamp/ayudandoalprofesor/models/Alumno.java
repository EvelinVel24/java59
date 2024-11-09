package main.java.com.ecamp.ayudandoalprofesor.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {
    private String rut;
    private String nombre;
    private List<Integer> notas;
    private Float promedio;
}
