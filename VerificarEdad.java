/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificaredad;

/**
 *
 * @author 52449
 */
import java.util.Scanner;

public class VerificarEdad {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        int a;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresar edad");
        a = teclado.nextInt();
        if (a >=18)
            System.out.print("Eres mayor de edad y puedes votar");
        else
            System.out.print("No eres mayor de edad, no puedes votar");
        
       
    }
}
