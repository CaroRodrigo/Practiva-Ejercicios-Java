package pooej6;

public class Cancion {

    private String titulo;
    private String autor;

    public Cancion() {
        String titulo = "";
        String autor = "";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        this.autor = autor;
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void imprimirResultado() {
        System.out.println("El titulo de la cancion es : " + titulo + ". Y su autor es : " + autor);
    }

}
