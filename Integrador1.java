import java.util.InputMismatchException;
import java.util.Scanner;

public class Integrador1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Ingrese una temperatura: ");
            Double numero = input.nextDouble();

            System.out.println("Ingrese la medida de la temperatura a la que deseas cambiar: (F o C) ");
            String unidad = input.next();

            double resultado;
            if (unidad.equalsIgnoreCase("C")) {
                resultado = (numero - 32) * 5 / 9;
                System.out.println(numero + " grados Fahrenheit equivalen a " + resultado + " grados Celsius");
            } else if (unidad.equalsIgnoreCase("F")) {
                resultado = (numero * 9 / 5) + 32;
                System.out.println(numero + " grados Celsius equivalen a " + resultado + " grados Fahrenheit");
            } else {
                System.out.println("Unidad no válida. Por favor, ingrese 'F' o 'C'.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Temperatura no válida. Ingrese una temperatura numérica.");
        } finally {
            input.close();
        }
    }
}
