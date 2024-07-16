import java.util.Scanner;

public class TryCatch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese dos numeros enteros para poder restarlos \n Tu primer número minuendo:");
        int resultado;
        try {
            int operacion = input.nextInt();
            System.out.println("Ingrese el segundo número como sustraendo:");
            int operacion2 = input.nextInt();
            resultado = operacion - operacion2;
            System.out.println("El valor de la diferencia es: " + operacion + " - " + operacion2 + " = " + resultado);

            input.close();
        } catch (Exception error) {
            System.out.println("Ingrese numeros");
        }
    }
}
