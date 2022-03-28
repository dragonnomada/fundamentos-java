class AppSuma2000 {

    public static void main(String[] args) {

        int s = 0;
        int n = 1;

        while (s <= 2000) {
            s = s + n;
            n = n + 1;
        }

        System.out.printf("Suma es: %d\n", s);
        System.out.printf("N es: %d", n);

    }

}