public class Bucle1ForeachConcatenandoElementos {
    public static void main(String[] args) {
        // Crea un array de cadenas con elementos de ejemplo
        String[] elementos = { "Hola", "qué", "tal", "estás", "hoy" };

        // Inicializa una cadena vacía para concatenar los elementos
        StringBuilder resultado = new StringBuilder();

        // Concatena los elementos del array separados por espacios
        for (int i = 0; i < elementos.length; i++) {
            resultado.append(elementos[i]);
            if (i < elementos.length - 1) {
                resultado.append(" ");
            }
        }

        // Imprime el resultado por consola
        System.out.println("Resultado de la concatenación: " + resultado.toString());
    }
}
