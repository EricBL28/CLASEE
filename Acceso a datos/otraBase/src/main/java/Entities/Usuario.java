package Entities;

import java.util.Date;

public class Usuario {
    private int id;
    private String nombre;
    private String programa;
    private Date fecha_nacimiento;
    private String correo;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrograma() {
        return programa;
    }
    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Usuario(int id, String nombre, String programa, Date fecha_nacimiento, String correo) {
        this.id = id;
        this.programa=programa;
        this.nombre=nombre;
        this.fecha_nacimiento=fecha_nacimiento;
        this.correo=correo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", programa='" + programa + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", correo='" + correo + '\'' +
                '}';
    }
}
