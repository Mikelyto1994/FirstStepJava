import java.util.Scanner;

class Rectangulo {
    // Atributos
    private double ancho;
    private double alto;
    private static int contadorRectangulos = 0; // Atributo estático para contar instancias

    // Constructor que inicializa ancho y alto, e incrementa el contador
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
        contadorRectangulos++;
    }

    // Método para calcular el área del rectángulo
    public double area() {
        return ancho * alto;
    }

    // Método para calcular el perímetro del rectángulo
    public double perimetro() {
        return 2 * (ancho + alto);
    }

    // Método para imprimir el área
    public void imprimirArea() {
        System.out.println("Área del rectángulo: " + area());
    }

    // Método para imprimir el perímetro
    public void imprimirPerimetro() {
        System.out.println("Perímetro del rectángulo: " + perimetro());
    }

    // Método estático para obtener el número total de rectángulos creados
    public static int obtenerContadorRectangulos() {
        return contadorRectangulos;
    }
}

public class Poo1Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangulo rectangulo = null;

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Crear un nuevo rectángulo");
            System.out.println("2. Imprimir área del rectángulo");
            System.out.println("3. Imprimir perímetro del rectángulo");
            System.out.println("4. Mostrar número total de rectángulos creados");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción (1, 2, 3, 4, 5): ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    // Crear un nuevo rectángulo
                    System.out.println("Ingrese el ancho del rectángulo: ");
                    double ancho = scanner.nextDouble();

                    System.out.println("Ingrese el alto del rectángulo: ");
                    double alto = scanner.nextDouble();
                    scanner.nextLine(); // Consumir el salto de línea

                    rectangulo = new Rectangulo(ancho, alto);
                    System.out.println("Rectángulo creado con éxito.");
                    break;

                case 2:
                    // Imprimir el área del rectángulo
                    if (rectangulo != null) {
                        rectangulo.imprimirArea();
                    } else {
                        System.out.println("No se ha creado ningún rectángulo aún.");
                    }
                    break;

                case 3:
                    // Imprimir el perímetro del rectángulo
                    if (rectangulo != null) {
                        rectangulo.imprimirPerimetro();
                    } else {
                        System.out.println("No se ha creado ningún rectángulo aún.");
                    }
                    break;

                case 4:
                    // Mostrar el número total de rectángulos creados
                    System.out
                            .println("Número total de rectángulos creados: " + Rectangulo.obtenerContadorRectangulos());
                    break;

                case 5:
                    // Salir
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opción no válida, por favor selecciona una opción entre 1 y 5.");
            }
        }
    }
}
