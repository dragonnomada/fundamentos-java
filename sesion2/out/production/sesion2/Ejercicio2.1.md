# Ejercicio 2.1

Dado el siguiente Diagrama de Clase, implementa el código en una función de Java.

    MaquinaDespachadora
    --------------------
     - a : int
     - b : int
     - c : int
     - d : int
     - e : int
     - f : int
     - bloqueado: boolean
     - seleccionado: char
    --------------------
     + seleccionarA()
     + seleccionarB()
     + seleccionarC()
     + seleccionarD()
     + seleccionarE()
     + seleccionarF()
     + mostrarDisplay()
     + despachar()

Considerar los siguientes algoritmos:

    seleccionarX()
        - Determinar si las existencias de X son menores o iguales a cero, entonces bloquear
        - Sino, debloquear
        - Cambiar el seleccionado a 'x'

    mostrarDisplay()
        - Imprimir el seleccionado o "X"
        - Determinar las existencias del seleccionado o '0'
        - Imprimir las existencias del seleccionado

    despachar()
        - Si está bloqueado imprimir un mensaje que la máquina está bloqueada
        - Restar una existencia al seleccionado
        - Bloquear la máquina