public class TestTiendaFisica {

    public static void main(String[] args) {

        TiendaFisica tf1 = new TiendaFisica(123, "Abarrotes Jaime",
                "Av. Juaréz, 123. Col. Centro, Ciudad de México. C.P. 151234",
                8,30,
                14,02
        );

        tf1.mostrarHorarioAtencion();
        tf1.describir();

        if (tf1.estaAbierta()) {
            System.out.println("La tienda física 1 está abierta");
        } else {
            System.out.println("La tienda física 1 está cerrada");
        }

    }

}
