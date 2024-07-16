import java.util.Random;
import java.util.Scanner;

public class Bucle2AdivinaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generar un número aleatorio entre 1 y 20
        int numeroAleatorio = random.nextInt(20) + 1;
        int intento;
        boolean adivinado = false;

        System.out.println("Bienvenido al juego de adivinar el número (entre 1 y 20)!");
        System.out.print("Ingresa tu intento: ");
        intento = scanner.nextInt();

        while (adivinado == false) {
            if (intento == numeroAleatorio) {
                System.out.println("¡Felicidades! ¡Has adivinado el número " + numeroAleatorio + "!");
                adivinado = true;
            } else if (intento < numeroAleatorio) {
                System.out.println("El número que ingresaste es menor que el número secreto. Sigue intentando.");
            } else {
                System.out.println("El número que ingresaste es mayor que el número secreto. Sigue intentando.");
            }

            if (!adivinado) {
                System.out.print("Ingresa tu intento: ");
                intento = scanner.nextInt();
            }
        }

        scanner.close();
    }
}
