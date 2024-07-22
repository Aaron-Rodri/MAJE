/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeros.pares;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class NumerosPares {
    public static void main(String[] args) {
       Scanner a = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int n = a.nextInt();

        if (n <= 0) {
            System.out.println("El número ingresado no es positivo.");
        } else {
            int c=1;

            System.out.println("Números impares desde 1 hasta " + n + ":");
            do {
                if (c % 2 != 0) {
                    System.out.println(c);
                }
                c++;
            } while (c <= n);
        }

        a.close();
    }
    
    
}
