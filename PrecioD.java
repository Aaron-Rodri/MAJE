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
public class PrecioD {
    public static void main(String[] args) {
        int precio=0;
        double ar=0;
        Scanner x = new Scanner(System.in);
        System.out.println("Ingrese el precio de su articulo");
        precio=x.nextInt();
        if(precio<=100){
            System.out.println("NO se aplica el descuento");
            System.out.println("El precio final del articulo es: "+precio);
        } else if( precio>=101 && precio<=200){
            ar=precio*.90;
            System.out.println("Se aplica un descuento de 10%");
            System.out.println("EL precio final del articulo es: "+ar);
        }else if( precio>=201 && precio<=500){
            ar=precio*.80;
            System.out.println("Se aplica un descuento de 20%");
            System.out.println("EL precio final del articulo es: "+ar);
        }else if( precio>500){
            ar=precio*.75;
            System.out.println("Se aplica un descuento de 25%");
            System.out.println("EL precio final del articulo es: "+ar);
        } else {
            System.out.println("Invalido");
        }
    }
}
