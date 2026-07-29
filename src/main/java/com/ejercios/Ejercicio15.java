package com.ejercios;

import java.util.Scanner;

public class Ejercicio16 {
    
//Ejercicio 15

//Solicitar números hasta que el usuario ingrese cero.

//Mostrar:

//Cantidad de números.
//Suma.
//Promedio.


    public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);
        
        int Suma = 0;
        int Cantidad = 0;
        int Numero = 0;

        System.out.println("Ingresa un número (Ingresa 0 para terminar ciclo.):");
        Numero = Teclado.nextInt();

        while (Numero != 0) {

            Cantidad++;
            Suma += Numero;

            System.out.println("Ingresa otro número (Ingresa 0 para terminar ciclo.):");
            Numero = Teclado.nextInt();
            
        }

        if (Cantidad > 0) {

            double Promedio = (double) Suma / Cantidad;
            
            System.out.println("La cantidad es de: " + Cantidad);
            System.out.println("La suma es de: " + Suma);
            System.out.println("El promedio es de: " + Promedio);

        } else {

            System.out.println("No ingresaste ningún número.");

        }

        Teclado.close();

    }

}
