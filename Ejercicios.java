import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicios {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 7");
        
        try {
            int number = usuario.nextInt();
            String dia = switch (number) {
                case 1 -> "Lunes";
                case 2 -> "Martes";
                case 3 -> "Miércoles";
                case 4 -> "Jueves";
                case 5 -> "Viernes";
                case 6 -> "Sábado";
                case 7 -> "Domingo";
                default -> "No existe ese día";
            };
            System.out.println(dia);
        } catch (InputMismatchException e) {
            System.out.println("Intente con números.");
        }
    }
}