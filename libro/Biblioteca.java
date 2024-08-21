package libro;

import java.util.Scanner;

public class Biblioteca {
    // Array para almacenar los libros
    private static Libro[] libros = new Libro[5]; // Capacidad inicial
    private static int contadorLibros = 0; // Contador para la cantidad de libros

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Crear libro");
            System.out.println("2. Modificar libro");
            System.out.println("3. Borrar libro");
            System.out.println("4. Ver libros");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    crearLibro(scanner);
                    break;
                case 2:
                    modificarLibro(scanner);
                    break;
                case 3:
                    borrarLibro(scanner);
                    break;
                case 4:
                    verLibros();
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }

    // Método para crear un libro
    private static void crearLibro(Scanner scanner) {
        if (contadorLibros >= libros.length) {
            System.out.println("El array de libros está lleno. No se pueden agregar más libros.");
            return;
        }

        Libro libro = new Libro();

        System.out.print("Ingrese el título del libro: ");
        libro.setTitulo(scanner.nextLine());

        System.out.print("Ingrese el autor del libro: ");
        libro.setAutor(scanner.nextLine());

        System.out.print("Ingrese el número de páginas (multiplicado por 7): ");
        libro.setPaginas(scanner.nextInt());
        scanner.nextLine(); // Limpiar el buffer

        libros[contadorLibros++] = libro;
        System.out.println("Libro creado exitosamente.");
    }

    // Método para modificar un libro
    private static void modificarLibro(Scanner scanner) {
        System.out.print("Ingrese el índice del libro a modificar (0 a " + (contadorLibros - 1) + "): ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (indice < 0 || indice >= contadorLibros) {
            System.out.println("Índice inválido.");
            return;
        }

        Libro libro = libros[indice];

        System.out.print("Ingrese el nuevo título del libro (deje vacío para no modificar): ");
        String nuevoTitulo = scanner.nextLine();
        if (!nuevoTitulo.isEmpty()) {
            libro.setTitulo(nuevoTitulo);
        }

        System.out.print("Ingrese el nuevo autor del libro (deje vacío para no modificar): ");
        String nuevoAutor = scanner.nextLine();
        if (!nuevoAutor.isEmpty()) {
            libro.setAutor(nuevoAutor);
        }

        System.out.print("Ingrese el nuevo número de páginas (deje vacío para no modificar): ");
        String nuevoNumeroPaginas = scanner.nextLine();
        if (!nuevoNumeroPaginas.isEmpty()) {
            libro.setPaginas(Integer.parseInt(nuevoNumeroPaginas));
        }

        System.out.println("Libro modificado exitosamente.");
    }

    // Método para borrar un libro
    private static void borrarLibro(Scanner scanner) {
        System.out.print("Ingrese el índice del libro a borrar (0 a " + (contadorLibros - 1) + "): ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        if (indice < 0 || indice >= contadorLibros) {
            System.out.println("Índice inválido.");
            return;
        }

        // Desplazar los libros para llenar el vacío
        for (int i = indice; i < contadorLibros - 1; i++) {
            libros[i] = libros[i + 1];
        }

        libros[--contadorLibros] = null; // Limpiar el último elemento
        System.out.println("Libro borrado exitosamente.");
    }

    // Método para ver todos los libros
    private static void verLibros() {
        if (contadorLibros == 0) {
            System.out.println("No hay libros disponibles.");
            return;
        }

        // Encabezado de la tabla
        System.out.printf("%-30s %-30s %-10s%n", "Título", "Autor", "Páginas");
        System.out.println(new String(new char[70]).replace("\0", "-")); // Línea divisoria

        for (int i = 0; i < contadorLibros; i++) {
            Libro libro = libros[i];
            // Imprime cada libro en una fila de la tabla
            System.out.printf("%-30s %-30s %-10d%n", libro.getTitulo(), libro.getAutor(), libro.getPaginas());
        }
    }
}
