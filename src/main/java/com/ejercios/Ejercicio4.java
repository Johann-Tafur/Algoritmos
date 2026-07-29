package com.ejercios;

import java.util.Scanner;

//Ejercicio 4

//Solicite:

//Horas trabajadas
//Valor por hora

//Calcule:

//Salario bruto
//Descuento salud (4%)
//Descuento pensión (4%)
//Salario neto


public class Ejercicio4 {
    
    public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas: ");
        double Horas = Teclado.nextDouble();

        System.out.println("Ingrese el valor por hora trabajada: ");
        double ValorHora = Teclado.nextDouble();

        double SalarioBruto = Horas * ValorHora;
        double DstoSalud = SalarioBruto * 0.04;
        double DstoPension = SalarioBruto * 0.04;
        double SalarioNeto = SalarioBruto - DstoSalud - DstoPension;

        System.out.println("El salario bruto es de: " + SalarioBruto);
        System.out.println("El descuento de salud es de: " + DstoSalud);
        System.out.println("El descuento de pensión es de: " + DstoPension);
        System.out.println("El salario neto es: "+SalarioNeto);

        Teclado.close();

    }

}
