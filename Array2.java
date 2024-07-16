import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        // Crear un scanner para leer la entrada del usuario
        Scanner input = new Scanner(System.in);

        // Crear un array para almacenar las notas
        int[] notas = new int[4];
        double suma = 0;

        // Pedir al usuario que ingrese las notas
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = input.nextInt();
            suma += notas[i]; // Sumar las notas a la variable suma
        }

        // Calcular el promedio de las notas
        double promedio = suma / notas.length;

        // Imprimir el promedio de las notas
        System.out.println("El promedio de las notas es: " + promedio);

        // Cerrar el scanner
        input.close();
    }
}
