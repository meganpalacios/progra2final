package trabajoFinal;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private final List<Equipo> inventario;
    private final List<Empleado> empleados;

    public Empresa() {
        this.inventario = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    // métodos relacionados a la Clase Equipo
    public void registrarEquipo(Equipo equipo) throws ExcepcionEmpresaChecked {
        boolean encontrado = false;
        String nuevaSerie = equipo.getSerie();
        for (Equipo e : inventario) {
            if (nuevaSerie.equals(e.getSerie())) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            throw new ExcepcionEmpresaChecked("La serie del equipo " + nuevaSerie + " ya está registrada.");
        } else {
            inventario.add(equipo);
        }
    }
    public void obtenerEquipoPorSerie(String serie) {
        // imprime todos los atributos de un equipo
        for (Equipo equipo : inventario) {
            if (serie.equals(equipo.getSerie())) {
                equipo.imprimir();
            }
        }
    }
    public void obtenerInventario() {
        for (Equipo equipo : inventario) {
            equipo.imprimir();
        }
    }
    public void obtenerEquiposDisponibles() {
        double laptopCounter = 0;
        double cpuCounter = 0;
        double aioCounter = 0;
        for (Equipo equipo : inventario) {
            if (equipo instanceof Laptop) {
                laptopCounter++;
            } else if (equipo instanceof Cpu) {
                cpuCounter++;
            } else if (equipo instanceof AllInOne) {
                aioCounter++;
            }
        }
        System.out.println("Laptops disponibles: " + laptopCounter);
        System.out.println("CPUs disponibles: " + cpuCounter);
        System.out.println("All in ones disponibles: " + aioCounter);
    }

    // métodos relacionados a la Clase Empleado
    public void registrarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
    public String obtenerModalidadPorCodigo(String codUsuario) {
        String modalidad = "";
        for (Empleado empleado : empleados) {
            if (codUsuario.equals(empleado.getCodigoEmpleado())) {
                modalidad = String.valueOf(empleado.getModalidad());
            }
        }
        return modalidad;
    }

    // métodos que involucran ambas clases
    public void asignarEquipo(String codUsuario) {
        String modalidadUsuario = obtenerModalidadPorCodigo(codUsuario);
        boolean usuarioExiste = false;
        for (Empleado usuario : empleados) {
            if (codUsuario.equals(usuario.getCodigoEmpleado())) { // si el usuario existe
                usuarioExiste = true;
                break;
            }
        }
        if (usuarioExiste) {
            boolean exito = false;
            if (modalidadUsuario.equals(String.valueOf(Modalidad.PRESENCIAL))) { // si la modalidad es presencial asignamos cpu
                for (Equipo equipo : inventario) {
                    if (equipo instanceof Cpu && !equipo.getIsEnPrestamo()) { // encontramos el primer cpu disponible del array
                        equipo.asignar(codUsuario);
                        System.out.println("CPU asignado con éxito");
                        exito = true;
                        break;
                    }
                }
            } else if (modalidadUsuario.equals(String.valueOf(Modalidad.HIBRIDO))) { // si la modalidad es hibrida asignamos all in one
                for (Equipo equipo : inventario) {
                    if (equipo instanceof AllInOne && !equipo.getIsEnPrestamo()) { // encontramos el primer aio disponible del array
                        equipo.asignar(codUsuario);
                        System.out.println("AIO asignado con éxito");
                        exito = true;
                        break;
                    }
                }
            } else if (modalidadUsuario.equals(String.valueOf(Modalidad.REMOTO))) { // si la modalidad es remota asignamos laptop
                for (Equipo equipo : inventario) {
                    if (equipo instanceof Laptop && !equipo.getIsEnPrestamo()) { // encontramos la primera laptop disponible del array
                        equipo.asignar(codUsuario);
                        System.out.println("Laptop asignada con éxito");
                        exito = true;
                        break;
                    }
                }
            }
            if (!exito) {
                System.out.println("No existen equipos disponibles");
            }
        } else {
            System.out.println("Este usuario no existe");
        }
    }
    public void desasignarEquipo(String codUsuario) {
        boolean tieneEquipoAsignado = false;
        for (Equipo equipo : inventario) {
            // si el usuario en efecto tiene un equipo asignado
            if (equipo.getUsuario().equals(codUsuario)) {
                tieneEquipoAsignado = true;
                equipo.desasignar();
                System.out.println("Equipo liberado con éxito");
                break;
            }
        }
        if (!tieneEquipoAsignado) {
            System.out.println("Error, este usuario no existe o no tiene equipos asignados");
        }
    }
}
