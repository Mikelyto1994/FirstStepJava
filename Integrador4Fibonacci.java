import java.util.Scanner;

public class Integrador4Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la posición en la serie de Fibonacci
        System.out.print("Ingrese la posición en la serie de Fibonacci: ");
        int posicion = scanner.nextInt();

        // Verificar que la posición sea válida
        if (posicion < 0) {
            System.out.println("La posición debe ser un número entero no negativo.");
        } else {
            // Calcular el número en la posición especificada
            int fibonacciNumero = calcularFibonacci(posicion);

            // Mostrar el resultado
            System.out.println(
                    "El número en la posición " + posicion + " de la serie de Fibonacci es: " + fibonacciNumero);
        }

        scanner.close();
    }

    // Método para calcular el número en la posición especificada
    private static int calcularFibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int a = 0; // Primer término
        int b = 1; // Segundo término
        int siguiente = 0;

        for (int i = 2; i <= n; i++) {
            siguiente = a + b; // Calcular el siguiente término
            a = b; // Mover el valor de b a a
            b = siguiente; // El siguiente término se convierte en b
        }

        return b; // El número en la posición n
    }
}
