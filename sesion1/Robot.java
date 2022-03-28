public class Robot {

    // Atributos

    // Un atributo es una variable marcada dentro de la clase
    // que nos permite retener valores (memoria) en el objeto

    int x = 0;
    int y = 0;
    RobotDireccion direccion = RobotDireccion.NORTE; // variable enumeración (valores limitados)

    // Métodos

    // Un método es una función con acceso a los atributos de la clase
    // Una función es una estructura que permite recibir parámetros de entrada para producir una salida

    void avanzar() {
        switch (direccion) {
            case NORTE:
                y++;
                break;
            case SUR:
                y--;
                break;
            case ESTE:
                x++;
                break;
            case OESTE:
                x--;
                break;
            default:
                System.out.println("No me puedo mover en esa dirección");
                break;
        }
    }

    void mirarNorte() {
        direccion = RobotDireccion.NORTE;
    }

    void mirarSur() {
        direccion = RobotDireccion.SUR;
    }

    void mirarEste() {
        direccion = RobotDireccion.ESTE;
    }

    void mirarOeste() {
        direccion = RobotDireccion.OESTE;
    }

    void girarSentidoManecillas() {
        switch (direccion) {
            case NORTE:
                direccion = RobotDireccion.ESTE;
                break;
            case SUR:
                direccion = RobotDireccion.OESTE;
                break;
            case ESTE:
                direccion = RobotDireccion.SUR;
                break;
            case OESTE:
                direccion = RobotDireccion.NORTE;
                break;
            default:
                System.out.println("No me puedo girar en esa dirección");
                break;
        }
    }

    void girarSentidoContrarioManecillas() {
        switch (direccion) {
            case NORTE:
                direccion = RobotDireccion.OESTE;
                break;
            case SUR:
                direccion = RobotDireccion.ESTE;
                break;
            case ESTE:
                direccion = RobotDireccion.NORTE;
                break;
            case OESTE:
                direccion = RobotDireccion.SUR;
                break;
            default:
                System.out.println("No me puedo girar en esa dirección");
                break;
        }
    }

    void describir() {
        System.out.printf("ROBOT: (%d, %d) [%s]\n", x, y, direccion);
    }

}
