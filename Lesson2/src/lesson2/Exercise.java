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
public class Exercise {

    public static void main(String[] args) {
//        System.out.println("Input : ");
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        System.out.println("Output : ");
//        for (int j = 1; j < i; j++) {
//            if (j % 2 == 0) {
//                System.out.print(j + " ");
//            }
//        }

        //Ti`m uoc
        System.out.println("Nhap vao so :");
        int i = new Scanner(System.in).nextInt();
        System.out.println("Uoc la: ");
        int count = 0;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {

                System.out.print(j + " ");
                count++;
            }
        }
        if (count == 2) {
            System.out.println("La so nguyen to");
        } else {
            System.out.println("Khong phai so nguyen to");
        }

    }
}
