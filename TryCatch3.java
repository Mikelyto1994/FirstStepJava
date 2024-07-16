import java.util.Scanner;

public class TryCatch3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, ingrese una cadena que represente un número entero:");
        String cadena = input.nextLine();

        try {
            int numero = Integer.parseInt(cadena);
            System.out.println("El número entero ingresado es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: La cadena ingresada no puede ser convertida en un número entero.");
        }

        input.close();
    }
}
