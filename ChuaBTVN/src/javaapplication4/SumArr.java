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
public class SumArr {

    static int Sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static boolean check(int x) {
        boolean result = false;
        if (x % 2 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    static char[] sort(char[] y) {
        for (int i = 0; i < y.length; i++) {
            for (int j = i; j < y.length - 1; j++) {
                if (y[j] > y[j + 1]) {
                    char temp;
                    temp = y[j];
                    y[j] = y[j + 1];
                    y[j + 1] = temp;
                } //ASCII
            }
        }
        return y;
    }

}
