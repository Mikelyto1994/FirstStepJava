import java.util.Scanner;

public class Bucle1ForEachContarOcurrenciasCaracter {
    public static void main(String[] args) {
        // Definir la frase inicial en un array de caracteres
        char[] frase = { 'a', 'p', 'r', 'e', 'n', 'd', 'i', 'e', 'n', 'd', 'o', ' ', 'j', 'a', 'v', 'a' };

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario un carácter objetivo
        System.out.print("Ingresa un carácter objetivo: ");
        char objetivo = scanner.next().charAt(0);

        // Contar cuántas veces aparece el carácter objetivo en el array
        int contador = 0;
        for (char c : frase) {
            if (c == objetivo) {
                contador++;
            }
        }

        // Imprimir el resultado según las ocurrencias encontradas
        if (contador > 0) {
            System.out.println("El carácter \"" + objetivo + "\" aparece " + contador + " veces.");
        } else {
            System.out.println("El carácter \"" + objetivo + "\" no aparece en la frase.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
