package trabajoFinal;

import java.util.ArrayList;
import java.util.List;

public class RecursosHumanos {
    private List<Usuario> empleados;

    public RecursosHumanos() {
        this.empleados = new ArrayList<>();
    }
    public void registrarEquipo(Usuario empleado) {
        empleados.add(empleado);
    }

    public String obtenerModalidadPorCodigo(String codUsuario) {
        String modalidad = "";
        for (Usuario empleado : empleados) {
            if (codUsuario.equals(empleado.getCodigoEmpleado())) {
                modalidad = String.valueOf(empleado.getModalidad());
            }
        }
        return modalidad;
    }
}
