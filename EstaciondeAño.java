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
public class EstaciondeAño {
    public static void main(String[] args) {
        int num=0;
        Scanner x = new Scanner(System.in);
        System.out.println("Ingrese el mes del año ");
        System.out.println("1. Enero");
        System.out.println("2. Febrero ");
        System.out.println("3. Marzo ");
        System.out.println("4. Abril ");
        System.out.println("5. Mayo");
        System.out.println("6. Junio ");
        System.out.println("7. Julio");
        System.out.println("8. Agosto");
        System.out.println("9. Septiembre ");
        System.out.println("10. Octubre ");
        System.out.println("11. Noviembre");
        System.out.println("12. Diciembre");
        num=x.nextInt();
        switch(num){
            case 1:
                System.out.println("La estacion de este mes es Invierno");
                break;
            case 2:
                System.out.println("La estacion de este mes es Invierno");
                break;
            case 3:
                System.out.println("La estacion de este mes es Primavera ");
                break;
            case 4:
                System.out.println("La estacion de este mes es Primavera");
                break;
            case 5:
                System.out.println("La estacion de este mes es Primavera");
                break;
            case 6:
                System.out.println("La estacion de este mes es Verano");
                break;
            case 7:
                System.out.println("La estacion de este mes es Verano");
                break;
            case 8:
                System.out.println("La estacion de este mes es Verano");
                break;
            case 9:
                System.out.println("La estacion de este mes es Otoño");
                break;
            case 10:
                System.out.println("La estacion de este mes es Otoño");
                break;
            case 11:
                System.out.println("La estacion de este mes es Otoño");
                break;
            case 12:
                System.out.println("La estacion de este mes es Invierno");
                break;
                default: System.out.println("Invalido ");
                    break;
        }
    }
}
