import java.util.InputMismatchException;
import java.util.Scanner;
import modelos.Empleado;

public class Application {
    private static Empleado[] empleados = new Empleado[10]; // Array para almacenar empleados
    private static int contadorEmpleados = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ejecutar = true;

        while (ejecutar) {
            System.out.println("=== Menú de Gestión de Empleados ===");
            System.out.println("1. Mostrar todos los empleados");
            System.out.println("2. Crear empleado");
            System.out.println("3. Filtrar empleados");
            System.out.println("4. Ordenar empleados");
            System.out.println("5. Incrementar salario");
            System.out.println("6. Limpiar filtros");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = leerEntero(scanner);

            switch (opcion) {
                case 1:
                    Empleado.mostrarEmpleados(empleados);
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = scanner.nextLine();
                    if (Empleado.buscarPorNombre(empleados, nombre) != null) {
                        System.out.println("Error: El empleado con el nombre " + nombre + " ya existe.");
                        break;
                    }
                    System.out.print("Ingrese la edad del empleado: ");
                    int edad = leerEntero(scanner);
                    System.out.print("Ingrese el salario del empleado: ");
                    double salario = leerDecimal(scanner);
                    System.out.print("Ingrese el departamento del empleado: ");
                    String departamento = scanner.nextLine();

                    if (contadorEmpleados < empleados.length) {
                        empleados[contadorEmpleados++] = new Empleado(nombre, edad, salario, departamento);
                    } else {
                        System.out.println("Error: No se pueden agregar más empleados.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el atributo para filtrar (nombre/departamento/edad/salario): ");
                    String atributoFiltro = scanner.nextLine();
                    System.out.print("Ingrese el valor del filtro: ");
                    String valorFiltro = scanner.nextLine();
                    Empleado[] filtrados = Empleado.filtrarEmpleados(empleados, atributoFiltro, valorFiltro);
                    Empleado.mostrarEmpleados(filtrados);
                    break;

                case 4:
                    System.out.print("Ingrese el atributo para ordenar (nombre/edad/salario): ");
                    String atributoOrdenar = scanner.nextLine();
                    Empleado[] ordenados = Empleado.ordenarEmpleados(empleados, atributoOrdenar);
                    Empleado.mostrarEmpleados(ordenados);
                    break;

                case 5:
                    System.out.print("Ingrese el nombre del empleado para incrementar salario: ");
                    String nombreSalario = scanner.nextLine();
                    Empleado empleado = Empleado.buscarPorNombre(empleados, nombreSalario);
                    if (empleado != null) {
                        System.out.print("Ingrese el porcentaje de aumento: ");
                        double porcentaje = leerDecimal(scanner);
                        empleado = Empleado.incrementarSalario(empleado, porcentaje);
                        System.out.println("Salario actualizado.");
                    } else {
                        System.out.println("Error: El empleado con el nombre " + nombreSalario + " no existe.");
                    }
                    break;

                case 6:
                    // Limpiar los filtros no es necesario ya que no se implementa un estado de
                    // filtro en este código
                    System.out.println("Los filtros se han limpiado.");
                    break;

                case 7:
                    ejecutar = false;
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        scanner.close();
    }

    // Método para leer un entero con manejo de excepciones
    private static int leerEntero(Scanner scanner) {
        int valor = 0;
        boolean valido = false;
        while (!valido) {
            try {
                valor = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer del scanner
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número entero válido.");
                scanner.next(); // Limpiar el buffer del scanner
                System.out.print("Intente nuevamente: ");
            }
        }
        return valor;
    }

    // Método para leer un decimal con manejo de excepciones
    private static double leerDecimal(Scanner scanner) {
        double valor = 0.0;
        boolean valido = false;
        while (!valido) {
            try {
                valor = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer del scanner
                valido = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Por favor, ingrese un número decimal válido.");
                scanner.next(); // Limpiar el buffer del scanner
                System.out.print("Intente nuevamente: ");
            }
        }
        return valor;
    }
}
