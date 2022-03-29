public class TestIDesplazable {

    public static void main(String[] args) {

        IDesplazable d1 = new Persona();
        IDesplazable d2 = new Carro();
        IDesplazable d3 = new Persona();
        IDesplazable d4 = new Persona();
        IDesplazable d5 = new Carro();

        d1.avanzar(10);
        d2.avanzar(11);
        d3.avanzar(24);
        d4.avanzar(50);
        d5.avanzar(30);

        System.out.printf("D1: %.2f\n", d1.tiempoEnAvanzar(10));
        System.out.printf("D2: %.2f\n", d2.tiempoEnAvanzar(11));
        System.out.printf("D3: %.2f\n", d3.tiempoEnAvanzar(24));
        System.out.printf("D4: %.2f\n", d4.tiempoEnAvanzar(50));
        System.out.printf("D5: %.2f\n", d5.tiempoEnAvanzar(30));
    }

}
