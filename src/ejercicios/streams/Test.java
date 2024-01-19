package ejercicios.streams;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        //creamos un array de 11 jugadores
        Futbolista[] futbolistas = new Futbolista[11];
        futbolistas[0] = new Futbolista("garcía, juan", LocalDate.of(2000, 10, 10),
                Puesto.PORTERO, "12345678a");
        futbolistas[1] = new Futbolista("gómez, luis", LocalDate.of(2010, 10, 10),
                Puesto.DEFENSA, "12345678b");
        futbolistas[2] = new Futbolista("fernánzdez, marcelo", LocalDate.of(2001, 10, 10),
                Puesto.DEFENSA, "12345678c");
        futbolistas[3] = new Futbolista("abolafia, ramón", LocalDate.of(2008, 10, 10),
                Puesto.DEFENSA, "12345678d");
        futbolistas[4] = new Futbolista("zamora, esteban", LocalDate.of(2011, 10, 10),
                Puesto.DEFENSA, "12345678e");
        futbolistas[5] = new Futbolista("pérez, josé", LocalDate.of(2015, 10, 10),
                Puesto.CENTROCAMPISTA, "12345678f");
        futbolistas[6] = new Futbolista("molina, paco", LocalDate.of(2015, 11, 10),
                Puesto.CENTROCAMPISTA, "12345678g");
        futbolistas[7] = new Futbolista("pérez, bernardo", LocalDate.of(2015, 12, 10),
                Puesto.CENTROCAMPISTA, "12345678f");
        futbolistas[8] = new Futbolista("peláez, josé", LocalDate.of(2010, 1, 10),
                Puesto.CENTROCAMPISTA, "12345678g");
        futbolistas[9] = new Futbolista("muñoz, lucas", LocalDate.of(2015, 10, 10),
                Puesto.DELANTERO, "12345678h");
        futbolistas[10] = new Futbolista("lópez, abel", LocalDate.of(2015, 2, 10),
                Puesto.DELANTERO, "12345678i");
        //creamos un equipo de futbol
        EquipoFutbol equipoFutbol = new EquipoFutbol("IES Virgen del Carmen");
        //añadimos los jugadores al equipo
        for (Futbolista futbolista : futbolistas){
            System.out.printf("Añadido jugador? %B%n",equipoFutbol.ficharJugador(futbolista));
        }
        //eliminamos el jugador con DNI 12345678i
        System.out.printf("Eliminado jugador con DNI %s: %B%n", "12345678i",
                equipoFutbol.darBajaJugador("12345678i"));
        System.out.printf("Eliminado jugador con DNI %s: %B%n", "12345678i",
                equipoFutbol.darBajaJugador("12345678i"));
        //cambiar un puesto
        System.out.printf("Cambiado puesto de delantero a centrocampista? %B%n",
                equipoFutbol.actualizarPuestoJugador("12345678h", Puesto.CENTROCAMPISTA));
        System.out.printf("Cambiado puesto de delantero a centrocampista? %B%n",
                equipoFutbol.actualizarPuestoJugador("12345678i", Puesto.CENTROCAMPISTA));
        //listar alfabeticamente los jugadores
        equipoFutbol.obtenerListaNombresFutbolistas().forEach(System.out::println);
        System.out.printf("=====SUB 21========\n");
        //sub21
        equipoFutbol.obtenerListaNombresFutbolistasSub21().forEach(System.out::println);
        System.out.println("====DEFENSAS======");
        equipoFutbol.obtenerFutbolistasPorPuesto(Puesto.DEFENSA).forEach(System.out::println);
        System.out.println("====EDAD MEDIA====");
        System.out.printf("Edad media: %.2f%n", equipoFutbol.calcularEdadMediaJugadores().getAsDouble());
        System.out.println("====MAS JOVEN======");
        System.out.println(equipoFutbol.obtenerFutbolistaMasJoven());
        System.out.println("====MAS VIEJO======");
        System.out.println(equipoFutbol.obtenerFutbolistaMasViejo());
}}
