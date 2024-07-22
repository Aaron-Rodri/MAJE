/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorialnew;

/**
 *
 * @author DARMA
 */
import java.util.Scanner;
public class FACTORIALNEW {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Ingrese un numero ");
        int number = scanner.nextInt();
        long factorial = 1;
        for(int i = 1; i<= number; i++)
        {factorial *= i;}
        
    
    System.out.print(" El factorial de" +number+ " es " + factorial);
}}
