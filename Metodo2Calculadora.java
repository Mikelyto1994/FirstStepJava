import java.util.Scanner;

public class Metodo2Calculadora {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        scanner.close(); // Cierra el Scanner al final del programa
    }

    public static void menu() {
        int opcion;

        do {
            System.out.println("=== Calculadora ===\n 1. Sumar \n" + //
                    " 2. Restar \n 3. Multiplicar \n 4. Dividir \n 5. Salir \n Selecciones una opción:  ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                double numero1 = solicitarNumero("Ingrese el primer número: ");
                double numero2 = solicitarNumero("Ingrese el segundo número: ");
                double resultado = realizarOperacion(opcion, numero1, numero2);
                String nombreOperacion = obtenerNombreOperacion(opcion);
                System.out.println("El resultado de la " + nombreOperacion + " es: " + resultado);
            } else if (opcion != 5) {
                System.out.println("Opción no válida. Por favor, elija una opción entre 1 y 5.");
            }

            System.out.println();

        } while (opcion != 5);

        System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
    }

    public static double solicitarNumero(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextDouble();
    }

    public static double realizarOperacion(int opcion, double numero1, double numero2) {
        double resultado = 0;

        switch (opcion) {
            case 1:
                resultado = sumar(numero1, numero2);
                break;
            case 2:
                resultado = restar(numero1, numero2);
                break;
            case 3:
                resultado = multiplicar(numero1, numero2);
                break;
            case 4:
                resultado = dividir(numero1, numero2);
                break;
        }

        return resultado;
    }

    public static String obtenerNombreOperacion(int opcion) {
        switch (opcion) {
            case 1:
                return "Suma";
            case 2:
                return "Resta";
            case 3:
                return "Multiplicación";
            case 4:
                return "División";
            default:
                return "";
        }
    }

    public static double sumar(double numero1, double numero2) {
        return numero1 + numero2;
    }

    public static double restar(double numero1, double numero2) {
        return numero1 - numero2;
    }

    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public static double dividir(double numero1, double numero2) {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("Error: No se puede dividir por cero.");
            return Double.NaN; // Retorna NaN para indicar un error en la operación
        }
    }
}