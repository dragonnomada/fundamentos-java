public class TestIDescribible {

    public static void main(String[] args) {

        IDescribible d1 = new Persona();
        IDescribible d2 = new Carro();
        IDescribible d3 = new Tienda(123, "Don Lucho");
        IDescribible d4 = new Persona();
        IDescribible d5 = new Persona();
        IDescribible d6 = new Carro();
        IDescribible d7 = new Tienda(456, "Abarrotes Frescos");

        // ==============================================================

        d1.describir();
        d2.describir();
        d3.describir();
        d4.describir();
        d5.describir();
        d6.describir();
        d7.describir();

    }

}
