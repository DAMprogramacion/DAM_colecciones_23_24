package ejercicios.diccionarios;

import java.time.LocalDate;

public record Alumno1(String nombreAlumno, String apellidos, LocalDate fechaNacimiento) {

    //12345678Z,garcı́a fernández,marı́a del carmen,10/10/2000
    @Override
    public String toString() {
        return String.format("%s,%s,%d/%d/%d", apellidos, nombreAlumno,
                fechaNacimiento.getDayOfMonth(), fechaNacimiento.getMonthValue(),
                fechaNacimiento.getYear());
    }

}
