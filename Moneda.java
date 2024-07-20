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
public class Moneda {
     public static void main(String[] args) {
        int num=0;
        double mx, un, dos, tr, cu, ci, se, si, oc, nu, di ;
        Scanner x = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de pesos mexicanos a convertir");
        mx=x.nextInt();
        System.out.println("Ingrese la moneda");
        System.out.println("1. Dolar USD");
        System.out.println("2. Euro EUR");
        System.out.println("3. Bath THB ");
        System.out.println("4. Yen JPY ");
        System.out.println("5. Won KRW");
        System.out.println("6. Dolar Australiano AUD ");
        System.out.println("7. Sol PEN");
        System.out.println("8. Dolar Canadiense CAD");
        System.out.println("9. Bolivar ves ");
        System.out.println("10. Peso Argentino ARS ");
        num=x.nextInt();
        switch(num){
            case 1:
                un=mx*.055;
                System.out.println("En dolares son: "+un);
                break;
            case 2:
                dos=mx*.051;
                System.out.println("En euros son: "+dos);
                break;
            case 3:
                tr=mx*2.01;
                System.out.println("En baths son: "+tr);
                break;
            case 4:
                cu=mx*8.72;
                System.out.println("En yenes son: "+cu);
                break;
            case 5:
                ci=mx*76.94;
                System.out.println("En wones son: "+ci);
                break;
            case 6:
                se=mx*.083;
                System.out.println("En dolares australianos son: "+se);
                break;
            case 7:
                si=mx*.21;
                System.out.println("En soles son: "+si);
                break;
            case 8:
                oc=mx*.076;
                System.out.println("En dolares canadienses son: "+oc);
                break;
            case 9:
                nu=mx*2.029;
                System.out.println("En bolivares son: "+nu);
                break;
            case 10:
                di=mx/.0011;
                System.out.println("En dolares argenitnos son: "+di);
                break;
                default: System.out.println("Invalido ");
                    break;
        }
    }
}
