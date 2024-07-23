/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoracalificaciones;

/**
 *
 * @author 52449
 */
import java.util.Scanner;


public class CalculadoraCalificaciones {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
       
        
        float a, b, c, nota_final;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresar la calificacion de parciales (0 a 100):");
        a = teclado.nextFloat();
        System.out.print("Ingrese la calificacion de proyectos (0 a 100):");
        b = teclado.nextFloat();
        System.out.print("Ingrese la calificacion del examen (0 a 100):");
        c = teclado.nextFloat();
       
        nota_final = (float) (a * 0.4 + b * 0.3 + c * 0.3);
        System.out.print("La nota final es:" + nota_final);
        
    }
}
