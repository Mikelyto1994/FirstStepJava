import java.util.Scanner;

public class Math2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número para redondearlo  \nTu número:");
        try {
            double operacion = input.nextDouble();
            double salida = Math.round(operacion);
            System.out.println("Tu numero redondeado es : " + salida);
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor ingrese números.");
        } finally {
            input.close();
        }
    }
}
