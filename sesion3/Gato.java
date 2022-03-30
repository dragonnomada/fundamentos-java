public class Gato {

    String nombre;
    String raza;

    Gato() {
        nombre = "michi";
        raza = "callejero";
    }

    Gato(String nombre) {
        this.nombre = nombre;
        raza = "callejero";
    }

     Gato(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    void saludar() {
        System.out.println("meowwww");
    }

    void saludar(String mensaje) {
        switch (mensaje) {
            case "hola":
                System.out.println("prrrrrr");
                break;
            case "adiós":
                System.out.println("grrrrr");
                break;
            default:
                saludar();
                break;
        }
    }

    void saludar(String mensaje, int veces) {
        for (int i = 0; i < veces; i++) {
            saludar(mensaje);
        }
    }

}
