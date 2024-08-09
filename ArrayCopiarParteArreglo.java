import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayCopiarParteArreglo {
    public static void main(String[] args) {
        // Declarar un array de enteros con 10 elementos
        int[] numeros = new int[10];

        // Crear una instancia de la clase Random
        Random random = new Random();

        // Inicializar el array con valores aleatorios entre 1 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1; // Genera un número entre 1 y 100
        }

        // Imprimir el array original con sus índices
        System.out.println("Array original con índices:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        int indiceInicial, indiceFinal;

        // Solicitar índices al usuario con validaciones
        while (true) {
            System.out.print("Ingrese el índice inicial: ");
            indiceInicial = scanner.nextInt();

            System.out.print("Ingrese el índice final: ");
            indiceFinal = scanner.nextInt();

            if (indiceInicial < 0 || indiceInicial >= numeros.length) {
                System.out.println("El índice inicial está fuera del rango del arreglo. Inténtelo de nuevo.");
            } else if (indiceFinal < 0 || indiceFinal >= numeros.length) {
                System.out.println("El índice final está fuera del rango del arreglo. Inténtelo de nuevo.");
            } else if (indiceInicial > indiceFinal) {
                System.out.println("El índice inicial debe ser menor o igual que el índice final. Inténtelo de nuevo.");
            } else {
                break;
            }
        }

        // Copiar la parte del arreglo comprendida entre los índices inicial y final
        // (inclusive)
        int[] copiaParte = Arrays.copyOfRange(numeros, indiceInicial, indiceFinal + 1);

        // Imprimir el nuevo arreglo
        System.out.println("Nuevo arreglo copiado entre los índices " + indiceInicial + " y " + indiceFinal + ":");
        System.out.println(Arrays.toString(copiaParte));

        // Cerrar el Scanner
        scanner.close();
    }
}
