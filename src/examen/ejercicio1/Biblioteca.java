package examen.ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Biblioteca {
    private String nombreBiblioteca;
    private List<Libro> libros;  //colección, determina que es una compisición

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
    public boolean borrarLibroPorISBN(String isbn){
        for (Libro libro : libros) {
            if (libro.isbn().equals(isbn))
                return libros.remove(libro);
        }
        return false;
    }
    public Libro obtenerLibroPorISBN(String isbn) {
        for (Libro libro : libros) {
            if (libro.isbn().equals(isbn))
                return libro;
        }
        return null;
    }
    public List<Libro> obtenerLibrosPorTematica(Tematica tematica) {
        /*List<Libro> librosPorTematica = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.tematica().equals(tematica))
                librosPorTematica.add(libro);
        }
        return librosPorTematica;*/
        return  libros.stream()
                .filter(libro -> libro.tematica().equals(tematica))
                .collect(Collectors.toList());
    }
   public List<Libro> obtenerLibrosCastellano() {
       /* List<Libro> librosCastellanos = new ArrayList<>();
        for (Libro libro : libros)
            if (libro.isbn().startsWith("84"))
                librosCastellanos.add(libro);

        return librosCastellanos;*/
       return  libros.stream()
               .filter(libro -> libro.isbn().startsWith("84"))
               .toList();

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
