/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Arrays;

/**
 *
 * @author Codese
 */
public class MergeArrays {

    public static void main(String[] args) {
        int[] B = {1,4,6,2,3,4};
        int[] A = {6,2,5,3,6,8,5,7,3};
        Arrays.sort(A);
        Arrays.sort(B);
        // C = {1,2,3,4,5,6,7,8}
        int lenA = A.length;
        int lenB = B.length;
        int lenC = lenA + lenB;
        int[] C = new int[lenC];

        int indexA = 0;
        int indexB = 0;
        for (int i = 0; i < lenC; i++) {
            // A het, B van con 
            if (indexA == lenA && indexB < lenB) {
                C[i] = B[indexB];
                indexB++;
                continue;
            }
            // B het, A van con
            if (indexB == lenB && indexA < lenA) {
                C[i] = A[indexA];
                indexA++;
                continue;
            }
            // A van con, B van con 
            if (A[indexA] < B[indexB]) {
                C[i] = A[indexA];
                indexA++;
            } else {
                C[i] = B[indexB];
                indexB++;
            }
        }
        for (int i = 0; i < lenC; i++) {
            System.out.print(C[i] + "; ");
        }
    }

}
