import java.util.Random;

public class Bucle1ForeachContandoElementosPares {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();

        // Inicializa el array con números aleatorios menores a 100
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        // Imprime todos los elementos del array en una única línea
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Cuenta los elementos pares
        int countPares = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                countPares++;
            }
        }

        // Muestra el total de elementos pares en la consola
        System.out.println("Total de elementos pares: " + countPares);
    }
}