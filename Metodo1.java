import java.util.Scanner;

public class Metodo1 {

    // Método que imprime el nombre
    public static void imprimeNombre(String nombre) {
        System.out.println("Mi nombre es " + nombre);
    }

    // Método que imprime el nombre y la edad
    public static void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años.");
    }

    public static void main(String[] args) {
        Scanner pepe = new Scanner(System.in);

        // Solicitar el nombre al usuario
        System.out.println("Por favor ingrese un nombre:");
        String nombre = pepe.nextLine();

        // Solicitar la edad al usuario con validación
        System.out.println("Por favor ingrese una edad:");
        while (!pepe.hasNextInt()) {
            System.out.println("Error: Debe ingresar un número válido.");
            pepe.next(); // Limpiar la entrada inválida
        }
        int edad = pepe.nextInt();

        // Llamar al método para imprimir el nombre
        imprimeNombre(nombre);

        // Llamar al método para imprimir el nombre y la edad
        imprimeNombreYEdad(nombre, edad);
        pepe.close();
    }
}
