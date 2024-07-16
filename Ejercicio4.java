import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Seleccione la operación que desea realizar: \n 1. Área \n 2. Perímetro");

        try {
            int operacion = input.nextInt();
            if (operacion < 1 || operacion > 2) {
                System.out.println("Opción no válida. Intente nuevamente.");
                return;
            }

            System.out.println(
                    "Ingrese una opción para figura geométrica: \n Opción 1: Círculo \n Opción 2: Cuadrado \n Opción 3: Triángulo");

            double resultado = switch (input.nextInt()) {
                case 1 -> {
                    System.out.println("Ingrese el radio: ");
                    double radio = input.nextDouble();
                    if (operacion == 1) {
                        yield Math.PI * Math.pow(radio, 2); // Área del círculo
                    } else {
                        yield 2 * Math.PI * radio; // Perímetro del círculo
                    }
                }
                case 2 -> {
                    System.out.println("Ingrese el lado: ");
                    double lado = input.nextDouble();
                    if (operacion == 1) {
                        yield Math.pow(lado, 2); // Área del cuadrado
                    } else {
                        yield 4 * lado; // Perímetro del cuadrado
                    }
                }
                case 3 -> {
                    System.out.println("Ingrese la base: ");
                    double base = input.nextDouble();
                    System.out.println("Ingrese la altura: ");
                    double altura = input.nextDouble();
                    if (operacion == 1) {
                        yield (base * altura) / 2; // Área del triángulo
                    } else {
                        System.out.println("Ingrese el lado 1: ");
                        double lado1 = input.nextDouble();
                        System.out.println("Ingrese el lado 2: ");
                        double lado2 = input.nextDouble();
                        yield base + lado1 + lado2; // Perímetro del triángulo
                    }
                }
                default -> 0;
            };

            if (resultado == 0) {
                System.out.println("Opción no válida.");
            } else {
                if (operacion == 1) {
                    System.out.println("El área es: " + resultado);
                } else {
                    System.out.println("El perímetro es: " + resultado);
                }
            }

            input.close();
        } catch (InputMismatchException error) {
            System.out.println("Intente con números.");
        }
    }
}
