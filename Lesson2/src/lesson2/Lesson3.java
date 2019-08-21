/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

import java.util.Scanner;
import jdk.nashorn.internal.parser.Lexer;

/**
 *
 * @author Codese
 */
public class Lesson3 {

    public static void main(String[] args) {
        int doDai = 10; // == a.length
        int[] a = new int[doDai];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < doDai; i++) {
            System.out.print("Nhap vao phan tu thu " + i + ": ");
            a[i] = sc.nextInt();

        }

        for (int index = 0; index < doDai; index++) {
            System.out.print(a[index] + " ");
        }
        System.out.println();

        System.out.println("Nhap phan tu tim kiem: ");
        int key = sc.nextInt();
        System.out.println("Tim thay tai: ");

        int soluongtimthay = 0;
        for (int i = 0; i <= doDai; i++) {
            if (a[i] == key) {
                System.out.println("TIm thay tai " + i);
                soluongtimthay = soluongtimthay + 1;
            }
        }
        // flag 

        if (soluongtimthay == 0) {
            System.out.println("Khong tim thay!");
        } else {
            System.out.println("Tim thay " + soluongtimthay + " ket qua");
        }// flag 
//        int[] data = new int[doDai];
//        int count = 0;
//        for (int i = 0; i < 10; i++) {
//            data[i] = -1;
//        }
//        for (int i = 0; i < doDai; i++) {
//            if (a[i] == key) {
//                data[count] = i;
//                count++;
//            }
//        }

//        System.out.println("Tim thay " + key + "o vi tri: ");
//        for (int i = 0; i < doDai; i++) {
//            if (i < doDai - 1) {
//                if (data[i + 1] == -1) {
//                    System.out.print("a[" + data[i] + "]");
//                    break;
//                } else  {
//                    System.out.print("a[" + data[i] + "],");
//                }
//            }
//        }
        // 1 2 3 2 3 1 2 3 4 3
        // 1 3 6 
    }
}
