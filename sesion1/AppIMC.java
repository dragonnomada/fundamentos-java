public class AppIMC {

    public static void main(String[] args) {

        // Variables Primitivas
        // SINTAXIS:
        //  Declarar el uso de una variable: <tipo de dato> <nombre de la variable>;
        //  Declarar e inicializar una variable: <tipo de dato> <nombre de la variable> = <valor>;

        double estatura = 1.73;
        double peso = 85.2;

        double imc = peso / (estatura * estatura);

        // System.out.println(<valor>) -> <valor> transformado a texto

        // System.out.printf(<formato>, <param 1>, <param 2>, ...) -> <param i> es reemplazado en el formato
        // <formato> - "Estatura: %f, Peso: %f e IMC: %f", estatura, peso, imc
        // int, long -> %d
        // char -> %c
        // float, double -> %f | %.<n>f
        // boolean -> %b | %B
        // String, Objeto -> %s

        System.out.printf("Estatura: %.2f, Peso: %.2f e IMC: %.2f", estatura, peso, imc);

    }

}
