import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        System.out.println("Escriba un texto");
        String texto1 = usuario.nextLine();
        int total = texto1.length();
        System.out.println("El largo del texto que escribiste es: " + total);
        usuario.close();

    }
}