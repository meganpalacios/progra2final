package trabajoFinal;

import java.util.Scanner;

public class Ejecutora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empresa GrupoTawa = new Empresa();

        // inicializamos la empresa con data de algunos empleados
        Empleado empleado1 = new Empleado("Pepito Lopez", "12345678", "plopez@gmail.com", Modalidad.REMOTO);
        Empleado empleado2 = new Empleado("Maria Gonzalez", "23456789", "mgonzalez@gmail.com", Modalidad.HIBRIDO);
        Empleado empleado3 = new Empleado("Carlos Ramirez", "34567890", "cramirez@gmail.com", Modalidad.PRESENCIAL);
        Empleado empleado4 = new Empleado("Ana Fernandez", "45678901", "afernandez@gmail.com", Modalidad.REMOTO);
        Empleado empleado5 = new Empleado("Luis Martinez", "56789012", "lmartinez@gmail.com", Modalidad.HIBRIDO);
        Empleado empleado6 = new Empleado("Sofia Diaz", "67890123", "sdiaz@gmail.com", Modalidad.PRESENCIAL);
        Empleado empleado7 = new Empleado("Jorge Perez", "78901234", "jperez@gmail.com", Modalidad.REMOTO);
        Empleado empleado8 = new Empleado("Elena Gomez", "89012345", "egomez@gmail.com", Modalidad.HIBRIDO);
        Empleado empleado9 = new Empleado("Miguel Torres", "90123456", "mtorres@gmail.com", Modalidad.PRESENCIAL);
        Empleado empleado10 = new Empleado("Isabel Rojas", "12345098", "irojas@gmail.com", Modalidad.REMOTO);
        Empleado empleado11 = new Empleado("Fernando Ruiz", "23456098", "fruiz@gmail.com", Modalidad.HIBRIDO);
        Empleado empleado12 = new Empleado("Laura Castro", "34567098", "lcastro@gmail.com", Modalidad.PRESENCIAL);
        Empleado empleado13 = new Empleado("Antonio Blanco", "45678098", "ablanco@gmail.com", Modalidad.REMOTO);
        Empleado empleado14 = new Empleado("Gabriela Herrera", "56789098", "gherrera@gmail.com", Modalidad.HIBRIDO);
        Empleado empleado15 = new Empleado("Ricardo Alvarez", "67890198", "ralvarez@gmail.com", Modalidad.PRESENCIAL);
        GrupoTawa.registrarEmpleado(empleado1);
        GrupoTawa.registrarEmpleado(empleado2);
        GrupoTawa.registrarEmpleado(empleado3);
        GrupoTawa.registrarEmpleado(empleado4);
        GrupoTawa.registrarEmpleado(empleado5);
        GrupoTawa.registrarEmpleado(empleado6);
        GrupoTawa.registrarEmpleado(empleado7);
        GrupoTawa.registrarEmpleado(empleado8);
        GrupoTawa.registrarEmpleado(empleado9);
        GrupoTawa.registrarEmpleado(empleado10);
        GrupoTawa.registrarEmpleado(empleado11);
        GrupoTawa.registrarEmpleado(empleado12);
        GrupoTawa.registrarEmpleado(empleado13);
        GrupoTawa.registrarEmpleado(empleado14);
        GrupoTawa.registrarEmpleado(empleado15);

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
        GrupoTawa.registrarEquipo(laptop1);
        GrupoTawa.registrarEquipo(laptop2);
        GrupoTawa.registrarEquipo(laptop3);
        GrupoTawa.registrarEquipo(laptop4);
        GrupoTawa.registrarEquipo(laptop5);
        GrupoTawa.registrarEquipo(cpu1);
        GrupoTawa.registrarEquipo(cpu2);
        GrupoTawa.registrarEquipo(cpu3);
        GrupoTawa.registrarEquipo(cpu4);
        GrupoTawa.registrarEquipo(cpu5);
        GrupoTawa.registrarEquipo(aio1);
        GrupoTawa.registrarEquipo(aio2);
        GrupoTawa.registrarEquipo(aio3);
        GrupoTawa.registrarEquipo(aio4);
        GrupoTawa.registrarEquipo(aio5);

        int opcion;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Agregar equipo al inventario");
            System.out.println("2. Buscar equipo por serie");
            System.out.println("3. Mostrar inventario");
            System.out.println("4. Asignar equipo");
            System.out.println("5. Desasignar equipo");
            System.out.println("6. Mostrar equipos disponibles");
            System.out.println("7. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Equipo que desea registrar (laptop / cpu / all in one): ");
                    String tipo = sc.next();
                    sc.nextLine(); // Limpiar el buffer del scanner
                    System.out.print("Ingrese la serie del equipo: ");
                    String serie = sc.nextLine();
                    System.out.print("Ingrese la marca del equipo: ");
                    String marca = sc.nextLine();
                    System.out.print("Ingrese el modelo del equipo: ");
                    String modelo = sc.nextLine();

                    if (tipo.equalsIgnoreCase("laptop")) {
                        Laptop nuevaLaptop = new Laptop(serie, marca, modelo);
                        GrupoTawa.registrarEquipo(nuevaLaptop);
                    } else if (tipo.equalsIgnoreCase("cpu")) {
                        Cpu nuevaCpu = new Cpu(serie, marca, modelo);
                        GrupoTawa.registrarEquipo(nuevaCpu);
                    } else if (tipo.equalsIgnoreCase("aio") || tipo.equalsIgnoreCase("all in one") || tipo.equalsIgnoreCase("allinone")) {
                        AllInOne nuevoAllInOne = new AllInOne(serie, marca, modelo);
                        GrupoTawa.registrarEquipo(nuevoAllInOne);
                    }
                    break;
                case 2:
                    System.out.print("Ingrese la serie del equipo a buscar: ");
                    String serieABuscar = sc.next();
                    GrupoTawa.obtenerEquipoPorSerie(serieABuscar);
                    break;
                case 3:
                    GrupoTawa.obtenerInventario();
                    break;
                case 4:
                    System.out.print("Ingrese el código de usuario a quien quiere asignar un equipo: ");
                    String codUsuario = sc.next();
                    GrupoTawa.asignarEquipo(codUsuario);
                    break;
                case 5:
                    System.out.println("Ingrese el código de empleado");
                    String codDeUsuario = sc.next();
                    GrupoTawa.desasignarEquipo(codDeUsuario);
                    break;
                case 6:
                    System.out.println("Buscando equipos disponibles...");
                    GrupoTawa.obtenerEquiposDisponibles();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 7);
    }
}
