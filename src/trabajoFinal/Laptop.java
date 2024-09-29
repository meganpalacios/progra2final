package trabajoFinal;

public class Laptop extends Equipo{
    private int tamañoPantalla;

    public Laptop(String serie, String marca, String modelo, boolean isCheckOut, Usuario usuario, int tamañoPantalla) {
        super(serie, marca, modelo, isCheckOut, usuario);
        this.tamañoPantalla = tamañoPantalla;
    }

   @Override
    public boolean sePuedePrestar(String modalidadDelUsuario) {
        if (modalidadDelUsuario.equals("REMOTO")) {
            return true;
        } else {
            return false;
        }
    }

    public int getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(int tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }
}
