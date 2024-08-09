import java.util.Scanner;

public class Metodo1MultiplicarV1 {

    // Variable global para el objeto Scanner
    private static Scanner scanner = new Scanner(System.in);

    // Método para pedir 3 números al usuario
    public static int[] pedirNumeros() {
        int[] numeros = new int[3];
        System.out.println("Por favor, ingrese 3 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un número válido.");
                scanner.next(); // Limpiar la entrada inválida
                System.out.print("Número " + (i + 1) + ": ");
            }
            numeros[i] = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
        }

        return numeros;
    }

    // Método para imprimir la tabla de multiplicar de cada número en el array
    public static void imprimirTablasMultiplicar(int[] numeros) {
        for (int numero : numeros) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
            System.out.println(); // Línea en blanco para separar las tablas
        }
    }

    public static void main(String[] args) {
        // Pedir los 3 números al usuario
        int[] numeros = pedirNumeros();

        // Imprimir la tabla de multiplicar de cada número ingresado
        imprimirTablasMultiplicar(numeros);

        // Cerrar el scanner al final
        scanner.close();
    }
}
