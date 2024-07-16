import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        // Establecer el encoding del sistema
        System.setProperty("file.encoding", "UTF-8");

        Scanner usuario = new Scanner(System.in);

        // Pedir al usuario que ingrese una palabra
        System.out.println("Escriba una palabra:");
        String palabra = usuario.nextLine();

        // Pedir al usuario que ingrese un carácter
        System.out.println("Escriba un carácter para determinar si está dentro de la palabra:");
        char caracter = usuario.next().charAt(0);

        // Usar el método indexOf para determinar si el carácter está en la palabra
        int posicion = palabra.indexOf(caracter);

        // Mostrar un mensaje adecuado
        if (posicion != -1) {
            System.out.println("El carácter '" + caracter + "' se encuentra en la posición: " + posicion);
        } else {
            System.out.println("El carácter '" + caracter + "' no se encuentra en la palabra.");
        }

        usuario.close();
    }
}
