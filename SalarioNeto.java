/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salarioneto;

/**
 *
 * @author 52449
 */
import java.util.Scanner;

public class SalarioNeto {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        float a, b, c, impuesto, salario_neto;
        Scanner teclado = new Scanner (System.in);
        System.out.print("Ingrese el salario bruto mensual");
        a = teclado.nextFloat();
        System.out.print("Ingrese el porcentaje de imuestos");
        b = teclado.nextFloat();
        System.out.print("Ingrese las deducciones adicionales");
        c = teclado.nextFloat();
        impuesto = (b/100)*a;
        salario_neto = a - impuesto - c;
        
        System.out.print("El salario neto mensual es:" + salario_neto);
        
                
        
    }
}
