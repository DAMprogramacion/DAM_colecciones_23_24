package ejercicios.listas;

import java.time.LocalDate;

public record Alumno(String nombreAlumno, String apellidos, LocalDate fechaNacimiento,
                     String dni) {
    //12345678Z,garcı́a fernández,marı́a del carmen,10/10/2000
    @Override
    public String toString() {
        return String.format("%s,%s,%s,%d/%d/%d", dni, apellidos, nombreAlumno,
                fechaNacimiento.getDayOfMonth(), fechaNacimiento.getMonthValue(),
                fechaNacimiento.getYear());
    }
}
