public class Integrador3Fibonacci {

    public static void main(String[] args) {
        int n = 10; // Número de términos que queremos imprimir
        int a = 0; // Primer término de la serie de Fibonacci
        int b = 1; // Segundo término de la serie de Fibonacci
        int count = 0; // Contador para el número de términos impresos

        System.out.println("Los primeros " + n + " términos de la serie de Fibonacci son:");

        while (count < n) {
            System.out.print(a + " ");

            // Calcular el siguiente término en la serie
            int siguiente = a + b;
            a = b;
            b = siguiente;

            // Incrementar el contador
            count++;
        }
        System.out.println(". Exelcius"); // Salto de línea después de imprimir todos los términos
    }
}
