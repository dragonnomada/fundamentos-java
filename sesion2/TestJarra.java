public class TestJarra {

    public static void main(String[] args) {

        Jarra j1 = new Jarra();
        Jarra j2 = new Jarra();
        Jarra j3 = new Jarra();

        j1.llenar();
        j2.agregar(300);
        j3.agregar(700);

        j1.describir();
        j2.describir();
        j3.describir();

        j1.agregar(100);
        j2.llenar();
        //j3.quitar(200); // El método es privado

        j1.describir();
        j2.describir();
        j3.describir();

        j1.vaciar();
        j2.vaciar();
        j3.vaciar();

        j1.describir();
        j2.describir();
        j3.describir();

        j1.agregar(500);
        j2.agregar(300);
        int suma = j1.vaciar() + j2.vaciar();
        j3.agregar(suma);
        int diferencia = j3.llenar();
        j1.agregar(diferencia);

        j1.describir();
        j2.describir();
        j3.describir();

    }

}
