public class TestUtil {

    public static void main(String[] args) {
        Util.incrementar();
        Util.incrementar();
        Util.incrementar();

        System.out.println(Util.contador);

        // DB.connect("mysql://...", "pepe", "pepe123");
        // DB.exec("insert into personas ...");
    }

}
