public class PlanoXY {
    // Definición de la clase Punto
    public static class Punto {
        private double x;
        private double y;

        // Constructor sin parámetros
        public Punto() {
            this.x = 0;
            this.y = 0;
        }

        // Constructor con parámetros
        public Punto(double x, double y) {
            this.x = x;
            this.y = y;
        }

        // Getters y Setters
        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        // Método de instancia: calcular la distancia desde el origen (0,0)
        public double distanciaDesdeOrigen() {
            return Math.sqrt(x * x + y * y);
        }

        // Método estático: calcular la distancia entre dos puntos
        public static double calcularDistancia(Punto p1, Punto p2) {
            double deltaX = p2.getX() - p1.getX();
            double deltaY = p2.getY() - p1.getY();
            return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        }

        // Método estático: verificar si tres puntos están alineados
        public static boolean estanAlineados(Punto p1, Punto p2, Punto p3) {
            double pendiente1 = (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
            double pendiente2 = (p3.getY() - p2.getY()) / (p3.getX() - p2.getX());
            return pendiente1 == pendiente2;
        }
    }

    // Variable global para almacenar puntos
    private static Punto[] puntos = new Punto[10]; // Ejemplo de arreglo para 10 puntos
    private static int contadorPuntos = 0;

    public static void main(String[] args) {
        // Ejemplo de creación de puntos y uso de los métodos
        Punto p1 = new Punto(1, 2);
        Punto p2 = new Punto(4, 6);
        Punto p3 = new Punto(7, 10);

        // Almacenando puntos en el arreglo
        puntos[contadorPuntos++] = p1;
        puntos[contadorPuntos++] = p2;
        puntos[contadorPuntos++] = p3;
        // Agregar más puntos
        Punto p4 = new Punto(2, 3);
        Punto p5 = new Punto(5, 7);
        Punto p6 = new Punto(8, 11);

        if (contadorPuntos < puntos.length) {
            puntos[contadorPuntos++] = p4;
            puntos[contadorPuntos++] = p5;
            puntos[contadorPuntos++] = p6;
        } else {
            System.out.println("No hay suficiente espacio en el arreglo para agregar más puntos.");
        }

        // Imprimir puntos para verificar
        for (int i = 0; i < contadorPuntos; i++) {
            Punto p = puntos[i];
            System.out.println("Punto " + (i + 1) + ": (" + p.getX() + ", " + p.getY() + ")");
        }

        // Uso de los métodos
        System.out.println("Distancia de p1 desde el origen: " + p1.distanciaDesdeOrigen());
        System.out.println("Distancia entre p1 y p2: " + Punto.calcularDistancia(p1, p2));
        System.out.println("¿Están alineados p1, p2 y p3?: " + Punto.estanAlineados(p1, p2, p3));
    }
}
