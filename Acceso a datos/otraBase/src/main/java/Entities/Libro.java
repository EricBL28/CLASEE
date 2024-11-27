package Entities;

public class Libro {
    private int id;
    private String titulo;
    private String editorial;
    private String area;
    private boolean disponible;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }

    public boolean isDisponible() {
        return disponible;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Libro(int id,String titulo,String editorial,String area,boolean disponible) {
        this.id = id;
        this.titulo=titulo;
        this.area=area;
        this.editorial=editorial;
        this.disponible=disponible;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", editorial='" + editorial + '\'' +
                ", area='" + area + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}

