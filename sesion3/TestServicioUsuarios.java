public class TestServicioUsuarios {

    public static void main(String[] args) {
        ServicioUsuarios.agregarUsuario("José José", "pepe@gmail.com", "pepe123");

        if (ServicioUsuarios.existeUsuario("José José")) {
            System.out.println("Si existe el usuario José José");
        } else {
            System.out.println("Si existe el usuario José José");
        }

        if (ServicioUsuarios.existeUsuario("pepe@gmail.com", "pepe124")) {
            Usuario usuario = ServicioUsuarios.getUsuario("pepe@gmail.com");
            System.out.printf("Bienvenido, %s\n", usuario.getNombre());
        } else {
            System.out.println("No se ha podido iniciar sesión");
        }
    }

}
