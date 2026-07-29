package com.ejercios;

import java.util.Scanner;

//Ejercicio 6

//Solicite un número e indique si es:

//Positivo
//Negativo
//Cero


public class Ejercicio6 {
    
    public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        double Numero = Teclado.nextDouble();

        if (Numero > 0) {

            System.out.println("El número ingresado es positivo.");
            
        } else if (Numero < 0) {
            
            System.out.println("El número ingresado es negativo.");

        } else  {

            System.out.println("El número ingresado es cero.");

        }

        Teclado.close();

    }
}
