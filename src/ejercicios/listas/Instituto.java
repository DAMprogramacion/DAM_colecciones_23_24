package ejercicios.listas;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private String nombreInstituto;
    private List<Alumno> alumnos = new ArrayList<>();

    public Instituto(String nombreInstituto) {
        this.nombreInstituto = nombreInstituto;
    }
    //CRUD
    public boolean addAlumno (Alumno alumno){
        return alumnos.add(alumno);
    }
    public boolean eliminarAlumno(String dni){
        for (Alumno alumno : alumnos){
            if(alumno.dni().equalsIgnoreCase(dni))
                return alumnos.remove(alumno);
        }
        return false;
    }
    public Alumno buscarAlumno(String dni){
        for (Alumno alumno : alumnos)
            if (alumno.dni().equalsIgnoreCase(dni))
                return alumno;
        return null;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

}
