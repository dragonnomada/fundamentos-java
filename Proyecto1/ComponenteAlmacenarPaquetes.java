import java.util.ArrayList;

public class ComponenteAlmacenarPaquetes implements IListadoPaquetes {

    private ArrayList<IPaquete> paquetes = new ArrayList<>();

    public void setPaqueteNuevo(IPaquete paquete) {
        paquetes.add(paquete);
    }

    public IListadoPaquetes getListadoPaquetes() {
        return this; // this -> ComponenteAlmacenarPaquetes -> IListadoPaquetes
    }

    @Override
    public IPaquete[] getPaquetes() {
        IPaquete[] paquetesArray = new Paquete[paquetes.size()];

        for (int i = 0; i < paquetes.size(); i++) {
            paquetesArray[i] = paquetes.get(i);
        }

        return paquetesArray;
    }

    @Override
    public IPaquete getPaquete(int id) {
        for (IPaquete paquete : paquetes) {
            if (paquete.getId() == id) {
                return paquete;
            }
        }
        return null;
    }

    @Override
    public boolean hasPaquete(int id) {
        for (IPaquete paquete : paquetes) {
            if (paquete.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
