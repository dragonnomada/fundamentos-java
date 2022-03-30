import java.util.Scanner;

public class AppSistemaAlmacenamientoPaquetes {

    public static void main(String[] args) {

        ComponenteRegistrarPaquete registrador = new ComponenteRegistrarPaquete();
        ComponenteAlmacenarPaquetes almacenador = new ComponenteAlmacenarPaquetes();
        ComponenteConsultarPaquete consultador = new ComponenteConsultarPaquete();
        ComponenteDetallesPaquete detallador = new ComponenteDetallesPaquete();

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Sistema de Almacenamiento de Paquetes");
            System.out.println("1. Registrar Paquete");
            System.out.println("2. Consultar Paquetes");
            System.out.println("3. Salir");

            System.out.println("Opción:");
            int opcion = scanner.nextInt(); scanner.nextLine();

            if (opcion == 1) {
                System.out.println("Registrar Paquete");
                registrador.capturar(scanner);
                IPaquete paquete = registrador.getPaqueteRegistrado();
                almacenador.setPaqueteNuevo(paquete);
                detallador.setPaquete(paquete);
                System.out.println("Paquete registrado");
            } else if (opcion == 2) {
                System.out.println("Consultar Paquetes");
                consultador.setListadoPaquetes(almacenador.getListadoPaquetes());
                consultador.consultar(scanner);
                IPaquete paquete = consultador.getPaqueteConsultado();
                detallador.setPaquete(paquete);
                System.out.println("Paquete consultado");
            } else if (opcion == 3) {
                System.out.println("Adiós");
                break;
            } else {
                System.out.println("La opción no existe");
            }

        }

    }

}
