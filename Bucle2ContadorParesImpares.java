import java.util.Scanner;

public class Bucle2ContadorParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int pares = 0;
        int impares = 0;
        char continuar;

        do {
            System.out.print("Ingresa un número entero: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            System.out.print("¿Deseas ingresar otro número? (s/n): ");
            continuar = scanner.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        System.out.println("Cantidad de números pares ingresados: " + pares);
        System.out.println("Cantidad de números impares ingresados: " + impares);

        scanner.close();
    }
}
