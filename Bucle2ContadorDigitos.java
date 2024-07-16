import java.util.Scanner;

public class Bucle2ContadorDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        // Convierte el número a su valor absoluto para contar los dígitos
        int numeroAbsoluto = Math.abs(numero);

        // Inicializa el contador de dígitos
        int contadorDigitos = 0;

        // Manejo especial para el número 0
        if (numeroAbsoluto == 0) {
            contadorDigitos = 1; // El número 0 tiene un dígito
        } else {
            // Bucle while para contar los dígitos
            while (numeroAbsoluto != 0) {
                numeroAbsoluto = numeroAbsoluto / 10;
                contadorDigitos++;
            }
        }

        // Imprime el resultado
        System.out.println("El número " + numero + " tiene " + contadorDigitos + " dígitos.");

        scanner.close();
    }
}
