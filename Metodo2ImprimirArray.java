public class Metodo2ImprimirArray {

    public static void main(String[] args) {
        int[] numeros = { 1, 2, 3, 4, 5 };
        String[] palabras = { "Hola", "Mundo", "Java" };
        int[][] numerosBidimensionales = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        String[][] palabrasBidimensionales = {
                { "Buenos", "días" },
                { "Hola", "Mundo" }
        };

        // Imprimir arreglos unidimensionales
        imprimirArray(numeros);
        imprimirArray(palabras);

        // Imprimir arreglos bidimensionales
        imprimirArray(numerosBidimensionales);
        imprimirArray(palabrasBidimensionales);
    }

    // Método para imprimir un arreglo unidimensional de enteros
    public static void imprimirArray(int[] array) {
        System.out.print("Array de enteros: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método sobrecargado para imprimir un arreglo unidimensional de Strings
    public static void imprimirArray(String[] array) {
        System.out.print("Array de Strings: ");
        for (String str : array) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    // Método sobrecargado para imprimir un arreglo bidimensional de enteros
    public static void imprimirArray(int[][] array) {
        System.out.println("Array bidimensional de enteros:");
        for (int[] fila : array) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    // Método sobrecargado para imprimir un arreglo bidimensional de Strings
    public static void imprimirArray(String[][] array) {
        System.out.println("Array bidimensional de Strings:");
        for (String[] fila : array) {
            for (String str : fila) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}
