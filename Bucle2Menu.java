import java.util.Scanner;

public class Bucle2Menu {
    public static void main(String[] args) {
        Scanner usuario = new Scanner(System.in);
        int eleccion = 0;
        while (eleccion != 5) {
            System.out.println(
                    "\n1. Comprar producto\n2. Realizar devolución.\n3. Realizar devolución.\n4. Preguntas frecuentes.\n5. Salir.\n___________________________________");
            eleccion = usuario.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("Ha elegido Comprar producto.");
                    break;
                case 2:
                    System.out.println("Ha elegido Realizar devolución.");
                    break;
                case 3:
                    System.out.println("Ha elegido Ver mis pedidos.");
                    break;
                case 4:
                    System.out.println("Ha elegido Preguntas frecuentes.");
                    break;
                case 5:
                    System.out.println("Ha elegido Salir. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del 1 al 5.");
                    break;
            }
        }
        ;
        usuario.close();
    }

}
