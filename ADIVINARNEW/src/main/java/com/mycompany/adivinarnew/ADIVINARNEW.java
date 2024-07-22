/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adivinarnew;

/**
 *
 * @author DARMA
 */
import java.util.*;
public class ADIVINARNEW {

    public static void main(String[] args) {
        int numero = 1;
        int num;
        Scanner teclado= new Scanner(System.in);
        do{
            System.out.print(" Ingresa un numero ");
            num= teclado.nextInt();
        }
               while(num!=numero); 
    }
}
