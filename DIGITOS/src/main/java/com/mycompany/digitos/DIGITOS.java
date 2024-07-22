/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.digitos;

/**
 *
 * @author DARMA
 */
 import java.util.Scanner;
public class DIGITOS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Ingresa un numero entero: ");
        int number = scanner.nextInt();
        number = Math.abs(number);
        int digitCount = Integer.toString(number).length();
        System.out.print(" El numero" + number + " tiene " + digitCount + " digitos");
    }
}
