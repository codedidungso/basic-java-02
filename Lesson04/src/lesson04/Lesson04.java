/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson04;

import java.util.Arrays;

/**
 *
 * @author Codese
 */
public class Lesson04 {

    public static void main(String[] args) {
        // Luu do thuat toan 
        int[] arrayNew = {9, 7, 3, 3, 4}; // arrayNew[3] = 3
        int[] array = new int[5]; // {0,0,0,0,0}
        // Ox 
        int[][] array2D = new int[5][5];
        int[][] array2DNew = {
            {6, 1, 4, 1, 7},
            {1, 2, 3, 2},
            {0, 5, 3},
            {5},
            {},
            {6, 7, 0, 4, 6, 9},
            {6, 7, 0, 6, 9}
        };
        // array2D[3] = {5,4,4,5,1}
        // array2D[3][4] = 1
        // Oxy

        for (int i = 0; i < array2DNew.length; i++) {
            // in ra phan tu cua mang i
            System.out.print("[");
            for (int j = 0; j < array2DNew[i].length; j++) {

                System.out.print(array2DNew[i][j] + " ");
            }
            System.out.println("]");
            System.out.println(Arrays.toString(array2DNew[i]));
            //

            System.out.println("Do dai cua phan tu " + i + " la: " + array2DNew[i].length);
            for (int j = 0; j < array2DNew[i].length; j++) {
                System.out.println("Array2DNew[" + i + "][" + j + "]: " + array2DNew[i][j]);
            }
        }
        for (int i = 0; i < array2DNew.length; i++) {
            System.out.println("Vong lap thu " + i);
            for (int j = 0; j < array2DNew[i].length; j++) {
                System.out.println("array2DNew[" + i + "][" + j + "]: " + array2DNew[i][j]);
            }
        }
//        }
//        System.out.println("=====");
//        int[][] temp = new int[5][5];// 
//        for (int i = 0; i < 5; i++) {
//            if(i==3) temp[i] = new int[3];
//            for (int j = 0; j < 5; j++) {
//                System.out.println(temp[i][j]);
//            }
//        }

        int[][] arr = new int[3][5];
        System.out.println("ARR: " + arr.length);
        System.out.println("ARR[i]: " + arr[2].length);
        System.out.println("ARR[i][j]: " + arr[2][3]);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //System.out.print((j==0?"[":"")+arr[i][j]+(j==arr[i].length-1?"]":","));
                System.out.print(arr[i][j]+", ");
            }
            System.out.println("");
        }
    }

}
