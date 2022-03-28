# Condicionales

## Condicional `if`

Para determinar un código que se ejecute basado en una condición usaremos la estructura `if (<condición>) { <bloque> }`.

    SINTAXIS:

    # 1. Condicional simple
    if (<condición>) {
        <bloque verdadero>
    }

    # 2. Condicional doble
    if (<condición>) {
        <bloque verdadero>
    } else {
        <bloque falso>
    }

    # 3. Condicional anidada
    if (<condición 1>) {
        <bloque 1>
    } else if (<condición 2>) {
        <bloque 2>
    } ... {
    } else if (<condición n>) {
        <bloque n>
    } else {
        <bloque falso>
    }

> Comparadores

| Símbolo | Expresión | Descripción                            |
|---------|-----------|----------------------------------------|
| `>`     | `a > b`   | Comparar si `a` es mayor a `b`         |
| `>=`    | `a >= b`  | Comparar si `a` es mayor o igual a `b` |
| `<`     | `a < b`   | Comparar si `a` es menor a `b`         |
| `<=`    | `a <= b`  | Comparar si `a` es menor o igual a `b` |
| `==`    | `a == b`  | Comparar si `a` es igual a `b`         |
| `!=`    | `a != b`  | Comparar si `a` es distinto a `b`      |

> Expresiones lógicas

| Símbolo | Expresión | Descripción                                        |
|---------|-----------|----------------------------------------------------|
| `&&`    | `p && q`  | Determina que es verdadero si se cumple `p` y `q`  |
| `ll`    | `p ll q`  | Determina que es verdadero si se cumple `p` o `q`  |
| `!`     | `!p` | Determina que es verdadero si `p` es falso         |

> Ejemplo 1.

```java
public class AppEnRango {

    public static void main(String[] args) {

        int x = 20;

        if (x >= 5 && x <= 10) {
            System.out.println("En el rango de [5, 10]");
        } else if (x > 10 && x <= 20) {
            System.out.println("En el rango de (10, 20]");
        } else {
            System.out.println("Está fuera de los rangos");
        }

    }

}

```

## Condicional `siwtch`

Otro tipo de condicional es `switch` que nos permitirá determinar si un valor se encuentra en algún caso.

    SINTAXIS:

    switch (<valor>) {
        case <valor 1>:
            <bloque 1>
            break;
        case <valor 2>:
            <bloque 2>
            break;
        ...
        case <valor n>:
            <bloque n>
            break;
        default:
            <bloque falso>
            break;
    }

> Ejemplo 2.

```java
public class AppEnCaso {

    public static void main(String[] args) {

        int x = 3;

        switch (x) {
            case 1:
                System.out.println("x es 1");
                break; 
            case 2:
                System.out.println("x es 2");
                break; 
            case 3:
                System.out.println("x es 3");
                break;
            default:
                System.out.println("x es otro");
                break;
        }

    }

}
```

## Enumeraciones

Las enumeraciones nos permiten hablar de valores constantes (valores enumerados), con lo que cualquier variable
enumerada sólo podría tener valores de esa enumeración. Es ideal para determinar tipos de datos constantes como
los posibles métodos de pago, los posibles valores para un género, los valores posibles para un estado, municipio, etc.

Estas enumeraciones impedirán que los datos tomen valores fuera del conjunto de valores definidos.

    SINTAXIS:

    enum <Nombre> {
        <valor 1>,
        <valor 2>,
        ...,
        <valor n>
    }

> Ejemplo 3.

```java
public enum MetodoPago {
    EFECTIVO,
    TARJETA_DEBITO,
    TARJETA_CREDITO
}

// MetodoPago metodo1 = MetodoPago.EFECTIVO;
// MetodoPago metodo2 = MetodoPago.TARJETA_DEBITO;
```

## Enumeraciones y Condicionales

Podemos unir las enumeraciones con las condicionales para tener programas más precisos.
> Ejemplo 4.

```java
public enum MetodoPago {
    EFECTIVO,
    TARJETA_DEBITO,
    TARJETA_CREDITO
}

public class AppPago {

    public static void main(String[] args) {

        MetodoPago metodoPago = MetodoPago.EFECTIVO;

        switch (metodoPago) {
            case EFECTIVO:
                System.out.println("Se pagará con tarjeta en efectivo");
                break;
            case TARJETA_DEBITO:
                System.out.println("Se pagará con tarjeta de débito");
                break;
            case TARJETA_CREDITO:
                System.out.println("Se pagará con tarjeta de crédito");
                break;
            default:
                System.out.println("El método de pago no es válido");
                break;
        }

    }

}
```