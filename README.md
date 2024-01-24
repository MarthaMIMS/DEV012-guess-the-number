# Adivina el Número - Guess the Number

## Índice

- [1. Introducción](#1-introduccion)
- [2. Caracteristicas](#2-Caracteristicas)
- [3. Estrucurura del proyecto](#3-estructura)
- [4. Ejecucion](#4-ejecucion)
- [5. Pruebas Unitarias](#5-pruebas)
- [6. Consideraciones Técnicas](#6-consideraciones-técnicas)
- [7. Hitos del proyecto](#7-hitos-del-proyecto)
- [8. Recomendaciones](#8-recomendaciones)

---

## 1. Introducción 
Guess The Number Game es un juego interactivo desarrollado en Java que se ejecuta en el terminal. El juego implica que la jugadora y el ordenador se turnen para adivinar un número aleatorio entre 1 y 100, teniendo en cuenta las tentativas anteriores y las pistas sobre si la suposición fue "muy alta" o "muy baja".
![GUESS THE NUMBER](https://firebasestorage.googleapis.com/v0/b/laboratoria-945ea.appspot.com/o/guess-the-number.png?alt=media)
## 2. Características

- **Juego Interactivo**: La jugadora y el ordenador se turnan para hacer suposiciones y recibir pistas sobre la dirección correcta.
- **Número Aleatorio**: El número a adivinar se genera aleatoriamente entre 1 y 100 al inicio de cada juego.
- **Pistas Personalizadas**: Se proporcionan pistas específicas sobre si la suposición fue "muy alta" o "muy baja" en relación con el número objetivo.
- **Separación de Responsabilidades**: El código sigue principios de diseño que separan las responsabilidades para facilitar el mantenimiento y la escalabilidad.
- **Pruebas Unitarias con Mockito**: Se han implementado pruebas unitarias utilizando el framework Mockito para garantizar el correcto funcionamiento de las funciones.

## 3. Estructura del Proyecto
- `GuessTheNumberGame`: Clase principal que contiene la lógica del juego.
- `Player`: Interfaz que define el comportamiento esperado de un jugador.
- `HumanPlayer`: Implementación de la interfaz `Player` para el jugador humano.
- `ComputerPlayer`: Implementación de la interfaz `Player` para el jugador computadora.

### Diagrama de Clases

![Diagrama de Clases](https://firebasestorage.googleapis.com/v0/b/laboratoria-945ea.appspot.com/o/class-diagram.png?alt=media)

## 4. Ejecución del Juego
Para ejecutar el juego, simplemente compila y ejecuta el archivo principal `GuessTheNumberGame.java`. El juego proporcionará instrucciones en el terminal para que la jugadora realice suposiciones y recibirá retroalimentación sobre la dirección correcta.
![Juego]()

## 5. Pruebas Unitarias
El proyecto incluye pruebas unitarias para garantizar que las funciones clave del juego funcionen según lo esperado. Se han utilizado Mockito para crear mocks y realizar pruebas controladas.






