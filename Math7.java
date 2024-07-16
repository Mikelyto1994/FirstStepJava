import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Math7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número entre 1 y 30:");
        int numeroLimite = input.nextInt();

        if (numeroLimite < 1 || numeroLimite > 30) {
            System.out.println("El número ingresado no está dentro del rango permitido.");
        } else {
            // Generar un número aleatorio entre 1 y numeroLimite
            int numeroAleatorio = (int) (Math.random() * numeroLimite) + 1;
            double raizCuadrada = Math.sqrt(numeroAleatorio);

            // Verificar si el número aleatorio es primo y encontrar divisores
            boolean esPrimo = true;
            List<Integer> divisores = new ArrayList<>();

            if (numeroAleatorio <= 1) {
                esPrimo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(numeroAleatorio); i++) {
                    if (numeroAleatorio % i == 0) {
                        esPrimo = false;
                        divisores.add(i);
                        if (i != numeroAleatorio / i) {
                            divisores.add(numeroAleatorio / i);
                        }
                    }
                }
            }

            // Mostrar los resultados
            if (esPrimo) {
                System.out.println("El número aleatorio " + numeroAleatorio + " es primo.");
            } else {
                System.out.println(
                        "El número aleatorio " + numeroAleatorio + " no es primo, es divisible por " + divisores);
            }
            System.out.println("El número aleatorio generado es: " + numeroAleatorio);
            System.out.println("La raíz cuadrada del número aleatorio es: " + raizCuadrada);
        }

        input.close();
    }
}
