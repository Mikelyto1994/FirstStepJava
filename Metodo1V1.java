import java.util.Scanner;

public class Metodo1V1 {

    // Variable global para el objeto Scanner
    private static Scanner pepe = new Scanner(System.in);

    // Método que imprime el nombre
    public static void imprimeNombre(String nombre) {
        System.out.println("Mi nombre es " + nombre);
    }

    // Método que imprime el nombre y la edad
    public static void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años.");
    }

    // Método para obtener el nombre
    public static String obtenerNombre() {
        System.out.println("Por favor ingrese un nombre:");
        return pepe.nextLine();
    }

    // Método para obtener la edad con validación
    public static int obtenerEdad() {
        System.out.println("Por favor ingrese una edad:");
        while (!pepe.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número válido.");
            pepe.next(); // Limpiar la entrada inválida
        }
        int edad = pepe.nextInt();
        pepe.nextLine(); // Limpiar el buffer
        return edad;
    }

    public static void main(String[] args) {
        // Obtener el nombre y la edad usando los métodos
        String nombre = obtenerNombre();
        int edad = obtenerEdad();

        // Llamar al método para imprimir el nombre
        imprimeNombre(nombre);

        // Llamar al método para imprimir el nombre y la edad
        imprimeNombreYEdad(nombre, edad);

        // Cerrar el scanner al final
        pepe.close();
    }
}
