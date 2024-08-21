import modelo.Rectangulo;
import modelo.Triangulo;
import modelo.Circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Selecciona una figura geométrica:");
            System.out.println("1. Rectángulo");
            System.out.println("2. Triángulo");
            System.out.println("3. Círculo");
            System.out.println("4. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el ancho del rectángulo: ");
                    double ancho = scanner.nextDouble();
                    System.out.print("Ingresa el alto del rectángulo: ");
                    double alto = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(ancho, alto);
                    rectangulo.imprimirDatos();
                    break;

                case 2:
                    System.out.print("Ingresa la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingresa la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    Triangulo triangulo = new Triangulo(base, altura);
                    triangulo.imprimirDatos();
                    break;

                case 3:
                    System.out.print("Ingresa el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    Circulo circulo = new Circulo(radio);
                    circulo.imprimirDatos();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 4);

        scanner.close();
    }
}
