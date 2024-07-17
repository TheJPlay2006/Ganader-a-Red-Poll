/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rolesypermisos;

/**
 *
 * @author Jairo
 */
import Login.Usuario;
import java.util.HashMap;
import java.util.Map;


public class GestionUsuario {
    private Map<String, Usuario> usuarios;

    public GestionUsuario() {
        this.usuarios = new HashMap<>();
    }

    public boolean registrarUsuario(Usuario usuario) {
        if (usuarios.containsKey(usuario.getCorreo())) {
            return false;
        }
        usuarios.put(usuario.getCorreo(), usuario);
        return true;
    }

    public Usuario autenticar(String correo, String contrasena) {
        Usuario usuario = usuarios.get(correo);
        if (usuario != null && usuario.getContrasena().equals(contrasena)) {
            return usuario;
        }
        return null;
    }

    // Otros métodos según sea necesario...
}
