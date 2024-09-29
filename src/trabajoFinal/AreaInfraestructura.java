package trabajoFinal;

import java.util.ArrayList;
import java.util.List;

public class AreaInfraestructura {
    private List<Equipo> inventario;

    public AreaInfraestructura() {
        this.inventario = new ArrayList<>();
    }

    // métodos
    public void registrarEquipo(Equipo equipo) {
        inventario.add(equipo);
    }
    public void obtenerEquipoPorSerie(String serie) {
        for (Equipo equipo : inventario) {
            if (serie.equals(equipo.getSerie())) {
                System.out.println("Detalles del equipo con serie " + equipo.getSerie() + ":");
                System.out.println("Marca: " + equipo.getMarca());
                System.out.println("Modelo: " + equipo.getModelo());
                System.out.println("Estado: " + equipo.obtenerEstatus(equipo));
                if (equipo.getIsEnPrestamo()) {
                    System.out.println("Usuario asignado: " + equipo.getUsuario());
                }
            }
        }
    }
    public void prestarEquipo(String codUsuario, String tipoDeEquipo) {
        // si el usuario trabaja remoto, se le asigna una laptop
        // si el usuario trabaja en modalidad presencial, se le asigna una CPU
        // si el usuario trabaja en modalidad híbrida, se le asigna un AIO
//        String modalidadUsuario =
        for (Equipo equipo : inventario) {
            if (tipoDeEquipo.equals("laptop")) {
//                equipo.sePuedePrestar()
            }
        }
    }
}
