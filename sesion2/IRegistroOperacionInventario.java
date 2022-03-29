import java.util.Date;

public interface IRegistroOperacionInventario {

    public Date getFecha();
    public IProducto getProducto();
    public int getIngresados();
    public int getRetiraron();

}
