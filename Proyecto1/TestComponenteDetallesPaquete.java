public class TestComponenteDetallesPaquete {

    public static void main(String[] args) {

        ComponenteDetallesPaquete detallador = new ComponenteDetallesPaquete();

        detallador.setPaquete(new Paquete(123, "Cocas", 4, 4, 4));
        detallador.setPaquete(new Paquete(456, "Aguas", 1, 3, 2));
        detallador.setPaquete(new Paquete(789, "Chetos", 2, 1, 4));
        detallador.setPaquete(new Paquete(479, "Chicles", 3,2, 2));

    }

}
