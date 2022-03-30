public class ComponenteRegistrarPaqueteUI extends ComponenteRegistrarPaquete {

    public void capturar(AppAlmacenamientoPaquetesGUI app) {
        int id = (int)app.getSpinner1().getValue();
        String nombre = app.getTextField1().getText();
        double alto = (double)(int)app.getSpinner2().getValue();
        double ancho = (double)(int)app.getSpinner2().getValue();
        double largo = (double)(int)app.getSpinner2().getValue();

        this.paquete = new Paquete(id, nombre, alto, ancho, largo);
    }

}
