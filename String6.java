import java.util.Scanner;

public class String6 {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);

        // Ejercicio 1: Reemplazo de Caracteres
        System.out.println("1er ejercicio: Reemplazo de Caracteres");
        System.out.println("Ingrese una frase:");
        String frase = usuario.nextLine();
        System.out.println("Ingrese el primer carácter a reemplazar:");
        char caracter1 = usuario.next().charAt(0); // Se lee el primer carácter
        usuario.nextLine(); // Limpiar el buffer de entrada
        System.out.println("Ingrese el segundo carácter:");
        char caracter2 = usuario.next().charAt(0); // Se lee el segundo carácter
        String fraseReemplazada = frase.replace(caracter1, caracter2);
        System.out.println("Frase resultante: " + fraseReemplazada);

        // Ejercicio 2: Eliminación de Espacios en Blanco
        System.out.println("\nEjercicio 2: Eliminación de Espacios en Blanco");
        usuario.nextLine(); // Limpiar el buffer de entrada
        System.out.println("Ingrese una frase con espacios al inicio o final:");
        String fraseConEspacios = usuario.nextLine().trim(); // Aplicar trim() directamente aquí
        System.out.println("Frase sin espacios en blanco: " + fraseConEspacios);

        // Ejercicio 3: Comparación de Cadenas
        System.out.println("\nEjercicio 3: Comparación de Cadenas");
        System.out.println("Ingrese la primera palabra:");
        String palabra1 = usuario.next();
        System.out.println("Ingrese la segunda palabra:");
        String palabra2 = usuario.next();
        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras son iguales.");
        } else {
            System.out.println("Las palabras son diferentes.");
        }

        // Ejercicio 4: Calculando la Longitud de Cadenas sin Espacios
        System.out.println("\nEjercicio 4: Calculando la Longitud de Cadenas sin Espacios");
        usuario.nextLine(); // Limpiar el buffer de entrada
        System.out.println("Ingrese una frase para calcular su longitud sin espacios:");
        String fraseLongitud = usuario.nextLine();
        int longitudSinEspacios = fraseLongitud.replaceAll("\\s", "").length();
        System.out.println("Longitud de la frase sin espacios: " + longitudSinEspacios);

        usuario.close();
    }
}
