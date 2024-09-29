package trabajoFinal;

public abstract class Equipo {
    private String serie;
    private String marca;
    private String modelo;
    private boolean isEnPrestamo;
    private Usuario usuario;

    public Equipo(String serie, String marca, String modelo, boolean isEnPrestamo, Usuario usuario) {
        this.serie = serie;
        this.marca = marca;
        this.modelo = modelo;
        this.isEnPrestamo = false;
        this.usuario = usuario;
    }

    public abstract boolean sePuedePrestar(String modalidadDelUsuario);

    public String getSerie() {
        return serie;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public boolean getIsEnPrestamo() { return isEnPrestamo; }
    public Usuario getUsuario() { return usuario; }

    public void setIsEnPrestamo(boolean enPrestamo) {
        isEnPrestamo = enPrestamo;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String obtenerEstatus(Equipo equipo) {
        String estatus = equipo.getIsEnPrestamo() ? "Asignado" : "Disponible";
        return estatus;
    }
}



