/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rolesypermisos;


import Login.Rol_1;
import java.util.Map;
import java.util.HashMap;


/**
 *
 * @author Bryan Chaves
 */
public class GestionRol {

    private Map<String, Rol_1> roles;
    private GestionPermisos gestionPermiso;

    public GestionRol() {
        this.roles = new HashMap<>();
        
    }

    public Map<String, Rol_1> getRoles() {
        return roles;
    }

    public void setRoles(Map<String, Rol_1> roles) {
        this.roles = roles;
    }

    private int asignarId() {
        return this.roles.values().stream()
                .mapToInt(Rol_1::getId)
                .max()
                .orElse(0) + 1;
    }

    public void crear(String nombre) {
        int id = this.asignarId();
        boolean estado = true;
        this.roles.put(nombre, new Rol_1(id, nombre, estado));
    }

    public Rol_1 obtenerRol(String nombre) {
        return this.roles.get(nombre);
    }

    public void actualizarRol(Rol_1 rol) {
   
            
            this.roles.put(rol.getNombre(), rol);

        
    }

    public void eliminarRol(String nombre,Map<String, Permiso> permisos) {
        
        if (this.roles.containsKey(nombre)) {
            Rol_1 rol = this.obtenerRol(nombre);
            if (this.validarRelacion(rol.getId(),permisos)) {
                rol.setEstado(false);
                permisos.values().forEach(permiso -> {
                    if (permiso.getId_rol() == rol.getId()) {
                        permiso.setEstado(false);
                    }
                });
            } else {
                rol.setEstado(false);
            }
        }
    }
    
    public void restaurarRol(String nombre,Map<String, Permiso> permisos) {
        if (this.roles.containsKey(nombre)) {
            Rol_1 rol = this.obtenerRol(nombre);
            
            if (this.validarRelacion(rol.getId(), permisos)) {
                rol.setEstado(true);
                permisos.values().forEach(permiso -> {
                    if (permiso.getId_rol() == rol.getId()) {
                        permiso.setEstado(true);
                    }
                });
            } else {
                rol.setEstado(true);
            }
        }
    }
    
    private boolean validarRelacion(int id,Map<String, Permiso> permisos){
        boolean estado =false;

        for(Permiso permiso:permisos.values()){
            System.out.println(permiso.getId_rol());
            System.out.println(id);
            if(permiso.getId_rol()==id){
                estado=true;
                break;
            }
        }

        return estado;
    }
    public boolean validarExistencia(String nombre){
        return this.roles.containsKey(nombre);
    }
}
