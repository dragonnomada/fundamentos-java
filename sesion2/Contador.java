public class Contador implements ICantidad {

    private int cantidad;

    @Override
    public int getCantidad() {
        return cantidad;
    }

    public void incrementar() {
        cantidad++;
    }

    public void decrementar() {
        if (cantidad >= 1) {
            cantidad--;
        }
    }

}
