import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese dos números para poder dividirlos \nTu primer número dividendo:");
        try {
            BigDecimal operacion = input.nextBigDecimal();
            System.out.println("Ingrese el segundo número como divisor:");
            BigDecimal operacion2 = input.nextBigDecimal();

            try {
                BigDecimal resultado = operacion.divide(operacion2, RoundingMode.HALF_UP);
                System.out.println("El valor de la división es: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre cero");
            }

            input.close();
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor ingrese números.");
        }
    }
}