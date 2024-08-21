package modelo;

public class Circulo {
    private double radio;

    // Constructor sin parámetros
    public Circulo() {
        this.radio = 0;
    }

    // Constructor con parámetros
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Getters y Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área
    public double area() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    // Método para calcular el perímetro
    public double perimetro() {
        return 2 * Math.PI * this.radio;
    }

    // Método para imprimir los datos del círculo
    public void imprimirDatos() {
        System.out.println("Círculo:");
        System.out.println("Radio: " + this.radio);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
    }
}
