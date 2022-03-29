// private - solo en la clase
// protected - en la clase y en las subclases
// public - en la clase, en las subclases y fuera del objeto

public class Tienda {

    private int id; // 0
    protected String nombre; // null

    // Constructor
    // 1. El constructor es un método especial
    //      - Se llama exactamente igual que la clase
    //      - No determina ningún retorno
    // 2. Su objetivo es diseñar los parámetros suficientes
    //    para inicializar TODOS los atributos (buena práctica)
    // 3. Cuándo no se define un constructor, los atributos son inicializados
    //    automáticamente a su valor por defecto (int - 0, double 0.0, boolean - false, String - null)
    // 4. Las clases sin constructor se llaman "clases simples"
    //    y las clases con al menos un constructor se llaman "clases con constructor"
    public Tienda(int id, String nombre) {
        // this es el meta-objeto que permite el acceso a los atributos y métodos alcanzables
        this.id = id;
        this.nombre = nombre;
        // Se determina el valor inicial de cada atributo cuándo se genera su instancia
    }

    public void describir() {
        System.out.printf("[TIENDA %d] %s\n", id, nombre);
    }

}
