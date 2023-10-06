package src.TP2.Ej_3;

public class Secretaria {
    public void inscribirAlumno(Alumno alumno, Diagramacion diagramacion){
        if (! diagramacion.getAlumnosAsistentes().contains(alumno)){
            diagramacion.getAlumnosAsistentes().add(alumno);

            alumno.getDiagramacionesInscritas().add(diagramacion);

            Credencial credencial = new Credencial();
            alumno.setCredencial(credencial);

            System.out.println("El alumno ha sido inscripto");
        }
        else {
            System.out.println("Ya esta inscripto");
        }
    }
    public void registrarAsistencia(Alumno alumno, Diagramacion diagramacion){
        if (diagramacion.getAlumnosAsistentes().contains(alumno)){
            alumno.setAsistio(true);
            System.out.println("Asistencia registrada");
        }
        else{
            System.out.println("Alumno no inscripto");
        }
    }
    public void generarListadoAsistencia(Profesor profesor, String mes, int año){
        list<Alumno> listadoAsistencia = new ArrayList<>();

        for(Diagramacion diagramacion: profesor.getDiagramacionesEnseñadas()){
            String fechaDiagramacion =diagramacion.getMes() + diagramacion.getAño();

            if(fechaDiagramacion.equals(mes+año)){
                listadoAsistencia.addAll(diagramacion.getAlumnosAsistentes());
            }
        }
    }
    return listadoAsistencia;
}
