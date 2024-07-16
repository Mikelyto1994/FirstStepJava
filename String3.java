import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        // Establecer el encoding del sistema
        System.setProperty("file.encoding", "UTF-8");

        Scanner usuario = new Scanner(System.in);
        System.out.println("Escriba una oración o frase");
        String texto = usuario.nextLine();
        System.out.println(
                "A continuación tiene que ingresar 2 valores de números que serán los índices inicial y final \npara extraer una cadena de texto de tu frase: ");

        int val1 = 0, val2 = 0;
        boolean validInput = false;

        // Solicitar el primer valor
        while (!validInput) {
            System.out.println("Ingrese el 1er valor que será el índice inicial: ");
            if (usuario.hasNextInt()) {
                val1 = usuario.nextInt();
                validInput = true;
            } else {
                System.out.println("Ingrese un número válido");
                usuario.next(); // Limpiar el input inválido
            }
        }

        validInput = false; // Resetear la bandera para el segundo valor

        // Solicitar el segundo valor
        while (!validInput) {
            System.out.println("Escriba el 2do valor que será el índice final: ");
            if (usuario.hasNextInt()) {
                val2 = usuario.nextInt();
                validInput = true;
            } else {
                System.out.println("Ingrese un número válido");
                usuario.next(); // Limpiar el input inválido
            }
        }

        try {
            String total = texto.substring(val1 - 1, val2);
            System.out.println("La cadena de texto es: " + total);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Los índices están fuera de rango");
        } finally {
            usuario.close();
        }
    }
}

/*
 * import java.util.Scanner;
 * 
 * public class String3 {
 * public static void main(String[] args) {
 * // Establecer el encoding del sistema
 * System.setProperty("file.encoding", "UTF-8");
 * 
 * Scanner usuario = new Scanner(System.in);
 * System.out.println("Escriba una oración o frase");
 * String texto = usuario.nextLine();
 * System.out.println(
 * "A continuación tiene que ingresar 2 valores de números que serán los índices inicial y final \npara extraer una cadena de texto de tu frase: \nIngrese el 1er valor que será el índice inicial: "
 * );
 * try {
 * int val1 = usuario.nextInt();
 * System.out.println("Escriba el 2do valor que será el índice final: ");
 * int val2 = usuario.nextInt();
 * String total = texto.substring(val1 - 1, val2);
 * System.out.println("La cadena de texto es: " + total);
 * } catch (Exception e) {
 * System.out.println("Ingrese un número");
 * }
 * usuario.close();
 * }
 * }
 */