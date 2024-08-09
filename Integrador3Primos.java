import java.util.Scanner;

public class Integrador3Primos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            // Solicitar al usuario que introduzca un número
            System.out.print("Introduce un número (0 para salir): ");
            numero = scanner.nextInt();

            // Verificar si el número es 0 para finalizar
            if (numero == 0) {
                System.out.println("Programa terminado.");
                break;
            }

            // Verificar si el número es primo
            if (esPrimo(numero)) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo. Inténtalo de nuevo.");
            }

        } while (!esPrimo(numero) || numero != 0);

        scanner.close();
    }

    // Método para verificar si un número es primo
    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // El número es divisible por algún número distinto de 1 y él mismo
            }
        }
        return true; // El número es primo
    }
}
