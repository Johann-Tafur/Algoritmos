package com.ejercios;

import java.util.Scanner;

//Ejercicio 8

//Una tienda realiza un descuento del 10% cuando la compra supera los $200.000.

//Calcule el valor a pagar.

public class Ejercicio8 {
    
    public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del producto: ");
        double ValorProducto = Teclado.nextDouble();

        double Descuento = 0;

        if (ValorProducto > 200000) {

            Descuento = ValorProducto * 0.10;
            
        } else {

            System.out.println("El valor no aplica descuento.");

        }

       

        System.out.println("El valor a pagar es de: " + (ValorProducto - Descuento));
         Teclado.close();
    }
    

}
