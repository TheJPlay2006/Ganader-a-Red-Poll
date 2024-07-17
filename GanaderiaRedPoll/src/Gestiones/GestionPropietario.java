/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Gestiones;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Jairo
 */
public class GestionPropietario {
    
    private static GestionPropietario instancia = null;
    private List<Propietario> listaPropietarios;
    private GestionPropietario() {
        
        listaPropietarios = new ArrayList<>();
    }

    public static GestionPropietario getInstance() {
        if (instancia == null) {
            instancia = new GestionPropietario();
        }
        return instancia;
    }

    // Métodos CRUD para la gestión de propietarios
    public void agregarPropietario(Propietario propietario) {
        listaPropietarios.add(propietario);
    }

    public void editarPropietario(int indice, Propietario propietario) {
        listaPropietarios.set(indice, propietario);
    }

    public void eliminarPropietario(int indice) {
        listaPropietarios.remove(indice);
    }

    public Propietario obtenerPropietario(int indice) {
        return listaPropietarios.get(indice);
    }

    public List<Propietario> obtenerTodosPropietarios() {
        return listaPropietarios;
    }
}