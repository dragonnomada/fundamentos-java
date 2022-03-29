public class TestTienda {

    public static void main(String[] args) {

        // PRIORI
        Tienda t1 = new Tienda(1, "Doña Mary");

        // PRIORI
        Tienda t2 = new Tienda(2, "La Oficina");

        // POSTERI
        // t1.cambiarNombre("Don Beto");

        t1.describir();

        t2.describir();

    }

}
