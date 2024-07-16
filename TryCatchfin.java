import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TryCatchfin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Crear un mapa para almacenar las palabras y sus correspondientes números
        Map<String, Integer> palabrasANumeros = new HashMap<>();
        // Unidades
        palabrasANumeros.put("cero", 0);
        palabrasANumeros.put("uno", 1);
        palabrasANumeros.put("dos", 2);
        palabrasANumeros.put("tres", 3);
        palabrasANumeros.put("cuatro", 4);
        palabrasANumeros.put("cinco", 5);
        palabrasANumeros.put("seis", 6);
        palabrasANumeros.put("siete", 7);
        palabrasANumeros.put("ocho", 8);
        palabrasANumeros.put("nueve", 9);
        palabrasANumeros.put("diez", 10);
        // Del once al quince
        palabrasANumeros.put("once", 11);
        palabrasANumeros.put("doce", 12);
        palabrasANumeros.put("trece", 13);
        palabrasANumeros.put("catorce", 14);
        palabrasANumeros.put("quince", 15);
        // Dieci-
        palabrasANumeros.put("dieciséis", 16);
        palabrasANumeros.put("diecisiete", 17);
        palabrasANumeros.put("dieciocho", 18);
        palabrasANumeros.put("diecinueve", 19);
        // Veinti-
        palabrasANumeros.put("veinte", 20);
        palabrasANumeros.put("veintiuno", 21);
        palabrasANumeros.put("veintidós", 22);
        palabrasANumeros.put("veintitrés", 23);
        palabrasANumeros.put("veinticuatro", 24);
        palabrasANumeros.put("veinticinco", 25);
        palabrasANumeros.put("veintiséis", 26);
        palabrasANumeros.put("veintisiete", 27);
        palabrasANumeros.put("veintiocho", 28);
        palabrasANumeros.put("veintinueve", 29);
        // Decenas
        palabrasANumeros.put("treinta", 30);
        palabrasANumeros.put("cuarenta", 40);
        palabrasANumeros.put("cincuenta", 50);
        palabrasANumeros.put("sesenta", 60);
        palabrasANumeros.put("setenta", 70);
        palabrasANumeros.put("ochenta", 80);
        palabrasANumeros.put("noventa", 90);
        palabrasANumeros.put("cien", 100);

        System.out.println("Por favor, ingrese una cadena que represente un número entero:");
        String cadena = input.nextLine().toLowerCase().trim();

        try {
            // Intentar convertir la cadena usando Integer.parseInt()
            int numero = Integer.parseInt(cadena);
            System.out.println("El número entero ingresado es: " + numero);
        } catch (NumberFormatException e) {
            // Si no se puede convertir, buscar en el mapa de palabras
            if (palabrasANumeros.containsKey(cadena)) {
                int numero = palabrasANumeros.get(cadena);
                System.out.println("El número entero ingresado es: " + numero);
            } else {
                // Manejo de decenas con unidades (ejemplo: "treinta y cinco")
                String[] partes = cadena.split(" y ");
                if (partes.length == 2 && palabrasANumeros.containsKey(partes[0])
                        && palabrasANumeros.containsKey(partes[1])) {
                    int numero = palabrasANumeros.get(partes[0]) + palabrasANumeros.get(partes[1]);
                    System.out.println("El número entero ingresado es: " + numero);
                } else {
                    System.out.println("Error: La cadena ingresada no puede ser convertida en un número entero.");
                }
            }
        }

        input.close();
    }
}
