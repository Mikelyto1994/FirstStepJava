import java.util.Scanner;

public class Math1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número para volverlo absoluto \nTu número:");
        try {
            int operacion = input.nextInt();
            int salida = Math.abs(operacion);
            System.out.println("Tu numero en valor absoluto es: " + salida);
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor ingrese números.");
        } finally {
            input.close();
        }
    }
}
