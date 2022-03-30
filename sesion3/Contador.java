public class Contador implements ICantiable {

    int cuenta = 0;

    void incrementar() {
        cuenta++;
    }

    void decrementar() {
        cuenta--;
    }

    public int getCantidad() {
        return cuenta;
    }

}
