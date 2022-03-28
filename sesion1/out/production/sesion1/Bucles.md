# Bucles

## Arreglos

Podemos crear variables que repliquen un mismo tipo de dato en una dimensión más amplia. Los arreglos permiten
retener tantos valores como se reserven de la memoria.

    SINTAXIS:

    <tipo>[] <nombre> = new <tipo>[<n>];

    NOTAS:

    * Para establecer un valor usamos <nombre>[<posición>] = <valor>;
    * Para recuperar un valor usamos <tipo> <resultado> = <nombre>[<posición>];
    * Para recuperar el tamaño del arreglo usamos <nombre>.length; (int N = con N = <nombre>.length)
    * Todas las posiciones del arreglo van de 0 a N - 1

> Ejemplo 1.

```java
class App {
    
    public static void main(String[] args) {
        
        double[] calificaciones = new double[5];
        
        calificaciones[0] = 9.5;
        calificaciones[1] = 6.8;
        calificaciones[2] = 8.3;
        calificaciones[3] = 4.1;
        calificaciones[4] = 10.0;
        
        System.out.printf("Matemáticas: %.2f\n", calificaciones[0]);
        System.out.printf("Español: %.2f\n", calificaciones[1]);
        System.out.printf("Historia: %.2f\n", calificaciones[2]);
        System.out.printf("Geografía: %.2f\n", calificaciones[3]);
        System.out.printf("Música: %.2f\n", calificaciones[4]);
        
    }
    
}
```

## Iteradores

### Iterador `for` tradicional

Los iteradores recorren una variable desde su valor inicial, con el incremento dado, hasta que una condición
se cumpla.

    SINTAXIS:

    for (<tipo> <iterador>; <condición sobre el iterador>; <incremento al iterador>) {
        <bloque para cada iterador>
    }

```java
class App {
    
    public static void main(String[] args) {
        
        double[] calificaciones = new double[5];
        
        calificaciones[0] = 9.5;
        calificaciones[1] = 6.8;
        calificaciones[2] = 8.3;
        calificaciones[3] = 4.1;
        calificaciones[4] = 10.0;
        
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print(calificaciones[i]);
        }
        
    }
    
}
```

### Iterador `for` por elemento

## Ciclos

### Ciclo `while` simple

Un ciclo `while` (mientras) repite un bloque de código mientras una condición se cumpla.

    SINTAXIS:

    while (<condición>) {
        <bloque>
    }

```java
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
```

### Ciclo `do-while` compuesto