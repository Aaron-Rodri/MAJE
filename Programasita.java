/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programasita;
import java.util.Scanner;
/**
 *
 * @author mashu
 */
public class Programasita {
    
;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cal=0;
        Scanner x = new Scanner(System.in);
        System.out.println("Ingrese la calificacion obtenida");
        cal=x.nextInt();
        if(cal>0 && cal<=59){
            System.out.println("Obtuviste una F");
        } else if( cal>=60 && cal<=69){
            System.out.println("Obtuviste una D");
        }else if( cal>=70 && cal<=79){
            System.out.println("Obtuviste una C");
        }else if( cal>=80 && cal<=89){
            System.out.println("Obtuviste una B");
        }else if( cal>=90 && cal<=100){
            System.out.println("Obtuviste una A");
        } else {
            System.out.println("Calificacion invalida");
        }
        }
        
        
    }
    
