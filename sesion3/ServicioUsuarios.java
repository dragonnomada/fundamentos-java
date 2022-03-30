import java.util.ArrayList;

public class ServicioUsuarios {

    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void agregarUsuario(String nombre, String correo, String contraseña) {
        int id = 1;

        // for (<tipo> <elemento> : <lista>) { ... }
        for (Usuario usuario : usuarios) {
            if (usuario.getId() >= id) {
                id = usuario.getId() + 1;
            }
        }

        Usuario usuario = new Usuario(id, nombre, correo, contraseña);

        usuarios.add(usuario);
    }

    public static boolean existeUsuario(String nombre) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public static boolean existeUsuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return true;
            }
        }
        return false;
    }

    public static boolean existeUsuario(String correo, String contraseña) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCorreo().equals(correo) && usuario.getContraseña().equals(contraseña)) {
                return true;
            }
        }
        return false;
    }

    public static Usuario getUsuario(String correo) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCorreo().equals(correo)) {
                return usuario;
            }
        }
        return null;
    }

    public static Usuario getUsuario(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

}
