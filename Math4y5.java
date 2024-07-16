import java.util.Scanner;

public class Math4y5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Ingrese dos números para calcular la potencia \nTu número base es:");
            double operacion = input.nextDouble();
            System.out.println("Tu número exponente es:");
            double operacion2 = input.nextDouble();
            double salida = Math.pow(operacion, operacion2);
            System.out.println("Tu número potenciado es : " + salida);

            System.out.println("Ingrese un número para sacar raíz cuadrada \nTu número es:");
            double operacion3 = input.nextDouble();
            if (operacion3 < 0) {
                operacion3 = Math.abs(operacion3);
                System.out
                        .println(
                                "Se volvió absoluto tu número negativo: " + operacion3 + ", teniendo el resultado en:");
            }
            double salida2 = Math.sqrt(operacion3);
            System.out.println("Tu número con raíz cuadrada es : " + salida2);
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor ingrese números.");
        } finally {
            input.close();
        }
    }
}
