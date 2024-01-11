package ejercicios.listas;

import java.time.LocalDate;
import java.time.Period;

public class EjemploFechas {
    public static void main(String[] args) {
        LocalDate fechaActual = LocalDate.now();
        System.out.println(fechaActual);
        int anno = fechaActual.getYear();
        int mes  = fechaActual.getMonthValue();
        int dia  = fechaActual.getDayOfMonth();
        System.out.printf("Fecha actual: %d-%d-%d%n", dia, mes, anno);

        LocalDate fechaNacimiento = LocalDate.of(2000, 2, 10);
        System.out.println(fechaNacimiento);

        int annoPersona = getAnnoPersona(fechaNacimiento);
        System.out.printf("Esa persona tiene %d años%n", annoPersona);
    }

    private static int getAnnoPersona(LocalDate fechaNacimiento) {
        Period periodo = Period.between(fechaNacimiento, LocalDate.now());
        int annoPersona = periodo.getYears();
        return annoPersona;
    }

}
