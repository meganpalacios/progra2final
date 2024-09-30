package trabajoFinal;

public abstract class Equipo {
    private String serie;
    private String marca;
    private String modelo;
    private boolean isEnPrestamo;
    private double usuario; // guarda el código de empleado del usuario

    public Equipo(String serie, String marca, String modelo) {
        this.serie = serie;
        this.marca = marca;
        this.modelo = modelo;
        this.isEnPrestamo = false;
        this.usuario = 0;
    }

    public abstract boolean sePuedePrestar(String modalidadDelUsuario);
    // si el usuario trabaja remoto, se le asigna una laptop
    // si el usuario trabaja en modalidad presencial, se le asigna una CPU
    // si el usuario trabaja en modalidad híbrida, se le asigna un AIO

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
    public double getUsuario() { return usuario; }

    public void setIsEnPrestamo(boolean enPrestamo) {
        isEnPrestamo = enPrestamo;
    }
    public void setUsuario(double usuario) {
        this.usuario = usuario;
    }
    public String obtenerEstatus() {
        String estatus = isEnPrestamo ? "Asignado" : "Disponible";
        return estatus;
    }
    public void imprimir() {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Serie: " + serie);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Estado: " + isEnPrestamo);
        if (isEnPrestamo) {
            System.out.println("Usuario asignado: " + usuario);
        }
    }
    public void asignar(double codUsuario) {
        isEnPrestamo = true;
        usuario = codUsuario;
    }
    public void desasignar() {
        isEnPrestamo = false;
        usuario = 0;
    }
}



