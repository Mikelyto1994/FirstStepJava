import java.util.Scanner;

public class Metodo1Multiplicar {

    // Variable global para el objeto Scanner
    private static Scanner scanner = new Scanner(System.in);

    // Método para pedir un número al usuario
    public static int pedirNumero() {
        System.out.println("Por favor, ingrese un número:");
        while (!scanner.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número válido.");
            scanner.next(); // Limpiar la entrada inválida
        }
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        return numero;
    }

    // Método para imprimir la tabla de multiplicar del número dado
    public static void imprimirTablaMultiplicar(int numero) {
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void main(String[] args) {
        // Pedir el número al usuario
        int numero = pedirNumero();

        // Imprimir la tabla de multiplicar del número ingresado
        imprimirTablaMultiplicar(numero);

        // Cerrar el scanner al final
        scanner.close();
    }
}
