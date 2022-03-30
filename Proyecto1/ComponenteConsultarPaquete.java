import java.util.Scanner;

public class ComponenteConsultarPaquete {

    protected IListadoPaquetes listado;
    protected IPaquete paqueteConsultado;

    public void consultar(Scanner scanner) {
        System.out.println("Dame el ID del Paquete:");
        int id = scanner.nextInt(); scanner.hasNextLine();
        if (listado.hasPaquete(id)) {
            paqueteConsultado = listado.getPaquete(id);
        } else {
            System.out.printf("El paquete con ID=%d no existe\n", id);
        }
    }

    public void setListadoPaquetes(IListadoPaquetes listadoPaquetes) {
        listado = listadoPaquetes;
        for (IPaquete paquete : listadoPaquetes.getPaquetes()) {
            System.out.printf("[%d] %s\n", paquete.getId(), paquete.getNombre());
        }
    }

    public IPaquete getPaqueteConsultado() {
        return paqueteConsultado;
    }

}
