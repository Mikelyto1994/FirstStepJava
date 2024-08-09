import java.util.Arrays;
import java.util.Random;

public class ArraysCompararArreglos {
    public static void main(String[] args) {
        // Declarar dos arreglos de enteros con 10 elementos cada uno
        int[] numeros1 = new int[10];
        int[] numeros2 = new int[10];

        // Crear una instancia de la clase Random
        Random random = new Random();

        // Inicializar ambos arreglos con valores aleatorios entre 1 y 100
        for (int i = 0; i < 10; i++) {
            numeros1[i] = random.nextInt(100) + 1;
            numeros2[i] = random.nextInt(100) + 1;
        }

        // Imprimir los arreglos
        System.out.println("Array 1:");
        System.out.println(Arrays.toString(numeros1));

        System.out.println("Array 2:");
        System.out.println(Arrays.toString(numeros2));

        // Comparar los arreglos
        boolean sonIguales = Arrays.equals(numeros1, numeros2);

        // Imprimir el resultado de la comparación
        if (sonIguales) {
            System.out.println("Los arreglos son iguales.");
        } else {
            System.out.println("Los arreglos no son iguales.");
        }
    }
}
