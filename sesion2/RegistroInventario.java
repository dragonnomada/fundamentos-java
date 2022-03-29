import java.util.Date;

public class RegistroInventario implements IRegistroOperacionInventario {

    private Date fecha;
    private IProducto producto;
    private int ingresaron;
    private int retiraron;

    public RegistroInventario(Date fecha, IProducto producto, int ingresaron, int retiraron) {
        this.fecha = fecha;
        this.producto = producto;
        this.ingresaron = ingresaron;
        this.retiraron = retiraron;
    }

    @Override
    public Date getFecha() {
        return fecha;
    }

    @Override
    public IProducto getProducto() {
        return producto;
    }

    @Override
    public int getIngresados() {
        return ingresaron;
    }

    @Override
    public int getRetiraron() {
        return retiraron;
    }
}
