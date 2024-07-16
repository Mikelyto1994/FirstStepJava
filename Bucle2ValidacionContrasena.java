import java.util.Scanner;

public class Bucle2ValidacionContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contrasena;

        System.out.println("Bienvenido. Por favor, ingresa la contraseña:");
        contrasena = scanner.nextLine();

        while (!contrasena.equals("secreto")) {
            System.out.println("Contraseña incorrecta. Inténtalo nuevamente:");
            contrasena = scanner.nextLine();
        }

        System.out.println("Contraseña correcta. ¡Bienvenido!");

        scanner.close();
    }
}
