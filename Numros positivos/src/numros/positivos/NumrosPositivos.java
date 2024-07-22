/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numros.positivos;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class NumrosPositivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        double s = 0;
        int c = 0;
        
        while (true) {
            System.out.print("Ingrese un número positivo: ");
            double numero = a.nextDouble();
            
            if (numero < 0) {
                break;
            }
            
            s=s+ numero;
            c=c+1;
        }
        
        if (c > 0) {
            double m = s / c;
            System.out.println("La media de los números positivos ingresados es: " + m);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }
        
        a.close();
    }
        
    }
    

