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
public class BTVNBuoiNghi2 {

    public static void main(String[] args) {
        int[] array = {6546, 1351, 32131, 86445, 3213, 65854321};
        // Cach 1 - recommend 
        for (int i = 0; i < array.length; i++) {
            int phanTuHienTai = array[i];
            while (phanTuHienTai >= 10) {
                phanTuHienTai = phanTuHienTai / 10;
            }
            System.out.println(phanTuHienTai);
            if (phanTuHienTai % 2 == 1) {
                System.out.println("Phan tu dau tien co chu so bat dau la so le: " + array[i]);
                break;
//                System.exit(-3);
            }
        }
        
        // Cach 2
        for (int i = 0; i < array.length; i++) {
            // String = array of character in ASCII
            int a = 123;
            String s = String.valueOf(array[i]);// bien array[i] thanh string 
            char firstChar = s.charAt(0);
//            if(firstChar == '1' || firstChar == '3' .... )
            int value = firstChar - '0'; // Integer.valueOf(firstChar);
            if (value % 2 == 1) {
                System.out.println("Phan tu dau tien co chu so bat dau la so le: " + array[i]);
            }
        }
        // end of programm = System.exit(0);
    }
}
