public class MaquinaDespachadora {

    int existenciasA = 9;
    int existenciasB = 9;
    int existenciasC = 9;
    int existenciasD = 9;
    int existenciasE = 9;
    int existenciasF = 9;

    boolean bloqueado = true;

    char seleccionado = '-';

    void seleccionarA() {
        if (existenciasA <= 0) {
            bloqueado = true;
        } else {
            bloqueado = false;
        }
        seleccionado = 'A';
    }

    void seleccionarB() {
        if (existenciasB <= 0) {
            bloqueado = true;
        } else {
            bloqueado = false;
        }
        seleccionado = 'B';
    }

    void seleccionarC() {
        if (existenciasC <= 0) {
            bloqueado = true;
        } else {
            bloqueado = false;
        }
        seleccionado = 'C';
    }

    void seleccionarD() {
        if (existenciasD <= 0) {
            bloqueado = true;
        } else {
            bloqueado = false;
        }
        seleccionado = 'D';
    }

    void seleccionarE() {
        if (existenciasE <= 0) {
            bloqueado = true;
        } else {
            bloqueado = false;
        }
        seleccionado = 'E';
    }

    void seleccionarF() {
        if (existenciasF <= 0) {
            bloqueado = true;
        } else {
            bloqueado = false;
        }
        seleccionado = 'F';
    }

    void mostrarDisplay() {
        System.out.printf("%c: ", seleccionado);

        int existencias = 0;

        switch (seleccionado) {
            case 'A':
                existencias = existenciasA;
                break;
            case 'B':
                existencias = existenciasB;
                break;
            case 'C':
                existencias = existenciasC;
                break;
            case 'D':
                existencias = existenciasD;
                break;
            case 'E':
                existencias = existenciasE;
                break;
            case 'F':
                existencias = existenciasF;
                break;
        }

        System.out.printf("%d [%B]\n", existencias, bloqueado);
    }

    String getDisplay() {
        String display = "";

        display += String.format("%c: ", seleccionado);

        int existencias = 0;

        switch (seleccionado) {
            case 'A':
                existencias = existenciasA;
                break;
            case 'B':
                existencias = existenciasB;
                break;
            case 'C':
                existencias = existenciasC;
                break;
            case 'D':
                existencias = existenciasD;
                break;
            case 'E':
                existencias = existenciasE;
                break;
            case 'F':
                existencias = existenciasF;
                break;
        }

        display += String.format("%d [%B]\n", existencias, bloqueado);

        return display;
    }

    void despachar() {
        if (bloqueado) {
            System.out.println("La máquina está bloqueada");
            System.out.println("No puedo despachar");
        } else {
            switch (seleccionado) {
                case 'A':
                    existenciasA--;
                    break;
                case 'B':
                    existenciasB = existenciasB - 1;
                    break;
                case 'C':
                    --existenciasC;
                    break;
                case 'D':
                    existenciasD -= 1;
                    break;
                case 'E':
                    existenciasE = existenciasE - 1;
                    break;
                case 'F':
                    existenciasF -= 1;
                    break;
            }
            bloqueado = true;
            seleccionado = '-';
        }
    }

}
