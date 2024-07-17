/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rolesypermisos;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Bryan Chaves
 */
public class GestionPermisos {

    private Map<String, Permiso> permisos;

    public GestionPermisos() {
        this.permisos = new HashMap<>();
    }

    public Map<String, Permiso> getPermisos() {
        return permisos;
    }

    public void setPermisos(Map<String, Permiso> permisos) {
        this.permisos = permisos;
    }

    private int asignarId() {
        return this.permisos.values().stream()
                .mapToInt(Permiso::getId)
                .max()
                .orElse(0) + 1;
    }

    public void crear(Permiso permiso) {
        int id = this.asignarId();
        boolean estado = true;
        this.permisos.put(permiso.getNombre(), new Permiso(id, permiso.getNombre(), permiso.getId_rol(), estado));
    }

    public Permiso obtenerPermiso(String nombre) {
        return this.permisos.get(nombre);
    }

    public boolean validarExistencia(String nombre) {
        return this.permisos.containsKey(nombre);
    }

    public void actualizarPermiso(Permiso permiso) {

        this.permisos.put(permiso.getNombre(), permiso);

    }

    public void eliminarPermiso(String nombre) {
        
      
            Permiso permiso = this.obtenerPermiso(nombre);
            permiso.setEstado(false);
        
    }

    public List<Permiso> consultarPermisosRol(int id_rol) {
        return this.permisos.values().stream()
                .filter(permiso -> permiso.getId_rol() == id_rol)
                .collect(Collectors.toList());
    }

}
