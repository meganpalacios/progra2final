package trabajoFinal;

public class AllInOne extends Equipo{
    private boolean tienePantallaTouch;

    public AllInOne(String serie, String marca, String modelo, boolean isCheckOut, Usuario usuario, boolean tienePantallaTouch) {
        super(serie, marca, modelo, isCheckOut, usuario);
        this.tienePantallaTouch = tienePantallaTouch;
    }

    @Override
    public boolean sePuedePrestar(String modalidadDelUsuario) {
        if (modalidadDelUsuario.equals("HIBRIDO")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isTienePantallaTouch() {
        return tienePantallaTouch;
    }

    public void setTienePantallaTouch(boolean tienePantallaTouch) {
        this.tienePantallaTouch = tienePantallaTouch;
    }
}
