import java.util.Scanner;

public class Metodo2ValidacionContraseñaaaa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar los criterios de seguridad para la contraseña
        mostrarCriterios();

        System.out.print("Ingrese una contraseña: ");
        String contraseña = scanner.nextLine();
        scanner.close();

        if (esSegura(contraseña)) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no es segura. Asegúrese de cumplir con todos los criterios.");
        }
    }

    // Método que muestra los criterios de seguridad para la contraseña
    public static void mostrarCriterios() {
        System.out.println("La contraseña debe cumplir con los siguientes criterios para ser considerada segura:");
        System.out.println("1. Tener al menos 8 caracteres.");
        System.out.println("2. Contener al menos una letra mayúscula.");
        System.out.println("3. Contener al menos una letra minúscula.");
        System.out.println("4. Contener al menos un número.");
        System.out.println("5. Contener al menos un carácter especial (por ejemplo: !, @, #, $, etc.).");
        System.out.println();
    }

    // Verifica si la contraseña cumple con todos los criterios
    public static boolean esSegura(String contraseña) {
        return tieneLongitudCorrecta(contraseña) &&
                tieneMayuscula(contraseña) &&
                tieneMinuscula(contraseña) &&
                tieneNumero(contraseña) &&
                tieneCaracterEspecial(contraseña);
    }

    // Verifica si la contraseña tiene al menos 8 caracteres
    public static boolean tieneLongitudCorrecta(String contraseña) {
        return contraseña.length() >= 8;
    }

    // Verifica si la contraseña contiene al menos una letra mayúscula
    public static boolean tieneMayuscula(String contraseña) {
        for (char c : contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    // Verifica si la contraseña contiene al menos una letra minúscula
    public static boolean tieneMinuscula(String contraseña) {
        for (char c : contraseña.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    // Verifica si la contraseña contiene al menos un número
    public static boolean tieneNumero(String contraseña) {
        for (char c : contraseña.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    // Verifica si la contraseña contiene al menos un carácter especial
    public static boolean tieneCaracterEspecial(String contraseña) {
        // Puedes ajustar el conjunto de caracteres especiales según tus necesidades
        String caracteresEspeciales = "!@#$%^&*()-_=+[]{}|;:,.<>?/`~";
        for (char c : contraseña.toCharArray()) {
            if (caracteresEspeciales.indexOf(c) >= 0) {
                return true;
            }
        }
        return false;
    }
}
