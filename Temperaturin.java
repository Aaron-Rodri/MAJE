/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programasita;
import java.util.Scanner;
/**
 *
 * @author mashu
 */
public class Temperaturin {
     public static void main(String[] args) {
        int num=0;
        double c, f, k;
        Scanner x = new Scanner(System.in);
        System.out.println("Ingrese la temperatura a convertir (Celsius) ");
        c=x.nextDouble();
        System.out.println("Ingrese a que temperatura se convertira");
        System.out.println("1. Kelvin");
        System.out.println("2. Fahrenheit ");
        num=x.nextInt();
        switch(num){
            case 1:
                f=c+32;
                System.out.println(c+" grados celsius es equivalente a "+f+" fahrenheit");
                break;
            case 2:
                k=c+273.15;
                System.out.println(c+" grados celsius es equivalente a "+k+" kelvin");
                break;
            default: 
                System.out.println("Invalido ");
                    break;
        }
    }
}
