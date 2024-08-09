import java.util.Scanner;

public class Metodo2Par {

    public static void main(String[] args) {
        Integer numero = solicitarNumero();
        if (esPar(numero)) {
            System.out.println("El " + numero + " es par");
        } else {
            System.out.println("El " + numero + " no es par");
        }
    }

    public static Integer solicitarNumero() {
        Scanner pepe = new Scanner(System.in);
        Integer numero = null;
        System.out.println("Por favor ingrese un número:");
        do {
            try {
                numero = pepe.nextInt();
            } catch (Exception e) {
                pepe.nextLine();
                System.out.println("No ingresó un número, intente nuevamente:");
            }
        } while (numero == null);
        pepe.close();
        return numero;
    }

    public static boolean esPar(Integer numero) {
        return numero % 2 == 0;
    }
}
