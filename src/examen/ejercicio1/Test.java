package examen.ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Libro libro = new Libro("El Quijote", "Cevantes",
                Tematica.LITERATURA, "0123456789");
        System.out.println(libro.titulo());
        System.out.println(libro);
        String tematica = "Tecnología";
        System.out.println(tematica + " " + Helper.esCorrectaTematica(tematica));
        String isbn = "8423456789";
        System.out.println(isbn + " " + Helper.validarISBN(isbn));
        System.out.println("======BIBLIOTECA==========");
        String nombreBiblioteca = "Xauen";
        Libro libro1 = new Libro("La toeoría de la relatividad", "Einstein",
                Tematica.CIENCIAS, "0123456780");
        Libro libro2 = new Libro("Tecnología industrial", "Rodríguez",
                Tematica.TECNOLOGIA, "0123456781");
        List<Libro> libros = new ArrayList<>();
        libros.add(libro); libros.add(libro1); libros.add(libro2);
        Biblioteca biblioteca = new Biblioteca(nombreBiblioteca, libros);
        System.out.println(biblioteca);
        Libro libro3 = new Libro("La Celestina", "Rojas",
                Tematica.LITERATURA, "0123456782");
        biblioteca.adquirirLibro(libro3);
        System.out.println("-------------------------");
        System.out.println(biblioteca);
    }
}
