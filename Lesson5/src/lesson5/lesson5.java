/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5;

import java.util.Scanner;

/**
 *
 * @author Codese
 */
public class lesson5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Matrix 1:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        
        System.out.println("Matrix 2:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        int[][] matrix1 = new int[x1][y1];
        int[][] matrix2 = new int[x2][y2];
        
        System.out.println("Matrix 1 ...");
        for (int i = 0; i < x1; i++) {
            for (int j = 0; j < y1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Matrix 2 ...");
        for (int i = 0; i < x2; i++) {
            for (int j = 0; j < y2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < y2; i++) {
            for (int j = 0; j < x2; j++) {
        
            }
        }
        
        
        int[][] matrixMultiple = new int[x1][y2];
        
        for (int i = 0; i < x1; i++) {
            for (int j = 0; j < y2; j++) {
                //
                int[] temp1 = 
                
                
                
            }
        }
        
         
   }
}
