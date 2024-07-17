package Login;

public class Usuario {
    private int rolId;
    private String nombre;
    private String correo;
    private String contrasena;
    private int id;

    public Usuario(int rolId, String nombre, String correo, String contrasena, int id) {
        this.rolId = rolId;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.id = id;
    }

    public int getRolId() {
        return rolId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" + "rolId=" + rolId + ", nombre=" + nombre + ", correo=" + correo + ", contrasena=" + contrasena + ", id=" + id + '}';
    }
}
