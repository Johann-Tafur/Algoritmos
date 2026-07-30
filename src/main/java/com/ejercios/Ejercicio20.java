package com.ejercios;

import java.util.Scanner;

// Ejercicio 20
//
// Buscar un número dentro de un arreglo de 25 posiciones.
// Mostrar si existe y en qué posición se encuentra.

public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);

        int[] Numeros = new int[25];

        for (int i = 0; i < Numeros.length; i++) {
            System.out.println("Ingrese el número de la posición " + (i + 1) + ": ");
            Numeros[i] = Teclado.nextInt();
        }

        System.out.println("Ingrese el número que desea buscar: ");
        int NumeroBuscado = Teclado.nextInt();

        boolean Existe = false;

        for (int i = 0; i < Numeros.length; i++) {

            if (Numeros[i] == NumeroBuscado) {
                Existe = true;
                System.out.println("El número existe en la posición " + (i + 1) + ".");
            }
        }

        if (!Existe) {
            System.out.println("El número no existe en el arreglo.");
        }

        Teclado.close();
    }
}
