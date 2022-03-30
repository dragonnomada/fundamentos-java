import java.util.Scanner;

public class TestComponenteConsultarPaquete {

    public static void main(String[] args) {

        ComponenteAlmacenarPaquetes almacenador = new ComponenteAlmacenarPaquetes();

        almacenador.setPaqueteNuevo(new Paquete(1, "Producto A", 4, 5, 6));
        almacenador.setPaqueteNuevo(new Paquete(2, "Producto B", 8, 3, 2));
        almacenador.setPaqueteNuevo(new Paquete(3, "Producto C", 6, 1, 9));

        IListadoPaquetes listado = almacenador.getListadoPaquetes();

        ComponenteConsultarPaquete consultador = new ComponenteConsultarPaquete();

        consultador.setListadoPaquetes(listado);

        Scanner scanner = new Scanner(System.in);

        consultador.consultar(scanner);

        scanner.close();

        IPaquete paquete = consultador.getPaqueteConsultado();

        if (paquete != null) {
            System.out.printf("[%d] %s %s\n", paquete.getId(), paquete.getNombre(), paquete.getDimensiones());
        } else {
            System.out.println("No hay paquete consultado");
        }

    }

}
