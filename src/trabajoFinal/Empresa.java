package trabajoFinal;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Equipo> inventario;
    private List<Empleado> empleados;

    public Empresa() {
        this.inventario = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }

    // métodos relacionados a la Clase Equipo
    public void registrarEquipo(Equipo equipo) {
        inventario.add(equipo);
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
    public String obtenerModalidadPorCodigo(double codUsuario) {
        String modalidad = "";
        for (Empleado empleado : empleados) {
            if (codUsuario == empleado.getCodigoEmpleado()) {
                modalidad = String.valueOf(empleado.getModalidad());
            }
        }
        return modalidad;
    }

    // métodos que involucran ambas clases
    public void asignarEquipo(double codUsuario) {
//        String modalidadUsuario = obtenerModalidadPorCodigo(codUsuario);
//        for (Empleado usuario : empleados) {
//            if (codUsuario == usuario.getCodigoEmpleado()) { // si el usuario existe
//                System.out.println("Equipo asignado con éxito a " + usuario.getNombre());
//            }
//        }
//        for (Equipo equipo : inventario) {
//
//        }
    }
    public void desasignarEquipo(double codUsuario) {
        for (Equipo equipo : inventario) {
            // si el usuario en efecto tiene un equipo asignado
            if (equipo.getUsuario() == codUsuario) {
                equipo.desasignar();
            } else {
                System.out.println("Error, este usuario no existe o no tiene equipos asignados");
            }
        }
    }

    // inicializamos la empresa con data de algunos empleados
    Empleado empleado1 = new Empleado("Pepito Lopez", 12345678, "plopez@gmail.com", Modalidad.REMOTO);
    Empleado empleado2 = new Empleado("Maria Gonzalez", 23456789, "mgonzalez@gmail.com", Modalidad.HIBRIDO);
    Empleado empleado3 = new Empleado("Carlos Ramirez", 34567890, "cramirez@gmail.com", Modalidad.PRESENCIAL);
    Empleado empleado4 = new Empleado("Ana Fernandez", 45678901, "afernandez@gmail.com", Modalidad.REMOTO);
    Empleado empleado5 = new Empleado("Luis Martinez", 56789012, "lmartinez@gmail.com", Modalidad.HIBRIDO);
    Empleado empleado6 = new Empleado("Sofia Diaz", 67890123, "sdiaz@gmail.com", Modalidad.PRESENCIAL);
    Empleado empleado7 = new Empleado("Jorge Perez", 78901234, "jperez@gmail.com", Modalidad.REMOTO);
    Empleado empleado8 = new Empleado("Elena Gomez", 89012345, "egomez@gmail.com", Modalidad.HIBRIDO);
    Empleado empleado9 = new Empleado("Miguel Torres", 90123456, "mtorres@gmail.com", Modalidad.PRESENCIAL);
    Empleado empleado10 = new Empleado("Isabel Rojas", 12345098, "irojas@gmail.com", Modalidad.REMOTO);
    Empleado empleado11 = new Empleado("Fernando Ruiz", 23456098, "fruiz@gmail.com", Modalidad.HIBRIDO);
    Empleado empleado12 = new Empleado("Laura Castro", 34567098, "lcastro@gmail.com", Modalidad.PRESENCIAL);
    Empleado empleado13 = new Empleado("Antonio Blanco", 45678098, "ablanco@gmail.com", Modalidad.REMOTO);
    Empleado empleado14 = new Empleado("Gabriela Herrera", 56789098, "gherrera@gmail.com", Modalidad.HIBRIDO);
    Empleado empleado15 = new Empleado("Ricardo Alvarez", 67890198, "ralvarez@gmail.com", Modalidad.PRESENCIAL);

    // y algunos equipos
    Laptop laptop1 = new Laptop("5CD9036VTM", "HP", "PROBOOK 440 G5");
    Laptop laptop2 = new Laptop("5CD8023C6H", "HP", "PROBOOK 440 G5");
    Laptop laptop3 = new Laptop("5CG9421S6G", "HP", "240 G7");
    Laptop laptop4 = new Laptop("5CG9421SXD", "HP", "240 G7");
    Laptop laptop5 = new Laptop("5CD9036VQJ", "HP", "PROBOOK 440 G5");
    Cpu cpu1 = new Cpu("SN12345", "Intel", "Core i7");
    Cpu cpu2 = new Cpu("SN67890", "AMD", "Ryzen 5");
    Cpu cpu3 = new Cpu("SN11223", "Intel", "Core i5");
    Cpu cpu4 = new Cpu("SN44556", "AMD", "Ryzen 7");
    Cpu cpu5 = new Cpu("SN78901", "Intel", "Core i9");
    AllInOne aio1 = new AllInOne("SN54321", "Dell", "Inspiron 27");
    AllInOne aio2 = new AllInOne("SN98765", "HP", "Pavilion 24");
    AllInOne aio3 = new AllInOne("SN24680", "Lenovo", "IdeaCentre AIO 3");
    AllInOne aio4 = new AllInOne("SN13579", "Apple", "iMac 24-inch");
    AllInOne aio5 = new AllInOne("SN19283", "Acer", "Aspire C27");

}
