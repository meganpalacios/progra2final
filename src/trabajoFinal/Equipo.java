package trabajoFinal;

public abstract class Equipo {
    private final String serie;
    private final String marca;
    private final String modelo;
    private boolean isEnPrestamo;
    private String usuario; // guarda el código de empleado del usuario

    public Equipo(String serie, String marca, String modelo) {
        this.serie = serie;
        this.marca = marca;
        this.modelo = modelo;
        this.isEnPrestamo = false;
        this.usuario = "";
    }

    public String getSerie() { return serie; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public boolean getIsEnPrestamo() { return isEnPrestamo; }
    public String getUsuario() { return usuario; }

    public abstract void imprimir();

    public void asignar(String codUsuario) {
        isEnPrestamo = true;
        usuario = codUsuario;
    }
    public void desasignar() {
        isEnPrestamo = false;
        usuario = "";
    }
}



