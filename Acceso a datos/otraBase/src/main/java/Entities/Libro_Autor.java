package Entities;

public class Libro_Autor {
    private int id;
    private int libro_id;
    private int autor_id;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getLibro_id() {
        return libro_id;
    }
    public void setLibro_id(int libro_id) {
        this.libro_id = libro_id;
    }

    public int getAutor_id() {
        return autor_id;
    }
    public void setAutor_id(int autor_id) {
        this.autor_id = autor_id;
    }

    public Libro_Autor(int id,int libro_id,int autor_id) {
        this.id = id;
        this.autor_id=autor_id;
        this.libro_id=libro_id;
    }

    @Override
    public String toString() {
        return "Libro_Autor{" +
                "id=" + id +
                ", libro_id=" + libro_id +
                ", autor_id=" + autor_id +
                '}';
    }
}
