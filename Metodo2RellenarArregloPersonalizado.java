import java.util.Scanner;

public class Metodo2RellenarArregloPersonalizado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = scanner.nextInt();

        // Crear el arreglo con el tamaño especificado
        int[] array = new int[tamaño];

        // Llamar al método para rellenar el arreglo
        rellenarArray(array);

        // Imprimir el arreglo completo
        System.out.println("Arreglo final:");
        imprimirArray(array);

        scanner.close();
    }

    // Método para rellenar el arreglo
    public static void rellenarArray(int[] array) {
        Scanner scanner = new Scanner(System.in);

        int ultimoIndice = -1;

        while (ultimoIndice < array.length - 1) {
            System.out.print("Ingrese un número para rellenar el arreglo: ");
            int numero = scanner.nextInt();

            // Mensaje de solicitud personalizado para el índice
            if (ultimoIndice == -1) {
                System.out.print("Ingrese el índice hasta el cual desea rellenar con el número: ");
            } else {
                System.out.print(
                        "Ingrese el índice hasta el cual desea continuar después del índice " + ultimoIndice + ": ");
            }
            int indice = scanner.nextInt();

            // Validar el índice
            if (indice < 0 || indice >= array.length) {
                System.out.println("El índice debe estar entre 0 y " + (array.length - 1) + ". Intente nuevamente.");
                continue;
            }

            if (indice <= ultimoIndice) {
                System.out.println("El índice debe ser mayor que el último índice ingresado. Intente nuevamente.");
                continue;
            }

            // Rellenar el arreglo con el número desde el último índice hasta el nuevo
            // índice
            for (int i = ultimoIndice + 1; i <= indice; i++) {
                array[i] = numero;
            }

            ultimoIndice = indice;

            // Verificar si el arreglo está completamente lleno
            if (ultimoIndice == array.length - 1) {
                break;
            }
        }
    }

    // Método para imprimir el arreglo
    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
