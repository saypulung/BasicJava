/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.course.fundamental.basicjava;

import java.util.Scanner;

/**
 *
 * @author Pulung
 */
public class BasicJava {

    public static void main(String[] args) {
        // Menerima input dari keyboard
        
        int x, y;
        long z;
        float a, b;
        double c;
        
        // menerima input dari bilangan bulat
        System.out.print("Masukkan nilai x: ");
        x = new Scanner(System.in).nextInt();
        
        System.out.print("Masukkan nilai y: ");
        y = new Scanner(System.in).nextInt();
        
        System.out.print("Masukkan nilai z: ");
        z = new Scanner(System.in).nextLong();
        
        // Menerima input bilangan pecahan
        System.out.print("Masukkan nilai a: ");
        a = new Scanner(System.in).nextFloat();
        
        System.out.print("Masukkan nilai b: ");
        b = new Scanner(System.in).nextFloat();
        
        System.out.print("Masukkan nilai c: ");
        c = new Scanner(System.in).nextDouble();
        
        System.out.println("Nilai x = " + x);
        System.out.println("Nilai y = " + y);
        System.out.println("Nilai z = " + z);
        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c);
        
        String nama;
        System.out.print("Masukkan nama anda: ");
        nama = new Scanner(System.in).nextLine();
        System.out.println("Nama yang diinput = " + nama);
        
        System.out.println("Contoh split string");
        
        String kolom = "Nama;Alamat;nilai";
        String[] columns;
        columns = kolom.split(";");
        for (String kol : columns) {
            System.out.println(kol);
        }
        
    }
}
