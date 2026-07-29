package com.ejercios;

import java.util.Scanner;

//Ejercicio 10

//Solicite un año y determine si es bisiesto.

public class Ejercicio10 {
    
    public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el año: ");
        int Año = Teclado.nextInt();

        if (Año % 400 == 0 || (Año % 4 ==0 && Año % 100 != 0)) {
            System.out.println("Es un año bisiesto.");
        } else {

            System.out.println("No es un año bisiesto.");

        }

        Teclado.close();

    }

}
