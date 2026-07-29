package com.ejercios;

import java.util.Scanner;

public class Ejercicio14 {
    
    //Ejercicio 14

    //Solicitar diez números y calcular:

    //Suma
    //Promedio



    public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);
        int Suma = 0;

        for (int i = 1; i <= 10; i++){

            System.out.println("Ingresa el número " + i + ": ");

            int Numero = Teclado.nextInt();

            Suma += Numero;

        }

        double Promedio = (double) Suma / 10;

        System.out.println("La suma es: " + Suma);
        System.out.println("El promedio es: " + Promedio);

    }

}
