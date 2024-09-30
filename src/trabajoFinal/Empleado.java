package trabajoFinal;

public class Empleado {
    private final String nombre;
    private final String codigoEmpleado;
    private final String correo;
    private final Modalidad modalidad;

    public Empleado(String nombre, String codigoEmpleado, String correo, Modalidad modalidad) {
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
        this.correo = correo;
        this.modalidad = modalidad;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }
    public Modalidad getModalidad() {
        return modalidad;
    }
}
