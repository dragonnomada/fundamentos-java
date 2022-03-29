import java.util.Calendar;

// superclase - Tienda(id, nombre)
// subclase - TiendaFisica(id, nombre, direccion, horaApertura, minutoApertura, ...)
//                  - super(id, nombre)
//                  - this(direccion, horaApertura, minutoApertura, ...)

// super -> Representa a la superclase (de la que se extiende esta clase)
// this  -> Representa a la subclase (que deriva de la superclase o la clase actual)

public class TiendaFisica extends Tienda {

    private String direccion; // null
    private int horaApertura; // 0
    private int minutoApertura; // 0
    private int horaCierre; // 0
    private int minutoCierre; // 0

    public TiendaFisica(int id, String nombre,
                        String direccion,
                        int horaApertura, int minutoApertura,
                        int horaCierre, int minutoCierre) {
        // Llama al constructor de la superclase
        super(id, nombre);
        // Inicializamos todos los atributos restantes (los de la subclase)
        this.direccion = direccion;
        this.horaApertura = horaApertura;
        this.minutoApertura = minutoApertura;
        this.horaCierre = horaCierre;
        this.minutoCierre = minutoCierre;
    }

    public void mostrarHorarioAtencion() {
        System.out.printf("De %d:%d a %d:%d horas\n",
                horaApertura, minutoApertura, horaCierre, minutoCierre);
    }

    public boolean estaAbierta() {
        Calendar fechaActual = Calendar.getInstance();

        int horaActual = fechaActual.get(Calendar.HOUR_OF_DAY);
        int minutoActual = fechaActual.get(Calendar.MINUTE);

        // 8:30 13:53 16:30

        // 830 <= 1353 <= 1630 (militar x100)
        // 510 <= 833 <= 990 (natural x60)

        int militarActual = horaActual * 100 + minutoActual;
        int militarApertura = horaApertura * 100 + minutoApertura;
        int militarCierre = horaCierre * 100 + minutoCierre;

        if (militarApertura <= militarActual && militarActual <= militarCierre) {
            return true;
        } else {
            return false;
        }
    }

}
