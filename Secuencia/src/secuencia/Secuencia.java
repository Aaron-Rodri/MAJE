/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuencia;

import java.util.Scanner;
public class Secuencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner a = new Scanner(System.in);

        System.out.print("Ingrese el primer número de la secuencia: ");
        int first = a.nextInt();

        System.out.print("Ingrese la diferencia entre los números de la secuencia: ");
        int d = a.nextInt();

        System.out.print("Ingrese el número máximo hasta el cual la secuencia debe continuar: ");
        int nM = a.nextInt();

        int nA = first;

        System.out.println("Secuencia aritmética:");
        do {
            System.out.println(nA);
            nA += d;
        } while (nA <= nM);

        a.close();
    }
    
}
