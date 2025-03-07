package co.edu.uniquindio.poo;

public class Nota {

    private String nombre;
    private double nota;

    public Nota(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }
}
