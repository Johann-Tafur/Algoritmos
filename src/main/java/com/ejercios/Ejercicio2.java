package com.ejercios;

import java.util.Scanner;

//Una tienda vende un producto con IVA del 19%.

//Solicite el valor del producto y calcule:

//Valor antes del IVA 
//Valor del IVA
//Valor total

public class Ejercicio2 {
    
    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);

        System.out.println("Ingrese el valor del producto: ");
        double Producto = Teclado.nextDouble();

        double sinIVA = Producto;
        double IVA = Producto * 0.19;
        double Total = Producto + IVA;

        System.out.println("El valor del prdocuto sin IVA es: " + Producto);
        System.out.println("El valor del IVA del producto es: " + IVA);
        System.out.println("El valor total del producto con IVA es de: "+Total);

        Teclado.close();

    }


}
