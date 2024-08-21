package modelos;

import java.util.ArrayList;
import java.util.Arrays;

public class Empleado {
    // Atributos
    private String nombre;
    private int edad;
    private double salario;
    private String departamento;

    // Constructor
    public Empleado(String nombre, int edad, double salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Mostrar todos los empleados
    public static void mostrarEmpleados(Empleado[] empleados) {
        System.out.printf("%-5s %-20s %-5s %-10s %-15s%n", "No.", "Nombre", "Edad", "Salario", "Departamento");
        for (int i = 0; i < empleados.length; i++) {
            if (empleados[i] != null) {
                System.out.printf("%-5d %-20s %-5d %-10.2f %-15s%n", i + 1, empleados[i].nombre, empleados[i].edad,
                        empleados[i].salario, empleados[i].departamento);
            }
        }
    }

    // Filtrar empleados
    public static Empleado[] filtrarEmpleados(Empleado[] empleados, String atributo, String valorFiltro) {
        ArrayList<Empleado> resultado = new ArrayList<>();

        for (Empleado empleado : empleados) {
            if (empleado == null)
                continue;

            switch (atributo.toLowerCase()) {
                case "nombre":
                    if (empleado.nombre.equalsIgnoreCase(valorFiltro)) {
                        resultado.add(empleado);
                    }
                    break;
                case "departamento":
                    if (empleado.departamento.equalsIgnoreCase(valorFiltro)) {
                        resultado.add(empleado);
                    }
                    break;
                case "edad":
                    try {
                        int edadFiltro = Integer.parseInt(valorFiltro);
                        if (empleado.edad == edadFiltro) {
                            resultado.add(empleado);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: El valor de edad no es válido.");
                    }
                    break;
                case "salario":
                    try {
                        double salarioFiltro = Double.parseDouble(valorFiltro);
                        if (empleado.salario == salarioFiltro) {
                            resultado.add(empleado);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Error: El valor de salario no es válido.");
                    }
                    break;
                default:
                    System.out.println("Error: Atributo de filtro no válido.");
                    break;
            }
        }

        return resultado.toArray(new Empleado[0]);
    }

    // Ordenar empleados
    public static Empleado[] ordenarEmpleados(Empleado[] empleados, String atributo) {
        // Filtrar empleados no nulos
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        for (Empleado empleado : empleados) {
            if (empleado != null) {
                listaEmpleados.add(empleado);
            }
        }

        // Convertir a arreglo
        Empleado[] empleadosOrdenados = listaEmpleados.toArray(new Empleado[0]);

        // Ordenar según el atributo
        switch (atributo.toLowerCase()) {
            case "nombre":
                Arrays.sort(empleadosOrdenados, (e1, e2) -> e1.nombre.compareToIgnoreCase(e2.nombre));
                break;
            case "edad":
                Arrays.sort(empleadosOrdenados, (e1, e2) -> Integer.compare(e1.edad, e2.edad));
                break;
            case "salario":
                Arrays.sort(empleadosOrdenados, (e1, e2) -> Double.compare(e1.salario, e2.salario));
                break;
            default:
                System.out.println("Error: Atributo de ordenamiento no válido.");
                break;
        }

        return empleadosOrdenados;
    }

    // Buscar por nombre
    public static Empleado buscarPorNombre(Empleado[] empleados, String nombre) {
        for (Empleado empleado : empleados) {
            if (empleado != null && empleado.nombre.equalsIgnoreCase(nombre)) {
                return empleado;
            }
        }
        return null;
    }

    // Incrementar salario
    public static Empleado incrementarSalario(Empleado empleado, double porcentaje) {
        double salarioActual = empleado.getSalario();
        double nuevoSalario = salarioActual + (salarioActual * porcentaje / 100);
        empleado.setSalario(nuevoSalario);
        return empleado;
    }
}
