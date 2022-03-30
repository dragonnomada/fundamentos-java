import java.util.Scanner;

public class ComponenteRegistrarPaquete {

    protected Paquete paquete = null; // Paquete(id, nombre, alto, ancho, largo)

    public void capturar(Scanner scanner) {
        // TODO: Recolectar la información para crear un nuevo paquete
        System.out.println("Dame el ID del Paquete:");
        int id = scanner.nextInt(); scanner.nextLine();

        System.out.println("Dame el Nombre del Paquete:");
        String nombre = scanner.nextLine();

        System.out.println("Dame el Alto del Paquete:");
        double alto = scanner.nextDouble(); scanner.nextLine();

        System.out.println("Dame el Ancho del Paquete:");
        double ancho = scanner.nextDouble(); scanner.nextLine();

        System.out.println("Dame el Largo del Paquete:");
        double largo = scanner.nextDouble(); scanner.nextLine();

        // Determinar cuál es el nuevo paquete registrado
        this.paquete = new Paquete(id, nombre, alto, ancho, largo);
    }

    public IPaquete getPaqueteRegistrado() {
        //return paquete;

        // paquete <- Clase Paquete <- Interfaz IPaquete
        // paquete <- Interfaz IPaquete (objeto interfaz)
        // paquete - Objeto original de la Clase Paquete
        // paquete - Objeto interfaz de la Interfaz IPaquete

        // Objeto original
        // paquete.getAlto()

        // Objeto interfaz
        // - Transforma el objeto original, en un objeto interfaz
        IPaquete paqueteInterfaz = (IPaquete) paquete;

        return paqueteInterfaz;
    }

}
