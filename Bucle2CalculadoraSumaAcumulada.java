import java.util.Scanner;

public class Bucle2CalculadoraSumaAcumulada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;
        char continuar;

        do {
            System.out.print("Ingresa un número entero positivo: ");
            numero = scanner.nextInt();

            // Validar que el número sea positivo
            while (numero <= 0) {
                System.out.println("El número debe ser entero positivo. Intenta nuevamente.");
                System.out.print("Ingresa un número entero positivo: ");
                numero = scanner.nextInt();
            }

            // Acumular la suma de los números ingresados
            suma += numero;

            System.out.print("¿Deseas ingresar otro número? (s/n): ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        // Mostrar la suma acumulada
        System.out.println("La suma acumulada de los números ingresados es: " + suma);

        scanner.close();
    }
}
