/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrados;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Cuadrados {
    public static void main(String[] args) {
         Scanner a = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = a.nextInt();

        if (numero <= 0) {
            System.out.println("El número ingresado no es positivo.");
        } else {
            int c = 1;

            System.out.println("Cuadrados de los números desde 1 hasta " + numero + ":");
            do {
                System.out.println("El cuadrado de " + c + " es: " + (c * c));
                c=c+1;
            } while (c <= numero);
        }

        a.close();
    }
}
    
    

