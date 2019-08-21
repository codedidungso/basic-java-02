/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

import java.util.Scanner;

/**
 *
 * @author Codese
 */
public class BTVN2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("So thu 1: ");
        int X = sc.nextInt();
        System.out.println("So thu 2: ");
        int Y = sc.nextInt();

        int y1, y2, y3, result;
        // Y = 123
        y1 = Y % 10;            // y1 = 123%10 = 3
        y2 = (Y % 100) / 10;      // y2 = 123%100 = 23 , 23/10 = 2
        y3 = Y / 100;             // y3 = 123/100 = 1
        System.out.println("----------");
        System.out.println("   " + X);
        System.out.println("x");
        System.out.println("   " + Y);
        System.out.println("------");
        System.out.println("   " + (X * y1));
        System.out.println("  " + (X * y2));
        System.out.println(" " + (X * y3));
        System.out.println("------");
        System.out.println(" " + X * Y);
        
        
    }

}
