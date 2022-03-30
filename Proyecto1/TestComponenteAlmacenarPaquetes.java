public class TestComponenteAlmacenarPaquetes {

    public static void main(String[] args) {

        ComponenteAlmacenarPaquetes almacenador = new ComponenteAlmacenarPaquetes();

        almacenador.setPaqueteNuevo(new Paquete(1, "Producto A", 4, 5, 6));
        almacenador.setPaqueteNuevo(new Paquete(2, "Producto B", 8, 3, 2));
        almacenador.setPaqueteNuevo(new Paquete(3, "Producto C", 6, 1, 9));

        IListadoPaquetes listado = almacenador.getListadoPaquetes();

        if (listado.hasPaquete(1)) {
            System.out.println("Si existe el paquete 1");
        }

        if (listado.hasPaquete(5)) {
            System.out.println("Si existe el paquete 5");
        } else {
            System.out.println("No existe el paquete 5");
        }

        for (IPaquete paquete : listado.getPaquetes()) {
            System.out.printf("[%d] %s %s\n", paquete.getId(), paquete.getNombre(), paquete.getDimensiones());
        }

    }

}
