public class Array6 {
    public static void main(String[] args) {
        int[] numbers = { 2, 2, 6, 8, 10, 6 };
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println("La cantidad de numeros pares en el arreglo es: " + count);
    }
}