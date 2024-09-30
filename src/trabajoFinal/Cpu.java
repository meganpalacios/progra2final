package trabajoFinal;

public class Cpu extends Equipo{
    public Cpu(String serie, String marca, String modelo) {
        super(serie, marca, modelo);
    }

    @Override
    public boolean sePuedePrestar(String modalidadDelUsuario) {
        if (modalidadDelUsuario.equals("PRESENCIAL")) {
            return true;
        } else {
            return false;
        }
    }
}
