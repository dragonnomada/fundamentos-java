public class PerroGuardian extends Perro {

    boolean modoAgresivo;

    public PerroGuardian(String nombre, int tamaño) {
        super(nombre, tamaño);
        this.modoAgresivo = false;
    }

    void entrarEnModoAgresivo() {
        modoAgresivo = true;
    }

    void salidDelModoAgresivo() {
        modoAgresivo = false;
    }

    @Override
    public void describe() {
        System.out.printf("AGRESIVO: %B ", modoAgresivo);
        super.describe(); // método original (superclase / padre)
        // this -> subclase / clase actual
        // super -> superclase / clase que se extiende
    }
}
