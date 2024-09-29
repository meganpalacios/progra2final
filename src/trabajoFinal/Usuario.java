package trabajoFinal;

public class Usuario {
    private String nombre;
    private String codigoEmpleado;
    private String correo;
    private Modalidad modalidad;

    public Usuario(String nombre, String codigoEmpleado, String correo, Modalidad modalidad) {
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
        this.correo = correo;
        this.modalidad = modalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }
}
