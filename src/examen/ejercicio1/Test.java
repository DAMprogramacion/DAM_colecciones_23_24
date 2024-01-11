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
        System.out.println("-------------------------");
        isbn = "0123456789";
        System.out.printf("Borrando libro con ISBN %s: %B%n",
                isbn, biblioteca.borrarLibroPorISBN(isbn)); //true
        isbn = "0123456789";
        System.out.printf("Borrando libro con ISBN %s: %B%n",
                isbn, biblioteca.borrarLibroPorISBN(isbn)); //false
        System.out.println(biblioteca);
        System.out.println("-------------------------");
        isbn = "0123456782";
        Libro libroPorISBN1 =  biblioteca.obtenerLibroPorISBN(isbn);
        if (libroPorISBN1 != null)
            System.out.printf("%s: %s - %s%n",
                isbn, libroPorISBN1.titulo(), libroPorISBN1.autor());
        isbn = "0123456789";
        Libro libroPorISBN2 =  biblioteca.obtenerLibroPorISBN(isbn);
        if (libroPorISBN2 != null)
            System.out.printf("%s: %s - %s%n",
                isbn, libroPorISBN2.titulo(), libroPorISBN2.autor());
        isbn = "0123456781";
        System.out.printf("Borrando libro con ISBN %s: %B%n",
                isbn, biblioteca.borrarLibroPorISBN(isbn));
        System.out.println("---------LITERATURA----------------");
        Tematica tem1 = Tematica.LITERATURA;
        System.out.println(biblioteca.obtenerLibrosPorTematcia(tem1));
        System.out.println("---------CIENCICAS----------------");
        Tematica tem2 = Tematica.CIENCIAS;
        System.out.println(biblioteca.obtenerLibrosPorTematcia(tem2));
        System.out.println("---------TECNOLOGIA----------------");
        Tematica tem3 = Tematica.TECNOLOGIA;
        System.out.println(biblioteca.obtenerLibrosPorTematcia(tem3));
        Libro libro4 = new Libro("Sistemas Operativos", "Tanembaun",
                Tematica.TECNOLOGIA, "8423456780");
        biblioteca.adquirirLibro(libro4);
        Libro libro5 = new Libro("Guerra y Paz", "Tolstoi",
                Tematica.LITERATURA, "8423456781");
        biblioteca.adquirirLibro(libro5);
        System.out.println(biblioteca);













    }
}
