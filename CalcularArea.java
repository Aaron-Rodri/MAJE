/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2;

/**
 *
 * @author 52449
 */
import java.util.Scanner;
public class CalcularArea {

    public static void main(String[] args) {
       int base;
       int altura;
      
       
       Scanner a  = new Scanner(System.in);
       System.out.print("Ingresa la longitud de la base");
       base = a.nextInt();
       System.out.print("Ingresa la longitud de la altura");
       altura = a.nextInt();
       
        int area = base * altura;
      
       System.out.print("El area del rectangulo es:" + area);
       
       
       
       
       
      
       
     
    }
}
