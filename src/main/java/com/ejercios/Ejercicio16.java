package com.ejercios;

import java.util.Scanner;

public class Ejercicio16 {

    // Almacenar 10 numeros enteros en un arreglo y mostrarlos.
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];

        // Guardar los numeros en el arreglo.
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa el numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        // Recorrer el arreglo para mostrar los numeros guardados.
        System.out.println("\nLos numeros almacenados son:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }

        teclado.close();
    }
}
