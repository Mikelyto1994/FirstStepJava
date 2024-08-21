package libro;

public class Libro {
    // Atributos privados
    private String titulo;
    private String autor;
    private int paginas;

    // Constructor vacío
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.paginas = 0;
    }

    // Métodos públicos para establecer y obtener el título
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    // Métodos públicos para establecer y obtener el autor
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    // Método para establecer el número de páginas
    public void setPaginas(int numeroUsuario) {
        this.paginas = numeroUsuario * 7; // Calcula el número de páginas
    }

    public int getPaginas() {
        return paginas;
    }

    // Método para imprimir todos los detalles del libro
    public void imprimirDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + paginas);
    }

    // Método estático para imprimir los títulos de todos los libros en un array
    public static void imprimirTodosLosTitulos(Libro[] libros) {
        System.out.println("Libros disponibles:");
        for (Libro libro : libros) {
            if (libro != null) { // Verifica que el libro no sea nulo
                System.out.println("- " + libro.getTitulo());
            }
        }
    }
}
