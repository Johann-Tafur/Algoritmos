package com.ejercios;

import java.util.Scanner;

//Ejercicio 9

//Solicite dos números y determine:

//Mayor
//Menor
//O si son iguales.


public class Ejercicio9 {
    
    public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        double PrimerNumero = Teclado.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        double SegundoNumero = Teclado.nextDouble();

        if (PrimerNumero > SegundoNumero) {

            System.out.println("El primero número (" +  PrimerNumero + ") es mayor al segundo (" + SegundoNumero + ").");
            
        } else if (PrimerNumero < SegundoNumero) {
            
            System.out.println("El segundo número (" +  SegundoNumero + ") es menor al primero (" + PrimerNumero + ").");

        } else if (PrimerNumero == SegundoNumero) {
            
            System.out.println(" Los números: "+ PrimerNumero + " y "+ SegundoNumero + " son iguales.");

        }

        Teclado.close();

    }

}
