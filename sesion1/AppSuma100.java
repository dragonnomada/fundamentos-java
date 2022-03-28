public class AppSuma100 {

    public static void main(String[] args) {
        int s = 0;

        // for (<inicializador>; <condición>; <incremento>)
        for (int n = 1; n <= 100; n = n + 1) {
            s = s + n;
        }

        System.out.printf("Suma: %d", s);
    }

}
