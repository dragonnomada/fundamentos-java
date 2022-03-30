public class TestGato {

    public static void main(String[] args) {

        Gato gato = new Gato();

        // Polimorfismo - Múltiples formas de hacer algo común
        // "Algo común" es saludar
        // "Múltiples formas de saludar": sin mensaje, con mensaje

        gato.saludar();

        gato.saludar("hola");

        gato.saludar("adiós");

        gato.saludar("hola", 5);

        Gato gato2 = new Gato("Shakmol");

        gato2.saludar("otro", 10);

    }

}
