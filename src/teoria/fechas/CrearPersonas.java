package teoria.fechas;

import java.time.LocalDate;
import java.util.Scanner;

public class CrearPersonas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Dame tus apellidos");
        String apellidos = sc.nextLine();
        String dni = "";
        do {
            System.out.println("Dame tu DNI");
            dni = sc.nextLine();
        } while (!comprobarDNI(dni));
        System.out.println("Dame tu fecha nacimineto dd-mm-aaaa");
        String sFecha = sc.nextLine();
        LocalDate fechaNacimiento = crearFechaNacimiento(sFecha);
        Persona persona = new Persona(nombre, apellidos, dni, fechaNacimiento);
        System.out.println(persona);
    }

    private static LocalDate crearFechaNacimiento(String sFecha) {
        //recibo 20-12-2000
        String[] tokens = sFecha.split("-");
        int dia  = Integer.parseInt(tokens[0]);
        int mes  = Integer.parseInt(tokens[1]);
        int anno = Integer.parseInt(tokens[2]);
        return LocalDate.of(anno, mes, dia);
    }
    private static boolean comprobarDNI (String dni) {
        return dni.matches("[0-9]{8}[a-zA-Z]") && esValidaLetra(dni);
    }

    private static boolean esValidaLetra(String dni) {
        char letra1 = dni.toLowerCase().charAt(dni.length() - 1);
        String sNumero = dni.substring(0, dni.length() - 1);
        int    iNumero = Integer.parseInt(sNumero);
        int      resto = iNumero % 23;
        char[] letras = {'t', 'r', 'w'};
        return letra1 == letras[resto];
    }
}
