public class ComponenteDetallesPaquete {

    public void setPaquete(IPaquete paquete) {
        // Usamos la excepción para controlar un posible código no controlado
        try {
            System.out.printf("[%d] %s %s\n", paquete.getId(), paquete.getNombre(), paquete.getDimensiones());
        } catch (Exception error) {
            System.out.println("Error al detallar el paquete");
        }
    }

}
