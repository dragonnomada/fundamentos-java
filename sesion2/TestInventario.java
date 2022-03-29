import java.util.Date;

public class TestInventario {

    public static void main(String[] args) {

        Producto p1 = new Producto(123, "Coca Cola", 18.55, 20);
        Producto p2 = new Producto(456, "Galletas Marías", 13.99, 5);

        Contador contadorIngresos = new Contador();
        Contador contadorRetiros = new Contador();

        contadorIngresos.incrementar();
        contadorIngresos.incrementar();
        contadorIngresos.incrementar();

        contadorRetiros.incrementar();
        contadorRetiros.incrementar();

        RegistroInventario registro = new RegistroInventario(new Date(), p2, contadorIngresos.getCantidad(), contadorRetiros.getCantidad());

        System.out.printf("[%s] P:%d Ex%d Ix%d Rx%d Bx%d\n",
                registro.getFecha(),
                registro.getProducto().getId(),
                registro.getProducto().getExistencias(),
                registro.getIngresados(),
                registro.getRetiraron(),
                registro.getIngresados() - registro.getRetiraron() + registro.getProducto().getExistencias());

    }

}
