import java.util.Arrays;
import java.util.Random;

public class ArrayOrdenarArrayDescendente {
    public static void main(String[] args) {
        // Declarar un array de enteros con 10 elementos
        int[] numeros = new int[10];

        // Crear una instancia de la clase Random
        Random random = new Random();

        // Inicializar el array con valores aleatorios entre 1 y 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1; // Genera un número entre 1 y 100
        }

        // Imprimir el array inicial
        System.out.println("Array inicial:");
        System.out.println(Arrays.toString(numeros));

        // Ordenar el array en forma ascendente
        Arrays.sort(numeros);

        // Invertir el array para que esté en orden descendente
        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }

        // Imprimir el array ordenado en forma descendente
        System.out.println("Array ordenado en forma descendente:");
        System.out.println(Arrays.toString(numeros));
    }
}
