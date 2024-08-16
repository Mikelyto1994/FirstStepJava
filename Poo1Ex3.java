import java.util.Scanner;

class Auto {
    // Atributos
    private String marca;
    private String modelo;
    private int año;

    // Constructor que inicializa marca, modelo y año
    public Auto(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Constructor que inicializa marca y modelo
    public Auto(String marca, String modelo) {
        this(marca, modelo, 0); // Llama al constructor con todos los parámetros, asignando 0 como año
                                // predeterminado
    }

    // Constructor que inicializa solamente la marca
    public Auto(String marca) {
        this(marca, "", 0); // Llama al constructor con todos los parámetros, asignando valores
                            // predeterminados para modelo y año
    }

    // Constructor sin parámetros
    public Auto() {
        this("", "", 0); // Llama al constructor con todos los parámetros, asignando valores
                         // predeterminados
    }

    // Método para imprimir los datos del auto
    public void imprimirDatos() {
        System.out.println("Marca: " + (marca.isEmpty() ? "No especificado" : marca));
        System.out.println("Modelo: " + (modelo.isEmpty() ? "No especificado" : modelo));
        System.out.println("Año: " + (año == 0 ? "No especificado" : año));
    }
}

public class Poo1Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Auto auto = null;

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Crear un nuevo auto");
            System.out.println("2. Imprimir datos del auto");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción (1, 2, 3): ");
            int opcion = 0;

            try {
                opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea

                switch (opcion) {
                    case 1:
                        // Crear un nuevo auto
                        System.out.println("Ingrese la marca del auto (dejar vacío para no especificar): ");
                        String marca = scanner.nextLine();

                        System.out.println("Ingrese el modelo del auto (dejar vacío para no especificar): ");
                        String modelo = scanner.nextLine();

                        System.out.println("Ingrese el año del auto (0 para no especificar): ");
                        int año = scanner.nextInt();
                        scanner.nextLine(); // Consumir el salto de línea

                        // Crear el auto usando los constructores válidos
                        if (marca.isEmpty() && modelo.isEmpty() && año == 0) {
                            auto = new Auto(); // Constructor sin parámetros
                        } else if (modelo.isEmpty() && año == 0) {
                            auto = new Auto(marca, "", año); // Constructor que inicializa solamente la marca
                        } else if (marca.isEmpty()) {
                            auto = new Auto("", modelo, año); // Constructor que inicializa modelo y año
                        } else {
                            auto = new Auto(marca, modelo, año); // Constructor que inicializa todos los atributos
                        }
                        System.out.println("Auto creado con éxito.");
                        break;

                    case 2:
                        // Imprimir los datos del auto
                        if (auto != null) {
                            auto.imprimirDatos();
                        } else {
                            System.out.println("No se ha creado ningún auto aún.");
                        }
                        break;

                    case 3:
                        // Salir
                        System.out.println("Saliendo...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Opción no válida, por favor selecciona 1, 2 o 3.");
                }
            } catch (Exception e) {
                System.out.println("Entrada no válida. Por favor ingresa un número.");
                scanner.nextLine(); // Limpiar el buffer de entrada
            }
        }
    }
}
