 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.indicecorporal;

/**
 *
 * @author 52449
 */
import java.util.Scanner;
public class IndiceCorporal {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
    double a, b, imc=0;
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingresa tu peso (kilogramos) ");
    a = teclado.nextDouble();
    System.out.print("Ingresa tu estatura (metros)");
    b = teclado.nextDouble();
    imc= a/(b*b);
    
    
    System.out.println("Tu indice de masa corporal es:" + imc);
    
    }
    
}
