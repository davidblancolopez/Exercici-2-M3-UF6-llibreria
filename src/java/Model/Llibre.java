
package Model;


public class Llibre {
    String titol;
    String autor;
    int any;
    String isbn;
    String editorial;
    int estoc;

    public Llibre(String titol, String autor, int any, String isbn, String editorial, int estoc) {
        this.titol = titol;
        this.autor = autor;
        this.any = any;
        this.isbn = isbn;
        this.editorial = editorial;
        this.estoc = estoc;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getEstoc() {
        return estoc;
    }

    public void setEstoc(int estoc) {
        this.estoc = estoc;
    }
    
    
}
