package com.ejercios;

import java.util.Scanner;

//Ejercicio 5

//Solicite la temperatura en grados Celsius y conviértala a grados Fahrenheit y Kelvin.


public class Ejercicio5 {
    
    public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados Celius: ");
            double gc = Teclado.nextInt();
            
            double Fahrenheit = (gc * 9/5)+32;
            
            System.out.println(gc + " °C equivalen a "
                + Fahrenheit + " °F");

        Teclado.close();

    }
}
