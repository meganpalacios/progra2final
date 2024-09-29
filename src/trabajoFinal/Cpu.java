package trabajoFinal;

public class Cpu extends Equipo{
    private String procesador;

    public Cpu(String serie, String marca, String modelo, boolean isCheckOut, Usuario usuario, String procesador) {
        super(serie, marca, modelo, isCheckOut, usuario);
        this.procesador = procesador;
    }

    @Override
    public String obtenerStatusEquipo() {
        return "CPU - Serie: " + getSerie() + ", Estado: " + (isCheckOut()? "Asignado" :  "Disponible");
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
}
