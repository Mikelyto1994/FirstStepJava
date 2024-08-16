
// Clase principal Poo1Ex1 con el método main
public class Poo1Ex1 {
    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona miguel = new Persona("Miguel", 22);
        // Invocar el método para imprimir los datos
        miguel.imprimirNombre();
        System.out.println();
        Persona laura = new Persona("Laura", 25);
        laura.imprimirNombre();
    }
}

// Clase Persona
class Persona {
    private String nombre;
    private int edad;

    // Constructor de la clase Persona
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para imprimir el nombre y la edad
    public void imprimirNombre() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
