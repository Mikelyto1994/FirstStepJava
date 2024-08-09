import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayBusquedaBinaria {
    public static void main(String[] args) {
        // Declarar un array de enteros con 10 elementos
        int[] numeros = new int[10];

        // Crear una instancia de la clase Random
        Random random = new Random();

        // Inicializar el array con valores aleatorios entre 1 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1; // Genera un número entre 1 y 100
        }

        // Ordenar el array en forma ascendente
        Arrays.sort(numeros);

        // Imprimir el array ordenado
        System.out.println("Array ordenado:");
        System.out.println(Arrays.toString(numeros));

        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor a buscar: ");
        int valorBuscado = scanner.nextInt();

        // Realizar la búsqueda binaria
        int indice = Arrays.binarySearch(numeros, valorBuscado);

        // Imprimir el resultado de la búsqueda
        if (indice >= 0) {
            System.out.println("El valor " + valorBuscado + " se encuentra en el índice: " + indice);
        } else {
            // El valor no se encuentra en el array, manejar el índice negativo
            int insertionPoint = -indice - 1;
            if (insertionPoint == 0) {
                System.out.println(
                        "El valor " + valorBuscado + " no se encuentra en el arreglo. Está antes de " + numeros[0]);
            } else if (insertionPoint == numeros.length) {
                System.out.println("El valor " + valorBuscado + " no se encuentra en el arreglo. Está después de "
                        + numeros[numeros.length - 1]);
            } else {
                System.out.println("El valor " + valorBuscado + " no se encuentra en el arreglo. Está entre "
                        + numeros[insertionPoint - 1] + " y " + numeros[insertionPoint]);
            }
        }

        // Cerrar el Scanner
        scanner.close();
    }
}
