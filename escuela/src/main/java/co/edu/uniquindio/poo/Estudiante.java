package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombres;
    private int edad;
    private List<Nota> listNotas;

    public Estudiante(String nombres, int edad) {
        this.nombres = nombres;
        this.edad = edad;
        this.listNotas = new ArrayList<Nota>();
    }

    public void registrarNota(Nota nota) {
        listNotas.add(nota);
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombres='" + nombres + '\'' +
                ", edad=" + edad +
                '}';
    }
}

