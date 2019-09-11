/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Codese
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrix;
//        int matrixB[][];
        Scanner sc = new Scanner(System.in);

        //nhap kich thuoc mang hai chieu (matrixA)
        int N = sc.nextInt();

        // nhap mang hai chieu 
        matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("Nhap phan tu tai hang " + i + " cot " + j + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // in ra ma tran vua nhap 
        int sum = 0;
        int tongchiahet3 = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("");
            for (int j = 0; j < N; j++) {
                // in ra tung phan tu 
                System.out.print(matrix[i][j] + ", ");
                sum = sum + matrix[i][j];
                if (matrix[i][j] % 3 == 0) {
                    tongchiahet3 = tongchiahet3 + matrix[i][j];
                }

            }
        }

        System.out.println("Tong cac phan tu: " + sum);
        System.out.println("Tong cac phan tu chia het cho 3: " + tongchiahet3);

        // chuyen vi cua ma tran 
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N; i++) {
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println("");
        }
        
        int D = 0;
        if (N == 1) {
            D = matrix[0][0];
        } else if (N == 2) {
            D = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else {
            D = 0;
            for (int c=  0; c < matrix.length; c++) {
                int tich = 1;
                for (int h = 0; h < matrix.length; h++) {
                    tich = tich * matrix[(c + h) % N][h];
                }
                D += tich; 
                tich = 1;
                for (int h = 0; h < matrix.length; h++) {
                    tich = tich * matrix[(c - h + N) % N][h];
                }
                D -= tich;
            }
        }
        System.out.println("\nDinh thuc: " + D);
    }

}
