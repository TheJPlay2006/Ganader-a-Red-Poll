package Login;


public class Usuario {

private int id, rol_Id;
private String nombre, correo,contrasena;

    public Usuario(String nombre, String correo, String contrasena1, int rol_Id) {
        this.id = id;
        this.rol_Id = rol_Id;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRol_id() {
        return rol_Id;
    }

    public void setRol_id(int rol_id) {
        this.rol_Id = rol_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", rol_id=" + rol_Id + ", nombre=" + nombre + ", correo=" + correo + ", contrasena=" + contrasena + '}';
    } 
}
