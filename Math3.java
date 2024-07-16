public class Math3 {
    public static void main(String[] args) {
        double num = Math.random();
        double resultado;

        if (num == 0.0) {
            resultado = num + 1;
        } else {
            resultado = num * 355;
        }

        System.out.println("Tu número aleatorio: " + resultado);
    }
}
