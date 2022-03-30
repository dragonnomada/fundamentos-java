public class ComponenteDetallesPaqueteUI extends ComponenteDetallesPaquete {

    IPaquete paquete;

    @Override
    public void setPaquete(IPaquete paquete) {
        this.paquete = paquete;
    }

    public void updateUI(AppAlmacenamientoPaquetesGUI app) {
        app.getLabel1().setText(String.format("%d", paquete.getId()));
        app.getLabel2().setText(paquete.getNombre());
        app.getLabel3().setText(paquete.getDimensiones());
    }
}
