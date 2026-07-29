package com.ejercios;

import java.util.Scanner;

//Ejercicio 3

//Un estudiante obtiene las siguientes notas:

//Parcial 1 (30%)
//Parcial 2 (30%)
//Proyecto Final (40%)

//Calcule la nota definitiva.

public class Ejercicio3 {
    
    public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);

        System.out.println("Ingrese las notas del estudiante: ");
        double Parcial1 = Teclado.nextDouble();
        double Parcial2 = Teclado.nextDouble();
        double ProyectoFinal = Teclado.nextDouble();

        double NotaFinal = (Parcial1 * 0.30) + (Parcial2 * 0.30) + (ProyectoFinal * 0.40);

        System.out.println("La nota definitiva del estudiante es: " + NotaFinal);

        Teclado.close();
    }
}
