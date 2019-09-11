/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author Codese
 */
public class BTVNBuoiNghi1 {

    public static void main(String[] args) {
        int[] array = {6, 5, 3, 2, 10};
        boolean tangDan = true;
        boolean giamDan = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                tangDan = false;
            }
            if (array[i] < array[i + 1]) {
                giamDan = false;
            }
        }
        if (tangDan) {
            System.out.println("Mang da duoc sap xep tang dan");
        } else if (giamDan) {
            System.out.println("Mang da duoc sap xep giam dan");
        } else {
            System.out.println("Mang chua dc sap xep");
        }

    }

}
