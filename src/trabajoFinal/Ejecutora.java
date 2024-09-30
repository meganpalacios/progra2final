package trabajoFinal;

import java.util.Scanner;

public class Ejecutora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empresa GrupoTawa = new Empresa();

        int opcion;

        do {
            System.out.println("\nMenu:");
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
                    System.out.println("Ingrese el código de usuario a quien quiere asignar un equipo: ");
                    double codUsuario = sc.nextDouble();
                    GrupoTawa.asignarEquipo(codUsuario);
                    break;
                case 5:
                    System.out.println("Ingrese el código de empleado");
                    double codDeUsuario = sc.nextDouble();
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
