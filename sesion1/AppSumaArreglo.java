public class AppSumaArreglo {

    public static void main(String[] args) {

        int s = 0;

        int[] numeros = new int[] { 5, 3, 4, 7, 6, 2, 8, 7 };

        // PARA i <- 0 HASTA numeros.TAMAÑO CON PASO 1 HACER
        //      n <- numeros.POSICIÓN(i)
        //      s <- s + n
        // FIN PARA
        for (int i = 0; i < numeros.length; i++) {
            int n = numeros[i];
            s = s + n;
        }

        System.out.printf("Suma: %d", s);

    }

}
