public class Jarra {

    private int capacidad = 2000;
    private int cantidad = 0;

    public void agregar(int mililitros) {
        if (cantidad + mililitros <= capacidad) {
            cantidad = cantidad + mililitros; // cantidad += mililitros;
            System.out.printf("Se agregaron %d mililitros\n", mililitros);
        } else {
            System.out.printf("No es posible agregar %d mililitros\n", mililitros);
        }
    }

    public void quitar(int mililitros) {
        if (cantidad - mililitros >= 0) {
            cantidad = cantidad - mililitros; // cantidad -= mililitros;
            System.out.printf("Se quitaron %d mililitros\n", mililitros);
        } else {
            System.out.printf("No es posible quitar %d mililitros\n", mililitros);
        }
    }

    public int llenar() {
        int diferencia = capacidad - cantidad;
        cantidad = capacidad;
        System.out.printf("Se usaron %d mililitros para llenar la jarra\n", diferencia);
        return diferencia;
    }

    public int vaciar() {
        int diferencia = cantidad - 0;
        cantidad = 0;
        System.out.printf("Se vaciaron %d mililitros de la jarra\n", diferencia);
        return diferencia;
    }

    public void describir() {
        // 1500ml / 2000ml (75.0%)
        double porcentajeOcupado = (cantidad / capacidad) * 100.0;
        System.out.printf("%dml / %dml (%.1f)", cantidad, capacidad, porcentajeOcupado);
    }

}
