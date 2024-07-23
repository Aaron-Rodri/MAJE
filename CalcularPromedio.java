/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcularpromedio;

/**
 *
 * @author 52449
 */
import java.util.Scanner;
public class CalcularPromedio {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
   int a;
   int b;
   int c;
   Scanner teclado = new Scanner(System.in);
   System.out.print("Ingresa la primera calificacion");
   a = teclado.nextInt();
   System.out.print("Ingresa la segunda calificacion");
   b = teclado.nextInt();
   System.out.print("Ingresa la tercera calificacion");
   c = teclado.nextInt();
   
   int suma = a + b + c;
   int promedio = suma/3;
   
   System.out.print("El promedio general es:"+ promedio);
   
   
    
    
   }
   
}
