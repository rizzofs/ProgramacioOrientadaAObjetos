package src.TP2.Ej_2;

public class Venta {
    private Cliente cliente;
    private PaqueteTurismo paqueteTurismo;
    private String fecha;

    public Venta(Cliente cliente, PaqueteTurismo paqueteTurismo, String fecha) {
        this.cliente = cliente;
        this.paqueteTurismo = paqueteTurismo;
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public PaqueteTurismo getPaqueteTurismo() {
        return paqueteTurismo;
    }

    public void setPaqueteTurismo(PaqueteTurismo paqueteTurismo) {
        this.paqueteTurismo = paqueteTurismo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
