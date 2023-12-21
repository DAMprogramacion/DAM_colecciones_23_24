package teoria.fechas;

import java.time.LocalDate;

public class Persona {
    private String nombrePersona;
    private String apellidos;
    private String dni;
    private LocalDate fechaNacimiento;

    public Persona(String nombrePersona, String apellidos, String dni,
                   LocalDate fechaNacimiento) {
        this.nombrePersona = nombrePersona;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombrePersona, String apellidos, LocalDate fechaNacimiento) {
        this.nombrePersona = nombrePersona;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDni() {
        return dni;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    //11111111H,garcía fernández,esperanza,20/12/2000

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%d/%d/%d", dni, apellidos, nombrePersona,
                fechaNacimiento.getDayOfMonth(), fechaNacimiento.getMonthValue(),
                fechaNacimiento.getYear());
    }

    public static void main(String[] args) {
        Persona persona = new Persona("esperanza", "garcía fernández", "11111111H",
                 LocalDate.of(2000, 12, 20));
        System.out.println(persona);
    }







}
