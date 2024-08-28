import java.util.ArrayList;
import java.util.List;

// Superclase Edificio
abstract class Edificio {
    protected double ancho;
    protected double alto;
    protected double largo;
    protected String nombre;

    public Edificio(double ancho, double alto, double largo, String nombre) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.nombre = nombre;
    }

    public abstract double calcularSuperficie();

    public abstract double calcularVolumen();

    public String getNombre() {
        return nombre;
    }
}

// Subclase Polideportivo
class Polideportivo extends Edificio {
    private String nombre;
    private String tipoInstalacion; // Techado o Abierto

    public Polideportivo(double ancho, double alto, double largo, String nombre, String tipoInstalacion) {
        super(ancho, alto, largo, nombre);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public double calcularSuperficie() {
        return ancho * largo;
    }

    @Override
    public double calcularVolumen() {
        return ancho * alto * largo;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }
}

// Subclase EdificioDeOficinas
class EdificioDeOficinas extends Edificio {
    private int numOficinas;
    private int personasPorOficina;
    private int numPisos;

    public EdificioDeOficinas(double ancho, double alto, double largo, String nombre, int numOficinas,
            int personasPorOficina,
            int numPisos) {
        super(ancho, alto, largo, nombre);
        this.numOficinas = numOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numPisos = numPisos;
    }

    @Override
    public double calcularSuperficie() {
        return ancho * largo;
    }

    @Override
    public double calcularVolumen() {
        return ancho * alto * largo;
    }

    public int cantPersonas() {
        return numOficinas * personasPorOficina * numPisos;
    }
}

// Clase principal
public class PooHerencia3 {
    public static void main(String[] args) {
        List<Edificio> edificios = new ArrayList<>();

        // Crear instancias de Polideportivo
        Polideportivo polideportivo1 = new Polideportivo(100, 20, 50, "Polideportivo Central", "Techado");
        Polideportivo polideportivo2 = new Polideportivo(120, 25, 60, "Polideportivo Norte", "Abierto");

        // Crear instancias de EdificioDeOficinas
        EdificioDeOficinas oficina1 = new EdificioDeOficinas(80, 30, 40, "Oficina A", 10, 5, 4);
        EdificioDeOficinas oficina2 = new EdificioDeOficinas(90, 35, 45, "Oficina B", 12, 6, 5);
        // Añadir edificios a la lista
        edificios.add(polideportivo1);
        edificios.add(polideportivo2);
        edificios.add(oficina1);
        edificios.add(oficina2);

        // Contadores para tipos de polideportivos
        int techadoCount = 0;
        int abiertoCount = 0;

        // Recorrer la lista de edificios y ejecutar métodos
        for (Edificio edificio : edificios) {
            System.out.println("Nombre: " + edificio.getNombre());
            System.out.println("Superficie: " + edificio.calcularSuperficie());
            System.out.println("Volumen: " + edificio.calcularVolumen());

            if (edificio instanceof Polideportivo) {
                Polideportivo poli = (Polideportivo) edificio;
                if (poli.getTipoInstalacion().equals("Techado")) {
                    techadoCount++;
                } else {
                    abiertoCount++;
                }
            } else if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas oficina = (EdificioDeOficinas) edificio;
                System.out.println("Cantidad de personas: " + oficina.cantPersonas());
            }
            System.out.println();
        }

        // Mostrar cantidad de polideportivos techados y abiertos
        System.out.println("Cantidad de polideportivos techados: " + techadoCount);
        System.out.println("Cantidad de polideportivos abiertos: " + abiertoCount);
    }
}
