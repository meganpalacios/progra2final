package trabajoFinal;

public class Cpu extends Equipo {
    private final boolean teclado;
    private final boolean mouse;

    public Cpu(String serie, String marca, String modelo) {
        super(serie, marca, modelo);
        this.teclado = true;
        this.mouse = true;
    }

    @Override
    public void imprimir() {
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("CPU");
        System.out.println("Serie: " + this.getSerie());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Estado: " + this.getIsEnPrestamo());
        if (this.getIsEnPrestamo()) {
            System.out.println("Usuario asignado: " + this.getUsuario());
            if (teclado) {
                System.out.print("Accesorios: teclado, ");
            }
            if (mouse) {
                System.out.println("mouse.");
            }
        }
    }
}
