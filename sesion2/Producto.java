public class Producto implements IProducto {

    private int id;
    private String nombre;
    private double precio;
    private int existencias;

    public Producto(int id, String nombre, double precio, int existencias) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existencias;
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
    public double getPrecio() {
        return precio;
    }

    @Override
    public int getExistencias() {
        return existencias;
    }
}

// Producto p1 = new Producto()
// Producto p2 = new Producto()
// ...
// Producto pN = new Producto()