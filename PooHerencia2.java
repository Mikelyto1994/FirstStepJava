import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Clase base Persona
abstract class Persona {
    private String nombre;
    private int edad;
    private String equipo;

    public Persona(String nombre, int edad, String equipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getEquipo() {
        return equipo;
    }

    public abstract void gritarGol();
}

// Clase Entrenador
class Entrenador extends Persona {
    public Entrenador(String nombre, int edad, String equipo) {
        super(nombre, edad, equipo);
    }

    @Override
    public void gritarGol() {
        System.out.println(getNombre() + " (Entrenador) grita: ¡Vamos equipo!");
    }
}

// Clase Jugador
class Jugador extends Persona {
    public Jugador(String nombre, int edad, String equipo) {
        super(nombre, edad, equipo);
    }

    @Override
    public void gritarGol() {
        System.out.println(getNombre() + " (Jugador) grita: ¡Gooool!");
    }
}

// Clase Equipo
class Equipo {
    private String nombre;
    private List<Persona> miembros;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.miembros = new ArrayList<>();
    }

    public void agregarMiembro(Persona persona) {
        miembros.add(persona);
    }

    public void gritarGol() {
        for (Persona miembro : miembros) {
            miembro.gritarGol();
        }
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase principal
public class PooHerencia2 {
    public static void main(String[] args) {
        // Crear equipos
        Equipo equipo1 = new Equipo("Equipo A");
        equipo1.agregarMiembro(new Jugador("Juan", 25, "Equipo A"));
        equipo1.agregarMiembro(new Entrenador("Pedro", 40, "Equipo A"));

        // Crear un menú para seleccionar opciones
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Gritar Gol del equipo");

            int opcion = scanner.nextInt();

            if (opcion == 1) {
                equipo1.gritarGol();
            } else {
                System.out.println("Opción no válida.");
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, ingrese un número.");
        } finally {
            scanner.close(); // Cerrar el scanner
        }
    }
}
