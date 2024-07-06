package Gestiones;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Jairo
 */
public class Propietario {
    private String nombre,direccion, correo;
    private int id,cedula, telefono;

    public Propietario(String nombre, String direccion, String correo, int id, int cedula, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.correo = correo;
        this.id = id;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMcedula() {
        return cedula;
    }

    public void setMcedula(int mcedula) {
        this.cedula = mcedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", direccion=" + direccion + ", correo=" + correo + ", id=" + id + ", mcedula=" + cedula + ", telefono=" + telefono + '}';
    }
}
