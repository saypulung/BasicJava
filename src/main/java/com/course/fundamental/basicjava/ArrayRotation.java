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
public class ArrayRotation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        int nGeser;
        System.out.print("Masukkan nilai geser: ");
        nGeser = new Scanner(System.in).nextInt();
        System.out.print("Array sebelum diputar: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("" + array[i]+ " ");
        }
        
        System.out.println();
        
        for (int i = 0; i < nGeser; i++) {
            int firstEmelent = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstEmelent;
        }
        System.out.print("Array setelah diputar: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("" + array[i]+ " ");
        }
        System.out.println();
    }
    
}
