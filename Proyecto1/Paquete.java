public class Paquete implements IPaquete {

    private int id;
    private String nombre;
    private double alto;
    private double ancho;
    private double largo;

    public Paquete(int id, String nombre, double alto, double ancho, double largo) {
        this.id = id;
        this.nombre = nombre;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getDimensiones() {
        return String.format("[%.2f x %.2f x %.2f]", ancho, largo, alto);
    }

}
