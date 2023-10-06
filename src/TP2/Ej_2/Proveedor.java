package src.TP2.Ej_2;

public class Proveedor {
    private String nombre;
    private String clasificacion;


    public Proveedor(String nombre, String clasificacion){
        this.clasificacion = clasificacion;
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
}
