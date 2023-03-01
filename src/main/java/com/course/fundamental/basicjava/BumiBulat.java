/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.course.fundamental.basicjava;

import java.util.Scanner;

/**
 *
 * @author Pulung
 */
public class BumiBulat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String teks;
        System.out.print("Input angka: ");
        teks = new Scanner(System.in).nextLine();
        
        int bumiBulat = 0;
        
        for (int i = 0; i < teks.length(); i++) {
            switch(teks.charAt(i)) {
                case '0':
                case '6':
                case '9':
                    bumiBulat++;
                    break;
                case '8':
                    bumiBulat += 2;
                    break;
            }
        }
        System.out.println("Bumi bulat : " + bumiBulat);
    }
    
}
