import java.util.Scanner;

public class TestComponenteRegistrarPaquete {

    public static void main(String[] args) {

        ComponenteRegistrarPaquete registrador = new ComponenteRegistrarPaquete();

        Scanner scanner = new Scanner(System.in);

        registrador.capturar(scanner);

        // Objeto interfaz (no hay acceso directo al objeto original)
        IPaquete paquete = registrador.getPaqueteRegistrado();

        System.out.printf("[%d] %s %s", paquete.getId(), paquete.getNombre(), paquete.getDimensiones());

        scanner.close();

    }

}
