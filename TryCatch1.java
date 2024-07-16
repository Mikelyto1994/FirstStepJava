import java.util.Scanner;

public class TryCatch1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese dos numeros enteros para poder dividirlos \n Tu primer número dividendo:");
        int resultado;
        try {
            int operacion = input.nextInt();
            System.out.println("Ingrese el segundo número como divisor:");
            int operacion2 = input.nextInt();
            resultado = operacion / operacion2;
            System.out.println("El valor de la división es: " + resultado);

            input.close();
        } catch (ArithmeticException error) {
            System.out.println("No se puede dividir entre cero");
        }
    }
}
