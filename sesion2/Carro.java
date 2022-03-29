public class Carro implements IDesplazable, IDescribible {

    private int kilometraje; // 0
    private double velocidad = 100.0;

    public void avanzar(int kilometros) {
        kilometraje += kilometros;
    }

    @Override
    public double tiempoEnAvanzar(int kilometros) {
        return kilometros / velocidad;
    }

    public void describir() {
        System.out.printf("Soy un carro y he recorrido %d kilómetros\n", kilometraje);
    }

}
