import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Menú \n  Opción 1: 'Guardar' \n Opción 2: 'Cargar' \n Opción 3: 'Salir'");
        
        try {
            int number = usuario.nextInt();
            String opcion = switch (number) {
                case 1 -> "Guardar";
                case 2 -> "Cargar";
                case 3 -> "Salir";

                default -> "No existe esa opción";
            };
            System.out.println(opcion);
        } catch (InputMismatchException e) {
            System.out.println("Intente con las opciones.");
        }
    }    
}
