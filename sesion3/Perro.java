public class Perro {

    String nombre;
    int tamaño;

    public Perro(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public void describe() {
        System.out.printf("[%s] Tamaño: %d\n", nombre, tamaño);
    }
}
