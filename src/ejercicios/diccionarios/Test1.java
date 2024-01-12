package ejercicios.diccionarios;



import java.time.LocalDate;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        Alumno1[] alumnos = new Alumno1[5];
        alumnos[0] = new Alumno1("gabriel", "romero abolafia", LocalDate.of(2000, 12, 31));
        alumnos[1] = new Alumno1("luis", "abolafia abolafia", LocalDate.of(2007, 12, 3));
        alumnos[2] = new Alumno1("pedro", "romero romero", LocalDate.of(2000, 2, 29));
        alumnos[3] = new Alumno1("luisa", "molina molina", LocalDate.of(2000, 1, 3));
        alumnos[4] = new Alumno1("gabriela", "pérez abolafia", LocalDate.of(2000, 11, 11));
        //System.out.println(Arrays.toString(alumnos));
        Instituto1 instituto = new Instituto1("VC");
        //System.out.println(instituto);
        for (int i = 0; i < alumnos.length; i++) {
            instituto.addAlumno(i + "", alumnos[i]);
        }
        List<Alumno1> alumno1s = instituto.getAlumnos();
        alumno1s.forEach(System.out::println);
        System.out.println("Eliminando alumnos");
        Alumno1 eliminacion1 = instituto.eliminarAlumno("0");
        System.out.println(eliminacion1);
        Alumno1 eliminacion2 = instituto.eliminarAlumno("0");
        System.out.println(eliminacion2);
        System.out.println("Buscando alumnos");
        Alumno1 buscando0 = instituto.eliminarAlumno("0");
        System.out.println(buscando0);
        Alumno1 buscando1 = instituto.eliminarAlumno("1");
        System.out.println(buscando1);
    }

}
