/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conteonew;

/**
 *
 * @author DARMA
 */
import java.util.Scanner;
public class CONTEONEW {

    public static void main(String[] args) {
        
    int num=0, suma=0;
    Scanner leer=new Scanner(System.in);
    do{
        System.out.print(" Introduce un numero ");
        num=leer.nextInt();
        suma=suma+num;
        
    }while(num!=0);
    System.out.print(" La suma de todos los numeros es: "+suma);
    }
}
