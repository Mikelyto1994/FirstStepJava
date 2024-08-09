import java.util.Random;
import java.util.Scanner;

public class Metodo2ArrayAleatorio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario el tamaño del array
        System.out.print("Ingrese el tamaño del array: ");
        int tamaño = scanner.nextInt();

        // Solicitar al usuario el rango de números posibles
        System.out.print("Ingrese el valor mínimo del rango: ");
        int rangoInferior = scanner.nextInt();
        System.out.print("Ingrese el valor máximo del rango: ");
        int rangoSuperior = scanner.nextInt();

        // Validar el rango
        if (rangoSuperior <= rangoInferior) {
            System.out.println("El valor máximo debe ser mayor que el valor mínimo.");
            scanner.close();
            return;
        }

        // Generar el array con números aleatorios
        int[] array = generarArrayAleatorio(tamaño, rangoInferior, rangoSuperior);

        // Imprimir el array generado
        System.out.println("Array generado:");
        imprimirArray(array);

        scanner.close();
    }

    // Método para generar un array de enteros aleatorios
    public static int[] generarArrayAleatorio(int tamaño, int rangoInferior, int rangoSuperior) {
        Random random = new Random();
        int[] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            array[i] = random.nextInt(rangoSuperior - rangoInferior + 1) + rangoInferior;
        }
        return array;
    }

    // Método para imprimir un array de enteros
    public static void imprimirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
