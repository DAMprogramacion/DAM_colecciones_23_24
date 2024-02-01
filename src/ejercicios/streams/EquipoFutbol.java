package ejercicios.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
//
public class EquipoFutbol {
    private String nombreEquipo;
    private List<Futbolista> futbolistas;

    public EquipoFutbol(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.futbolistas = new ArrayList<>();
    }
    public boolean ficharJugador(Futbolista futbolista){
        return futbolistas.add(futbolista);
    }
    public boolean darBajaJugador(String dni) {
        for (Futbolista futbolista : futbolistas)
            if (futbolista.getDni().equalsIgnoreCase(dni))
                return futbolistas.remove(futbolista);
        return false;
    }
    public boolean actualizarPuestoJugador(String dni, Puesto nuevoPuesto){
        for (Futbolista futbolista : futbolistas)
            if (futbolista.getDni().equalsIgnoreCase(dni)){
                futbolista.setPuesto(nuevoPuesto);
                return true;
            }
        return false;
    }
    public List<String> obtenerListaNombresFutbolistas() {
        return futbolistas.stream()
                .map(Futbolista::getNombreFutbolista)
                .sorted()
                .toList();
    }
    public List<String> obtenerListaNombresFutbolistasSub21(){
        return futbolistas.stream()
                .filter(futbolista -> futbolista.calcularEdad() <= 21 )
                .map(Futbolista::getNombreFutbolista)
                .sorted()
                .toList();
    }
    public List<Futbolista> obtenerFutbolistasPorPuesto(Puesto puesto) {
        return futbolistas.stream()
                .filter(futbolista -> futbolista.getPuesto().equals(puesto))
                .toList();
    }
    public OptionalDouble calcularEdadMediaJugadores () {
        return futbolistas.stream()
                .mapToInt(Futbolista::calcularEdad)
                .average();
    }
    public Futbolista obtenerFutbolistaMasJoven () {
        return futbolistas.stream()
                .max(Comparator.comparing(Futbolista::getFechaNacimiento))
                .get();
    }
    public Futbolista obtenerFutbolistaMasViejo () {
        return futbolistas.stream()
                .min(Comparator.comparing(Futbolista::getFechaNacimiento))
                .get();
    }






















}
