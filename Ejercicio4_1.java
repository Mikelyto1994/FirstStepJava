import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4_1 {
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

            double resultado = switch (operacion) {
                case 1 -> { // Área
                    yield switch (input.nextInt()) {
                        case 1 -> {
                            System.out.println("Ingrese el radio: ");
                            double radio = input.nextDouble();
                            yield Math.PI * Math.pow(radio, 2); // Área del círculo
                        }
                        case 2 -> {
                            System.out.println("Ingrese el lado: ");
                            double lado = input.nextDouble();
                            yield Math.pow(lado, 2); // Área del cuadrado
                        }
                        case 3 -> {
                            System.out.println("Ingrese la base: ");
                            double base = input.nextDouble();
                            System.out.println("Ingrese la altura: ");
                            double altura = input.nextDouble();
                            yield (base * altura) / 2; // Área del triángulo
                        }
                        default -> {
                            System.out.println("Opción no válida.");
                            yield 0;
                        }
                    };
                }
                case 2 -> { // Perímetro
                    yield switch (input.nextInt()) {
                        case 1 -> {
                            System.out.println("Ingrese el radio: ");
                            double radio = input.nextDouble();
                            yield 2 * Math.PI * radio; // Perímetro del círculo
                        }
                        case 2 -> {
                            System.out.println("Ingrese el lado: ");
                            double lado = input.nextDouble();
                            yield 4 * lado; // Perímetro del cuadrado
                        }
                        case 3 -> {
                            System.out.println("Ingrese la base: ");
                            double base = input.nextDouble();
                            System.out.println("Ingrese el lado 1: ");
                            double lado1 = input.nextDouble();
                            System.out.println("Ingrese el lado 2: ");
                            double lado2 = input.nextDouble();
                            yield base + lado1 + lado2; // Perímetro del triángulo
                        }
                        default -> {
                            System.out.println("Opción no válida.");
                            yield 0;
                        }
                    };
                }
                default -> {
                    System.out.println("Opción no válida.");
                    yield 0;
                }
            };

            if (resultado != 0) {
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
