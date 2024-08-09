import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Integrador3Calificaciones {

    public static void main(String[] args) {
        final int NUM_CALIFICACIONES = 20; // Número de calificaciones a generar
        List<Double> calificaciones = new ArrayList<>();
        Random random = new Random();

        // Generar calificaciones aleatorias entre 0 y 20
        for (int i = 0; i < NUM_CALIFICACIONES; i++) {
            calificaciones.add(random.nextDouble() * 20); // Calificaciones entre 0.00 y 20.00
        }

        // Inicializar listas para las categorías
        List<Double> desaprobado = new ArrayList<>();
        List<Double> aprobado = new ArrayList<>();
        List<Double> excelente = new ArrayList<>();

        // Separar calificaciones en categorías
        for (Double calificacion : calificaciones) {
            if (calificacion >= 10) {
                excelente.add(calificacion);
            } else if (calificacion >= 4) {
                aprobado.add(calificacion);
            } else {
                desaprobado.add(calificacion);
            }
        }

        // Calcular y mostrar promedios
        double promedioOriginal = calcularPromedio(calificaciones);
        double promedioDesaprobado = calcularPromedio(desaprobado);
        double promedioAprobado = calcularPromedio(aprobado);
        double promedioExcelente = calcularPromedio(excelente);

        // Imprimir resultados
        System.out.println("Calificaciones originales: ");
        imprimirLista(calificaciones);

        System.out.println("\nDesaprobado: ");
        imprimirLista(desaprobado);
        System.out.println("Promedio Desaprobado: " + promedioDesaprobado);

        System.out.println("\nAprobado: ");
        imprimirLista(aprobado);
        System.out.println("Promedio Aprobado: " + promedioAprobado);

        System.out.println("\nExcelente: ");
        imprimirLista(excelente);
        System.out.println("Promedio Excelente: " + promedioExcelente);

        System.out.println("\nPromedio General: " + promedioOriginal);
    }

    // Método para calcular el promedio de una lista de calificaciones
    private static double calcularPromedio(List<Double> lista) {
        if (lista.isEmpty())
            return 0;
        double suma = 0;
        for (Double calificacion : lista) {
            suma += calificacion;
        }
        return suma / lista.size();
    }

    // Método para imprimir una lista de calificaciones
    private static void imprimirLista(List<Double> lista) {
        // Ordena la lista de menor a mayor usando Stream
        List<Double> listaOrdenada = lista.stream()
                .sorted()
                .collect(Collectors.toList());

        // Imprime la lista ordenada
        for (Double calificacion : listaOrdenada) {
            System.out.print(String.format("%.2f", calificacion) + " ");
        }
        System.out.println("...");
    }
}
