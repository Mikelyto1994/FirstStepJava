import java.util.ArrayList;
import java.util.List;

// Clase base
abstract class Animal {
    public abstract void hacerSonido();

    public void comer() {
        System.out.println("El animal está comiendo.");
    }
}

// Clase derivada Perro
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro dice: ¡Guau!");
    }

    @Override
    public void comer() {
        System.out.println("El perro está comiendo croquetas.");
    }
}

// Clase derivada Gato
class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El gato dice: ¡Miau!");
    }

    @Override
    public void comer() {
        System.out.println("El gato está comiendo ratones.");
    }
}

// Clase principal
public class PooHerencia1 {
    public static void main(String[] args) {
        // Crear una lista de animales
        List<Animal> animales = new ArrayList<>();

        // Agregar instancias de Perro y Gato
        animales.add(new Perro());
        animales.add(new Gato());
        animales.add(new Gato());
        animales.add(new Perro());

        // Recorrer la lista y utilizar instanceof
        for (Animal animal : animales) {
            if (animal instanceof Perro) {
                System.out.println("Este es un Perro.");
                animal.hacerSonido();
                animal.comer();
            } else if (animal instanceof Gato) {
                System.out.println("Este es un Gato.");
                animal.hacerSonido();
                animal.comer();
            }
            System.out.println(); // Línea en blanco para separación
        }
    }
}
