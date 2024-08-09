import java.util.Random;

public class Metodo2GeneradorAleatorio {

    public static void main(String[] args) {
        // Generar y mostrar un número aleatorio en el rango 1-355
        int numeroAleatorio = numeroAleatorio();
        System.out.println("Número aleatorio generado: " + numeroAleatorio);
    }

    // Método que devuelve un número aleatorio en el rango 1-355
    public static int numeroAleatorio() {
        Random random = new Random(); // Crear una instancia de Random
        int rangoInferior = 1;
        int rangoSuperior = 355;

        // Generar un número aleatorio en el rango 1-355
        int numero = random.nextInt(rangoSuperior - rangoInferior + 1) + rangoInferior;

        return numero;
    }
}
