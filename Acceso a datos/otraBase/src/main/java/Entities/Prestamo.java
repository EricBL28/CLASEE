package Entities;

import java.util.Date;

public class Prestamo {
    private int id;
    private Date fecha_prestamo;
    private Date fecha_devolucion;
    private boolean devuelto;
    private int usuario_id;
    private int libro_id;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha_prestamo() {
        return fecha_prestamo;
    }
    public void setFecha_prestamo(Date fecha_prestamo) {
        this.fecha_prestamo = fecha_prestamo;
    }

    public Date getFecha_devolucion() {
        return fecha_devolucion;
    }
    public void setFecha_devolucion(Date fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public boolean isDevuelto() {
        return devuelto;
    }
    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    public int getUsuario_id() {
        return usuario_id;
    }
    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public int getLibro_id() {
        return libro_id;
    }
    public void setLibro_id(int libro_id) {
        this.libro_id = libro_id;
    }

    public Prestamo(int id,Date fecha_prestamo,Date fecha_devolucion, boolean devuelto,int usuario_id,int libro_id) {
        this.id = id;
        this.fecha_prestamo=fecha_prestamo;
        this.fecha_devolucion=fecha_prestamo;
        this.devuelto=devuelto;
        this.usuario_id=usuario_id;
        this.libro_id=libro_id;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "id=" + id +
                ", fecha_prestamo=" + fecha_prestamo +
                ", fecha_devolucion=" + fecha_devolucion +
                ", devuelto=" + devuelto +
                ", usuario_id=" + usuario_id +
                ", libro_id=" + libro_id +
                '}';
    }

}
