package trabajoFinal;

public class AllInOne extends Equipo{
    private boolean tienePantallaTouch;

    public AllInOne(String serie, String marca, String modelo, boolean isCheckOut, Usuario usuario, boolean tienePantallaTouch) {
        super(serie, marca, modelo, isCheckOut, usuario);
        this.tienePantallaTouch = tienePantallaTouch;
    }

    @Override
    public String obtenerStatusEquipo() {
        return "All in One - Serie: " + getSerie() + ", Estado: " + (isCheckOut()? "Asignado" : "Disponible");
    }

    public boolean isTienePantallaTouch() {
        return tienePantallaTouch;
    }

    public void setTienePantallaTouch(boolean tienePantallaTouch) {
        this.tienePantallaTouch = tienePantallaTouch;
    }
}
