package com.ejercios;

import java.util.Scanner;

//Ejercicio 17

//Con un arreglo de 15 números determine:

//Mayor
//Menor

public class Ejercicio17 {
    
    public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);

        int[] Numeros = new int[15];

        for (int i = 0; i < Numeros.length; i++){

            System.out.println("Ingresa el número " + (i + 1) + ": ");
            Numeros[i] = Teclado.nextInt();

        }

        int Mayor = Numeros[0];
        int Menor = Numeros[0];

            System.out.println("\nLos números almacenados son: ");

            for (int i = 0; i < Numeros.length; i++){

                if (Numeros[i] > Mayor) {

                    Mayor = Numeros[i];
                    
                }

                if (Numeros[i] < Menor) {

                    Menor = Numeros[i];
                    
                }
                
                System.out.println("El número mayor es: " + Mayor);
                System.out.println("El número menor es: " + Menor);

            }

            Teclado.close();   

    }


}
