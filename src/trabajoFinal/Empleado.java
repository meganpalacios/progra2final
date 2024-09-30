package trabajoFinal;

public class Empleado {
    private String nombre;
    private double codigoEmpleado;
    private String correo;
    private Modalidad modalidad;

    public Empleado(String nombre, double codigoEmpleado, String correo, Modalidad modalidad) {
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
        this.correo = correo;
        this.modalidad = modalidad;
    }

    public String getNombre() {
        return nombre;
    }
    public double getCodigoEmpleado() {
        return codigoEmpleado;
    }
    public String getCorreo() {
        return correo;
    }
    public Modalidad getModalidad() {
        return modalidad;
    }
}
