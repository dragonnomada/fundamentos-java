public class Persona implements IDesplazable, IDescribible {

    private int pasos; // 0
    private float velocidad = 2.5f;

    public void avanzar(int kilometros) {
        pasos = pasos + kilometros * 1000;
    }

    @Override
    public double tiempoEnAvanzar(int kilometros) {
        int pasos = kilometros * 1000;
        double tiempo = (double) pasos / velocidad;
        return tiempo;
    }

    public void describir() {
        System.out.printf("Soy una persona y he recorrido %d pasos\n", pasos);
    }

}
