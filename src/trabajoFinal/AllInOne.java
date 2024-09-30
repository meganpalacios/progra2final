package trabajoFinal;

public class AllInOne extends Equipo{
    public AllInOne(String serie, String marca, String modelo) {
        super(serie, marca, modelo);
    }

    @Override
    public boolean sePuedePrestar(String modalidadDelUsuario) {
        if (modalidadDelUsuario.equals("HIBRIDO")) {
            return true;
        } else {
            return false;
        }
    }
}
