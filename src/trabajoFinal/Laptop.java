package trabajoFinal;

public class Laptop extends Equipo {
    private final boolean mochila;
    private final boolean mouse;
    private final boolean cargador;

    public Laptop(String serie, String marca, String modelo) {
        super(serie, marca, modelo);
        this.mochila = true;
        this.mouse = true;
        this.cargador = true;
    }

    @Override
    public void imprimir() {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("Laptop");
        System.out.println("Serie: " + this.getSerie());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Estado: " + this.getIsEnPrestamo());
        if (this.getIsEnPrestamo()) {
            System.out.println("Usuario asignado: " + this.getUsuario());
            if (mouse) {
                System.out.println("Accesorios: mouse, ");
            }
            if (mochila) {
                System.out.print("mochila, ");
            }
            if (cargador) {
                System.out.println("cargador.");
            }
        }
    }
}
