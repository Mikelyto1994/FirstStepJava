import java.util.Scanner;

public class Metodo2Calificacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entre 0 y 100: ");
        int puntuacion = scanner.nextInt();

        // Validar que la puntuación esté en el rango correcto
        if (puntuacion < 0 || puntuacion > 100) {
            System.out.println("Puntuación inválida. Debe estar entre 0 y 100.");
        } else {
            String nota = obtenerNota(puntuacion);
            System.out.println("La calificación obtenida es: " + nota);
        }

        scanner.close(); // Cierra el Scanner al final del programa
    }

    public static String obtenerNota(int puntuacion) {
        String nota;

        // Utiliza una estructura switch tradicional para determinar la nota
        switch (puntuacion / 10) {
            case 10: // Cubre el caso para 100
            case 9:
                nota = "A";
                break;
            case 8:
                nota = "B";
                break;
            case 7:
                nota = "C";
                break;
            case 6:
                nota = "D";
                break;
            default:
                nota = "F";
                break;
        }

        return nota;
    }
}
