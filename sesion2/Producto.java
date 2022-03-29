public class Producto {

    private int id;
    private String nombre;
    private double precio;
    private int existencias;

    public int getId() {
        return id;
    }

    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public void setExistencias(int nuevasExistencias) {
        if (nuevasExistencias > 0) {
            existencias = nuevasExistencias;
            System.out.println("Las existencias fueron actualizadas");
        } else {
            System.out.println("Las existencias tienen que ser positivas");
        }
    }

}

// Producto p1 = new Producto()
// Producto p2 = new Producto()
// ...
// Producto pN = new Producto()