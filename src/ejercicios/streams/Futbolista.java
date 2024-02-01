package ejercicios.streams;


import java.time.LocalDate;
import java.time.Period;

public class Futbolista {
    private String nombreFutbolista;
    private LocalDate fechaNacimiento;
    private Puesto puesto;
    private String dni;

    public Futbolista(String nombreFutbolista, LocalDate fechaNacimiento,
                      Puesto puesto, String dni) {
        this.nombreFutbolista = nombreFutbolista;
        this.fechaNacimiento = fechaNacimiento;
        this.puesto = puesto;
        this.dni = dni;
    }

    public String getNombreFutbolista() {
        return nombreFutbolista;
    }

    public void setNombreFutbolista(String nombreFutbolista) {
        this.nombreFutbolista = nombreFutbolista;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    public String getDni() {
        return dni;
    }
    //Gabriel Rodrı́guez,21,PORTERO,12345678A

//
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(nombreFutbolista).append(',');
        builder.append(calcularEdad()).append(',');
        builder.append(puesto).append(',');
        builder.append(dni);
        return builder.toString();
    }

    int calcularEdad() {
        Period periodo = Period.between(fechaNacimiento, LocalDate.now());
        int annos = periodo.getYears();
        return annos;
    }
}
