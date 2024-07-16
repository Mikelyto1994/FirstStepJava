import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        // Establecer el encoding del sistema
        System.setProperty("file.encoding", "UTF-8");

        Scanner usuario = new Scanner(System.in);

        // Pedir al usuario que ingrese una oración
        System.out.println("Escriba una oración:");
        String texto = usuario.nextLine();

        // Pedir al usuario que elija una opción
        int opcion = 0;
        while (opcion != 1 && opcion != 2) {
            System.out.println("Elija una opción:");
            System.out.println("1: Ver la oración en minúsculas");
            System.out.println("2: Ver la oración en mayúsculas");
            if (usuario.hasNextInt()) {
                opcion = usuario.nextInt();
                if (opcion != 1 && opcion != 2) {
                    System.out.println("Opción no válida. Por favor, elija 1 o 2.");
                }
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                usuario.next(); // Limpiar la entrada no válida
            }
        }

        // Usar switch expression para realizar la conversión basada en la opción del
        // usuario
        String resultado = switch (opcion) {
            case 1 -> texto.toLowerCase();
            case 2 -> texto.toUpperCase();
            default -> throw new IllegalStateException("Valor inesperado: " + opcion);
        };

        // Mostrar el resultado
        System.out.println("Resultado: " + resultado);

        usuario.close();
    }
}
