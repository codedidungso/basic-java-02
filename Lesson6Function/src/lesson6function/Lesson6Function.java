/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6function;

/**
 *
 * @author Codese
 */
public class Lesson6Function {

    public static void main(String[] args) {
        int A = 10;
        int B = 20;
        int tongAB = tong(A, B);
        hienThiSoNguyen(tongAB);
        String output = getClassName();
        System.out.println(output);
        // input N 
        // output arrayN[] = {0,1,2,3,4...,N}
        int N = 7;
        int[] arrayN;
        arrayN = autoGenerator(N);
        int n = 5;
        int m = 7;
        int[][] xoanOc = taoMangXoanOc(n, m);
    }

    static int[][] taoMangXoanOc(int n, int m) {
        int dn = 1;
        int dm = 0;
        int[][] ret = new int[n][m];
        int indexN = 0;
        int indexM = 0;
        for (int i = 0; i < n * m; i++) {
            if (indexN == n) {
                indexN = n-1;
                dn = 0;
                dm = 1;
            }
            if(indexN==-1){
                indexN = 0;
                dn = 0;
            }
            if (indexM == m) {
                dm = 0;
                dn = -1;
            }
            
            ret[indexN][indexM] = i;
            indexN += dn;
            indexM += dm;

        }
        return ret;
    }
//    outputType nameOfFunction(listOfParameters){ // process // return ...}
    // input -> process -> output

    static int tong(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // input -> process
    static void hienThiSoNguyen(int input) {
        System.out.println("So nguyen: " + input);
        return;
    }

    // process -> output
    static String getClassName() {
        String className = "Basic ";
        int thuTu = 2;
        return className + thuTu;
    }

    // only process 
    static void DungChuongTrinh() {
        System.exit(1);
    }

    static int[] autoGenerator(int N) {
        int[] returnArray = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            returnArray[i] = i;
        }
        return returnArray;
    }
}
