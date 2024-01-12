package ejercicios.listas;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Alumno[] alumnos = new Alumno[5];
        alumnos[0] = new Alumno("gabriel", "romero abolafia",
                LocalDate.of(2000, 12, 31), "12345678a");
        alumnos[1] = new Alumno("luis", "abolafia abolafia",
                LocalDate.of(2007, 12, 3), "12345678b");
        alumnos[2] = new Alumno("pedro", "romero romero",
                LocalDate.of(2000, 2, 29), "12345678c");
        alumnos[3] = new Alumno("luisa", "molina molina",
                LocalDate.of(2000, 1, 3), "12345678d");
        alumnos[4] = new Alumno("gabriela", "pérez abolafia",
                LocalDate.of(2000, 11, 11), "12345678e");
        //System.out.println(Arrays.toString(alumnos));
        Instituto instituto = new Instituto("VC");
        //System.out.println(instituto);
        for (Alumno alumno : alumnos) {
            instituto.addAlumno(alumno);
        }
        List<Alumno> lista0 = instituto.getAlumnos();
        for (Alumno alumno : lista0) {
            System.out.println(alumno);
        }
        System.out.println("=====Eliminando alumno========");
        String dni = "12345678A";
        boolean eliminado1 = instituto.eliminarAlumno(dni);
        System.out.printf("Eliminado alumno con dni: %s? %B%n", dni, eliminado1);
        dni = "11223344A";
        boolean eliminado2 = instituto.eliminarAlumno(dni);
        System.out.printf("Eliminado alumno con dni: %s? %B%n", dni, eliminado2);
        System.out.println("=====Buscando alumno========");
        dni = "12345678A";
        Alumno encontrado1 = instituto.buscarAlumno(dni);
        if (encontrado1 != null)
            System.out.printf("Encontrado alumno con dni: %s? %s%n", dni, encontrado1.apellidos());
        else
            System.out.printf("El alumno con dni %s no existe%n", dni);
        dni = "12345678e";
        Alumno encontrado2 = instituto.buscarAlumno(dni);
        if (encontrado2 != null)
            System.out.printf("Encontrado alumno con dni: %s? %s%n", dni, encontrado2.apellidos());
        else
            System.out.printf("El alumno con dni %s no existe%n", dni);

    }
}
