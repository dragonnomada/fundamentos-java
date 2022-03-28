# Ejercicio 1

1. Crea un programa llamado `AppSuma` que 
tenga un punto de ejecución 
`public static void main(String[] args)`
2. Solicitar con `Scanner` un entero `a` y un entero `b`
   1. Crear el `Scanner scanner = new Scanner(System.in)`
   2. Imprimir un mensaje al usuario `"Dame X:"`
   3. Leer el valor para un entero `scanner.nextInt()`
3. Calcular el entero `c` con la suma de `a` y `b`
4. Imprimir con el formato `"%d + %d = %d", a, b, c`

---

> Pista:

```java
import java.util.Scanner;

public class AppSuma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // TODO: Solicitar a, b y determinar c
        
        scanner.close();

    }

}
```