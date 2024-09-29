package trabajoFinal;

public abstract class Equipo {
    private String serie;
    private String marca;
    private String modelo;
    private boolean isCheckOut;
    private Usuario usuario;

    public Equipo(String serie, String marca, String modelo, boolean isCheckOut, Usuario usuario) {
        this.serie = serie;
        this.marca = marca;
        this.modelo = modelo;
        this.isCheckOut = false;
        this.usuario = usuario;
    }

    public abstract String obtenerStatusEquipo();

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isCheckOut() {
        return isCheckOut;
    }

    public void setCheckOut(boolean checkOut) {
        isCheckOut = checkOut;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}



