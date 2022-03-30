public class ComponenteConsultarPaqueteUI extends ComponenteConsultarPaquete {

    public void consultar(AppAlmacenamientoPaquetesGUI app) {
        int id = (int)app.getSpinner5().getValue();
        if (listado.hasPaquete(id)) {
            paqueteConsultado = listado.getPaquete(id);
        } else {
            System.out.printf("El paquete con ID=%d no existe\n", id);
        }
    }

}
