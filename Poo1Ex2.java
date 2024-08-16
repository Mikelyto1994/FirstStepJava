
class Auto {
    // Atributos
    private String marca;
    private String modelo;
    private int año;

    // Constructor que inicializa marca, modelo y año
    public Auto(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Constructor que inicializa marca y modelo
    public Auto(String marca, String modelo) {
        this(marca, modelo, 0); // Llama al constructor con todos los parámetros, asignando 0 como año
                                // predeterminado
    }

    // Constructor que inicializa solamente la marca
    public Auto(String marca) {
        this(marca, "", 0); // Llama al constructor con todos los parámetros, asignando valores
                            // predeterminados para modelo y año
    }

    // Constructor sin parámetros
    public Auto() {
        this("", "", 0); // Llama al constructor con todos los parámetros, asignando valores
                         // predeterminados
    }

    // Método para imprimir los datos del auto
    public void imprimirDatos() {
        System.out.println("Marca: " + (marca.isEmpty() ? "No especificado" : marca));
        System.out.println("Modelo: " + (modelo.isEmpty() ? "No especificado" : modelo));
        System.out.println("Año: " + (año == 0 ? "No especificado" : año));
    }
}

public class Poo1Ex2 {
    // Método main para probar los constructores
    public static void main(String[] args) {
        // Crear objetos usando los diferentes constructores
        Auto auto1 = new Auto("Toyota", "Corolla", 2022);
        Auto auto2 = new Auto("Honda", "Civic");
        Auto auto3 = new Auto("Ford");
        Auto auto4 = new Auto();

        // Imprimir los datos de cada auto
        System.out.println("Auto 1:");
        auto1.imprimirDatos();
        System.out.println();

        System.out.println("Auto 2:");
        auto2.imprimirDatos();
        System.out.println();

        System.out.println("Auto 3:");
        auto3.imprimirDatos();
        System.out.println();

        System.out.println("Auto 4:");
        auto4.imprimirDatos();
    }

}