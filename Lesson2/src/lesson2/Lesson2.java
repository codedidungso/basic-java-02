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
public class Lesson2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean TF = true;
        if (2 >= 2) { // x = -b/(2*a)
            // Toan tu so sanh: int float char byte long ... 
            // > < >= <= ==  != (equals) ?:
            System.out.println("Condition is TRUE");
        } else {
            System.out.println("Condition is FALSE");
        }
        // ax + b =0
        // x = -b/a\
//        float a = 9, b = 10;
//        if (a == 0) {
//            System.out.println("Phuong trinh vo nghiem.");
//        } else {
//            System.out.println("Nghiem la: " + (-b / a));
//        }

        // ax^2 + bx + c = 0
        // a == 0 => giai pt bx + c = 0
        // a != 0 => 
        //             delta = b*b-4*a*c
        //                  delta == 0 => nghiem kep 
        //                  delta < 0 => vo nghiem  
        //                  delta > 0 => co hai nghiem  
        float a = 1;
        float b = 3;
        float c = 2;
        if (a == 0) { // giai pt bx+ c = 0;
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem.");
                }
            } else {
                System.out.println("Nghiem la: " + (-c / b));
            }
        } else { // else a!=0
            float delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem.");
            }
            if (delta == 0) {
                System.out.println("Nghien kep: " + (-b / 2 / a));
            }
            if (delta > 0) {
                System.out.println("Co nghiem: ");
                float x1 = (float) ((-b - Math.sqrt(delta)) / 2 / a);
                float x2 = (float) ((-b + Math.sqrt(delta)) / 2 / a);
                System.out.println("x1= " + x1);
                System.out.println("x2= " + x2);
            }
        }
        if (a > 0 && b > 0) {
            System.out.println("A va B lon hon 0");
        }
        if (a > 0 || b > 0) {
            System.out.println("A hoac B lon hon 0");
        }

        int n = -3;
        String chuoi;
        chuoi = (n > 0) ? ("N lon hon 0") : ("N nho hon 0");
        System.out.println(chuoi);
        int aa = 3;
        int bb = 2;
        System.out.println(aa > bb ? (aa + ">`" + bb) : (aa + "<" + bb));
        // k = ( (condition) ? (true value) : (false value) );
        // alt shift F format code 

        System.out.println("FOR LOOPS");
        for (int i = 0; Math.sqrt(i) < 3; i = i + 2) {
            System.out.println(i);
            System.out.println("Codese");

        }

        int i = 0;

        for (; i < 10; i++) {

        }
        for (;;) {
            System.out.println("Gia tri cua i: " + i);
            i++;
            if (i > 15) {
                break;// for, while, do-while, switch-case 
            }
        }
        int condition = 0;
        int condition2 = 0;
//        while (true) {
//            System.out.print("ok ");
//            condition = new Scanner(System.in).nextInt();
//            condition2 = new Scanner(System.in).nextInt();
//            //....//
//            if(condition>1) break;
//        }

        // Input: 1 so tu nhien n bat ki`
        // Output: moi so chan nho hon so tu nhien do 
//        System.out.println("Input:");
//        int i = new Scanner(System.in).nextInt();
        for (int j = 0; j < 10; j++) {
            if (j == 3 || j == 7) {
                continue;
            }
            System.out.println("J= " + j);
        }

        System.out.println("Nhap vao so :");
        int z = new Scanner(System.in).nextInt();
        System.out.println("So chan la: ");
        // 9
        for (int j = 1; j < z; j++) {

            if (j % 2 == 0) {
                System.out.println(j);
            }
        }
        //Ti`m tat ca? cac uoc cua 1 so :D
        // input 1 so tu nhien vd : nhap vao 12
        // output:  1 2 3 4 6 12
        
    }
}
