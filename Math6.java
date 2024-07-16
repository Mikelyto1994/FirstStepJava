import java.util.Scanner;

public class Math6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el límite inferior:");
        int limiteInferior = input.nextInt();
        System.out.println("Ingrese el límite superior:");
        int limiteSuperior = input.nextInt();

        // Asegurarse de que limiteInferior sea menor o igual a limiteSuperior
        int min = Math.min(limiteInferior, limiteSuperior);
        int max = Math.max(limiteInferior, limiteSuperior);

        // Generar un número aleatorio dentro del rango
        int numeroAleatorio = (int) (Math.random() * (max - min + 1)) + min;

        System.out.println("Número aleatorio generado entre " + min + " y " + max + " es: " + numeroAleatorio);

        input.close();
    }
}
