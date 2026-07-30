package com.ejercios;

import java.util.Scanner;

// Ejercicio 19
//
// Almacene las notas de 30 estudiantes y determine:
// Nota mayor, nota menor, promedio, aprobados y reprobados.

public class Ejercicio19 {

    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);

        double[] Notas = new double[30];
        double Suma = 0;
        double NotaMayor = 0;
        double NotaMenor = 0;
        int Aprobados = 0;
        int Reprobados = 0;

        for (int i = 0; i < Notas.length; i++) {

            do {
                System.out.println("Ingrese la nota del estudiante " + (i + 1) + " (0 a 5): ");
                Notas[i] = Teclado.nextDouble();

                if (Notas[i] < 0 || Notas[i] > 5) {
                    System.out.println("La nota debe estar entre 0 y 5.");
                }

            } while (Notas[i] < 0 || Notas[i] > 5);

            Suma += Notas[i];

            if (i == 0) {
                NotaMayor = Notas[i];
                NotaMenor = Notas[i];
            }

            if (Notas[i] > NotaMayor) {
                NotaMayor = Notas[i];
            }

            if (Notas[i] < NotaMenor) {
                NotaMenor = Notas[i];
            }

            if (Notas[i] >= 3.0) {
                Aprobados++;
            } else {
                Reprobados++;
            }
        }

        double Promedio = Suma / Notas.length;

        System.out.println("\nResultados:");
        System.out.println("La nota mayor es: " + NotaMayor);
        System.out.println("La nota menor es: " + NotaMenor);
        System.out.println("El promedio es: " + Promedio);
        System.out.println("Cantidad de aprobados: " + Aprobados);
        System.out.println("Cantidad de reprobados: " + Reprobados);

        Teclado.close();
    }
}
