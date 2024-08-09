import java.util.Scanner;

public class ArrayRellenarArregloPersonalizado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamano = scanner.nextInt();

        // Crear el arreglo del tamaño especificado por el usuario
        int[] arreglo = new int[tamano];

        // Variables para controlar el llenado personalizado
        int ultimoIndice = -1; // Inicialmente no hay ningún índice ingresado
        boolean llenadoCompletado = false;

        while (!llenadoCompletado) {
            // Solicitar al usuario el número para rellenar el arreglo
            System.out.print("Ingrese el número entero con el que desea rellenar el arreglo: ");
            int numeroRelleno = scanner.nextInt();

            // Solicitar al usuario el índice hasta el cual quiere rellenar el arreglo
            int indiceRelleno;
            do {
                System.out.print("Ingrese el índice hasta el cual desea rellenar el arreglo (debe ser mayor que "
                        + ultimoIndice + "): ");
                indiceRelleno = scanner.nextInt();

                // Validar que el índice sea mayor que el último índice ingresado
                if (indiceRelleno <= ultimoIndice) {
                    System.out.println("El índice debe ser mayor que el último índice ingresado.");
                }
            } while (indiceRelleno <= ultimoIndice);

            // Validar que el índice esté dentro del rango del arreglo
            if (indiceRelleno >= tamano) {
                System.out.println("El índice debe ser menor que el tamaño del arreglo (" + tamano + ").");
                continue;
            }

            // Rellenar el arreglo desde el último índice ingresado hasta el nuevo índice
            for (int i = ultimoIndice + 1; i <= indiceRelleno; i++) {
                arreglo[i] = numeroRelleno;
            }

            // Actualizar el último índice ingresado
            ultimoIndice = indiceRelleno;

            // Verificar si se ha llenado completamente hasta el último índice del arreglo
            if (ultimoIndice == tamano - 1) {
                llenadoCompletado = true;
            }
        }

        // Imprimir el arreglo completo
        System.out.println("Arreglo llenado:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Índice " + i + ": " + arreglo[i]);
        }

        scanner.close();
    }
}
