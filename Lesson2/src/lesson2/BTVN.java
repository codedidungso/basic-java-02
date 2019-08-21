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
public class BTVN {

    public static void main(String[] args) {
        //Nhập giá trị
        System.out.println("Nhap so :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Kiểm tra từ 1 -> số nhập vào ( num ) xem số nào là số nguyên tố
        // giá trị kiểm tra chính là biến i 
        for (int i = 1; i < num; i++) {
            System.out.println("Kiểm tra giá trị i = " + i);
            // kiểm tra xem i có phải là SNT hay ko ?
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    System.out.println(i + " chia hết cho " + j + ", đếm được " + count + " ước");
                    count++;
                } else {
                    System.out.println(i + " không chia hết cho " + j);
                }
            }
            //
            System.out.println("Số i = " + i + "có tất cả : " + count + " ước"
            );
            if (count == 2) {
                System.out.print(i + " là một SNT ");
            } else {
                System.out.println(i + " Không phải số nguyên tố ");
            }
            System.out.println("---------------------");
        }

    }
}
