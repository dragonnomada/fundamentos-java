import java.util.Scanner;

public class AppIMCUsuario {

    public static void main(String[] args) {

        // Variable (Objeto Clase: java.util.Scanner)
        // Recupera (escanea) datos desde un stream (la entrada estándar, un archivo, ...)
        // System.in - stream de entrada estándar (el teclado en la terminal)
        // scanner.next()
        // scanner.nextInt()
        // scanner.nextFloat()
        // scanner.nextDouble()
        // scanner.nextLine()
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame la estatura:");
        double estatura = scanner.nextDouble(); scanner.nextLine();
        System.out.println("Dame el peso:");
        double peso = scanner.nextDouble(); scanner.nextLine();

        double imc = peso / Math.pow(estatura, 2);

        System.out.printf("Estatura: %.2f, Peso: %.2f e IMC: %.2f", estatura, peso, imc);

    }

}
