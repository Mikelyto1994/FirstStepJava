import java.util.Random;
import java.util.Scanner;

public class Metodo2AdivinarNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir el rango para el número aleatorio
        int rangoInferior = 1;
        int rangoSuperior = 20;

        // Generar el número aleatorio dentro del rango especificado
        int numeroAleatorio = numeroAleatorio(rangoInferior, rangoSuperior);
        int intento;

        System.out.println("Adivina el número entre " + rangoInferior + " y " + rangoSuperior + ":");

        do {
            // Solicitar al usuario que ingrese un número
            System.out.print("Ingresa tu intento: ");
            intento = scanner.nextInt();

            // Comparar el intento con el número aleatorio
            if (intento < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroAleatorio) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
            }

        } while (intento != numeroAleatorio);

        scanner.close();
    }

    // Método para generar un número aleatorio dentro del rango especificado
    public static int numeroAleatorio(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
