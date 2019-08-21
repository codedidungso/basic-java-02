/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

/**
 *
 * @author Codese
 */
public class test {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 1 ;
        a[1] = 5 ;
        a[2] = 6 ;
        a[3] = 4 ;
        a[4] = 2 ;
        // 123 = 3*1 + 2*10 + 1*100
        int finalNum = 0;
        int multi = 1;
        for (int i = a.length-1; i >= 0; i--) {
            finalNum += a[i] * multi;
            multi = multi *10;
        }
        System.out.println(finalNum);
    }
}
