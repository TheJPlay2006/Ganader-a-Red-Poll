/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rolesypermisos;

/**
 *
 * @author Bryan Chaves
 */
public class Permiso {

    int id;
    String nombre;
    int id_rol;
    boolean estado;

    public Permiso(int id, String nombre, int id_rol, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.id_rol = id_rol;
        this.estado = estado;
    }

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

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Permiso{" + "id=" + id + ", nombre=" + nombre + ", id_rol=" + id_rol + ", estado=" + estado + '}';
    }    
}