package ejercicios.diccionarios;

import ejercicios.listas.Alumno;

import java.util.*;

public class Instituto1 {
    private String nombreInstituto;
    private Map<String, Alumno1> alumnos = new HashMap<>();

    public Instituto1(String nombreInstituto) {
        this.nombreInstituto = nombreInstituto;
    }
    //CRUD
    public Alumno1 addAlumno (String dni, Alumno1 alumno){
        return alumnos.put(dni, alumno);
    }
    public Alumno1 eliminarAlumno(String dni){
       return alumnos.remove(dni);
    }
    public Alumno1 buscarAlumno(String dni){
       return alumnos.get(dni);
    }

   public List<Alumno1> getAlumnos() {
       Set<String> dnis = alumnos.keySet(); //conjunto de claves
       List<Alumno1> listaAlumnos = new ArrayList<>(); //lista de valores, inicialment vacía
       for (String dni : dnis)
           listaAlumnos.add(alumnos.get(dni)); //llenamos los valores
        return listaAlumnos;
    }
}
