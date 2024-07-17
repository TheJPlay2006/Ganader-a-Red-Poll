package Login;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jairo
 */

public class Roles {
    private static Roles instancia;
    private List<Usuario> listaUsuarios;
    private int contadorID;

    private Roles() {
        listaUsuarios = new ArrayList<>();
        contadorID = 1;
        precargarUsuarios();
    }

    public static Roles getInstance() {
        if (instancia == null) {
            instancia = new Roles();
        }
        return instancia;
    }

    private void precargarUsuarios() {
        listaUsuarios.add(new Usuario(1, "Admin Jairo", "admin@correo.com", "admin123", contadorID++));
        listaUsuarios.add(new Usuario(2, "Veterinario Ricardo", "veterinario@correo.com", "vet123", contadorID++));
        listaUsuarios.add(new Usuario(3, "Lechero Juan", "lechero@correo.com", "lechero123", contadorID++));
    }

    public boolean validarCredenciales(String correo, String contrasena) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getCorreo().equals(correo) && usuario.getContrasena().equals(contrasena)) {
                return true;
            }
        }
        return false;
    }

    public Usuario obtenerUsuario(String correo) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getCorreo().equals(correo)) {
                return usuario;
            }
        }
        return null;
    }

    public void registrarUsuario(Usuario usuario) {
        usuario.setId(contadorID++);
        listaUsuarios.add(usuario);
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }
}
