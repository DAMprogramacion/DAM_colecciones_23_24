package examen.ejercicio1;

import java.util.List;

public class Biblioteca {
    private String nombreBiblioteca;
    private List<Libro> libros;

    public Biblioteca(String nombreBiblioteca, List<Libro> libros) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.libros = libros;
    }

    public String getNombreBiblioteca() {
        return nombreBiblioteca;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }
    //CRUD
    public boolean adquirirLibro(Libro libro) {
        return libros.add(libro);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(nombreBiblioteca.toUpperCase()).append('\n').append("===========================\n");
        int contador = 0;
        for (Libro libro : libros){
            builder.append(++contador).append(".- ").append(libro).append('\n');
        }
        return builder.toString();
    }
}
