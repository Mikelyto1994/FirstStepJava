package modelo;

public class Rectangulo {
    private double ancho;
    private double alto;

    // Constructor sin parámetros
    public Rectangulo() {
        this.ancho = 0;
        this.alto = 0;
    }

    // Constructor con parámetros
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Getters y Setters
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    // Método para calcular el área
    public double area() {
        return this.ancho * this.alto;
    }

    // Método para calcular el perímetro
    public double perimetro() {
        return 2 * (this.ancho + this.alto);
    }

    // Método para imprimir los datos del rectángulo
    public void imprimirDatos() {
        System.out.println("Rectángulo:");
        System.out.println("Ancho: " + this.ancho);
        System.out.println("Alto: " + this.alto);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
    }
}
