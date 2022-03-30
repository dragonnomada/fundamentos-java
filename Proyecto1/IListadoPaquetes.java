public interface IListadoPaquetes {

    public IPaquete[] getPaquetes();
    public IPaquete getPaquete(int id);
    public boolean hasPaquete(int id);

}
