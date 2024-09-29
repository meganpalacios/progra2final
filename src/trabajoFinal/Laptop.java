package trabajoFinal;

public class Laptop extends Equipo{
    private int tamañoPantalla;

    public Laptop(String serie, String marca, String modelo, boolean isCheckOut, Usuario usuario, int tamañoPantalla) {
        super(serie, marca, modelo, isCheckOut, usuario);
        this.tamañoPantalla = tamañoPantalla;
    }

    @Override
    public String obtenerStatusEquipo() {
        return "Laptop - Serie: " + getSerie() + ", Estado: " + (isCheckOut() ? "Asignado" : "Disponible");
    }

    public int getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(int tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }
}
