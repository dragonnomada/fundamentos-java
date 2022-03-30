public class GatoDomestico extends Gato {

    // Reemplazamos el método original por la nueva funcionalidad
    @Override
    void saludar() {
        //super.saludar(); // Método original
        System.out.println("miua");
    }

}
