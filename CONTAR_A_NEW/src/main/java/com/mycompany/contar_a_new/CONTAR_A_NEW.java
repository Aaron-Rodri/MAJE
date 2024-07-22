/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contar_a_new;

/**
 *
 * @author DARMA
 */
import java.util.Scanner;
public class CONTAR_A_NEW {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Ingresa una palabra ");
        String word = scanner.nextLine();
        int count = 0;
        for(int i = 0; i< word.length();i++){
            if (word.charAt(i) == 'a'&& word.charAt(i) == 'A'){
                count++;
            }
        }
      System.out.print(" La letra 'a'aparece" + count + " veces en la palabra");
    }
}
