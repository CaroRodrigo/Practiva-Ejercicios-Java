
package javaapplication6;

import java.util.Scanner;


public class Libro {
   
    String titulo;
    String autor;
    int isbn;
    int paginas;
    
    public void titulo (){
        this.titulo = "La mona jimenez";
        System.out.println("el titulo es : " +titulo);
    }
    
    public void autorIsbnPaginas(){
    this.autor = "Rodrigo Caro";
    this.isbn = 324324;
    this.paginas = 50;
    
        System.out.println("El autor del libro es : " +autor);
        System.out.println("El ISBN del libro es : " + isbn );
        System.out.println("El libro contiene : " + paginas + " paginas");
    
    }   
 
    
    
    
    //Libro libro = new Libro();

    /*public String getTitulo() {
        System.out.print("Ingrese el titulo del libro: ");
        this.titulo = leer.nextLine();  
        return titulo;
    }

    public void setTitulo(String titulo) {
      
        this.titulo = titulo;
    }

    public String getAutor() {
        System.out.print("Ingrese el Autor del libro: ");
        this.autor = leer.nextLine();
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getIsbn() {
        System.out.print("Ingrese el ISBN del libro: ");
        this.isbn = leer.nextInt();
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getPaginas() {
        System.out.print("Ingrese cantidad de paginas del libro: ");
        this.paginas = leer.nextInt();
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    */
}
