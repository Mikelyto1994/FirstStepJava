public class Bucle1ForeachCalculandoPromedio {
    public static void main(String[] args) {
        // Genera un array de 20 elementos de tipo float e inicialízalo con números de tu elección
        float[] numeros = { 5.5f, 8.2f, 6.7f, 9.1f, 4.5f, 7.8f, 3.2f, 6.5f, 2.1f, 1.8f,
                            4.3f, 9.6f, 7.2f, 5.9f, 3.4f, 2.7f, 8.3f, 6.4f, 3.1f, 2.5f };

        // Calcula la suma de todos los elementos del array
        float suma = 0;
        for (float numero : numeros) {
            suma += numero;
        }

        // Calcula el promedio de los elementos del array
        float promedio = suma / numeros.length;

        // Muestra por consola el resultado de la suma y el promedio
        System.out.println("Suma de los elementos: " + suma);
        System.out.println("Promedio de los elementos: " + promedio);
    }
}
