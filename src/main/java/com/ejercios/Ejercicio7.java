package com.ejercios;

import java.util.Scanner;

//Ejercicio 7

//Solicite la edad de una persona y clasifíquela como:

//Niño
//Adolescente
//Adulto
//Adulto mayor



public class Ejercicio7 {
    
    public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        int Edad = Teclado.nextInt();
        
        if (Edad < 0 ) {
            
            System.out.println("La edad no puede ser negativa.");

        } else if (Edad <= 11) {

            System.out.println("Usted es un niño.");

        } else if (Edad <= 17 ) {

            System.out.println("Usted es un adolescente.");
            
        } else if (Edad <= 59) {

            System.out.println("Usted es un adulto.");
            
        } else  {

            System.out.println("Usted es un adulto mayor. !!Tenga Cuidado¡¡");

        }

        Teclado.close();

    }
    
}
