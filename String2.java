import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        // Establecer el encoding del sistema
        System.setProperty("file.encoding", "UTF-8");

        Scanner usuario = new Scanner(System.in);
        System.out.println("Escriba su nombre");
        String texto1 = usuario.nextLine();
        System.out.println("Escriba su apellido");
        String texto2 = usuario.nextLine();
        String total = texto1.concat(" ").concat(texto2);
        System.out.println("Tu nombre completo es: " + total);
        usuario.close();
    }
}
