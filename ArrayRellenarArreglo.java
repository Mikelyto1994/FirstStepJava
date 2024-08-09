import java.util.Arrays;
import java.util.Scanner;

public class ArrayRellenarArreglo {
    public static void main(String[] args) {
        // Crear una instancia de Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el tamaño del arreglo
        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamano = scanner.nextInt();

        // Solicitar al usuario el número entero con el que desea rellenar el arreglo
        System.out.print("Ingrese el número entero con el que desea rellenar el arreglo: ");
        int numeroRelleno = scanner.nextInt();

        // Crear el arreglo del tamaño especificado por el usuario
        int[] arreglo = new int[tamano];

        // Rellenar el arreglo con el número entero utilizando Arrays.fill()
        Arrays.fill(arreglo, numeroRelleno);

        // Imprimir el arreglo resultante
        System.out.println("Arreglo rellenado con el número " + numeroRelleno + ":");
        System.out.println(Arrays.toString(arreglo));

        // Cerrar el Scanner
        scanner.close();
    }
}
