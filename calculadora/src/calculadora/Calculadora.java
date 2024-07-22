/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Calculadora {
    public static void main(String[] args) {
      
        
                Scanner a = new Scanner(System.in);
        boolean c = true;

        while (c) {
            System.out.println("Seleccione una operación:");
            System.out.println("1) Sumar");
            System.out.println("2) Restar");
            System.out.println("3) Multiplicar");
            System.out.println("4) Dividir");
            System.out.print("Ingrese el número de la operación deseada: ");
            int o = a.nextInt();

            System.out.print("Ingrese el primer número: ");
            double numero1 = a.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double numero2 = a.nextDouble();
            double resultado = 0;

            switch (o) {
                case 1:
                    resultado = numero1 + numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("NO PUEDES DIVIDIR UN NÚMERO ENTRE 0");
                    }
                    break;
                default:
                    System.out.println("¡No existe esa opción!");
                    break;
            }

            System.out.print("¿Desea realizar otra operación? (s/n): ");
            char respuesta = a.next().toLowerCase().charAt(0);
            if (respuesta != 's') {
                c = false;
            }
        }

        a.close();
    }
    
}
