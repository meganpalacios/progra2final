package trabajoFinal;

public class Laptop extends Equipo{
    public Laptop(String serie, String marca, String modelo) {
        super(serie, marca, modelo);
    }

   @Override
    public boolean sePuedePrestar(String modalidadDelUsuario) {
        if (modalidadDelUsuario.equals("REMOTO")) {
            return true;
        } else {
            return false;
        }
    }

}
