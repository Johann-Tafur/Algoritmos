package com.ejercios;


import java.util.Scanner;

//Ejercicio 1

//Diseñe un programa que solicite la base y la altura de un rectángulo y calcule:

//Área
//Perímetro

public class Main {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        System.out.println("Ingrese el valor de la base del rectangulo: ");
        double Base = Teclado.nextDouble();

        System.out.println("Ingrese el valor de la altura del rectangulo: ");
        double Altura = Teclado.nextDouble();

        double area = Base * Altura;
        double perimetro = 2 * (Base + Altura);

        System.out.println("El area del rectángulo es: " + area);
        System.out.println("El perimetro del rectángulo es: " + perimetro);

        Teclado.close();
 
    }
}