/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vocales;

import java.util.Scanner;

public class Vocales {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        String L;
        
        while (true) {
            System.out.println("Ingrese una letra. Si desea salir, ingrese un espacio");
            L = a.next(); // Lee la entrada del usuario
            
            if (L.length() != 1) {
                System.out.println("Ingrese solo un caracter.");
                continue;
            }
            
            //char ch = L.charAt(0); // Obtiene el primer caracter ingresado
            
            if (L.length()==1 && L.charAt(0)==' '){
                System.out.println("Programa terminado");
                System.exit(0);
            } else {
            }
            
                if (L.equals("a")||L.equals("e")|| L.equals("i") || L.equals("o") || L.equals("u")) {
                    System.out.println(L + " es una vocal");
                } else {
                    System.out.println(L + " es una consonante");
                }
           
        }
    }
    
    
}
