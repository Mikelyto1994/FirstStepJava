import java.util.Scanner;

public class Integrador4factorial {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int numero = -1;
            long factorial = 1;

            // Solicitar un número entero positivo
            while (numero < 0) {
                System.out.print("Ingrese un número entero positivo: ");
                try {
                    numero = scanner.nextInt();
                    if (numero < 0) {
                        System.out.println("El número no es positivo. Intente de nuevo.");
                    }
                } catch (Exception e) {
                    System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                    scanner.next(); // Limpiar el buffer del scanner
                }
            }

            // Calcular el factorial
            int i = 1;
            while (i <= numero) {
                factorial *= i;
                i++;
            }

            // Mostrar el resultado
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }
}
