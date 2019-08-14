/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

import java.util.Scanner;

/**
 *
 * @author thiennd
 */
public class Lesson1 {
    public static void main(String[] args) {
        // Variables 
        // Declare  
        int bin = 0b10; // = 3 binary 
        int hex = 0xabcdef; // hexa
        // int oct = 082312;
        char c = 'a'; // 'c'
        double d = 3.4; // 
        float f = 4.56f;
        boolean t = true;
        String s = "thien";
        /*
        asdfasdf
        sadfasdf
        */ 
//        System.out.print("Hello world!"); // print to console 
        //cout << "Hello world"; printf("Hello wordld")
        // Giai pt bac nhat ax + b = 0;
        
        
        int b = 3;
        float x;
        
        // + - * / %
        // / %
        // int/float => float
        // int/int => chia lay phan nguyen 
        // 
        int sodu = 7%3;
        System.out.println(sodu);
        
        Scanner sc = new Scanner(System.in);
        int a;
        String input;
        //System.out.println("Nhap vao : ");
       // a = sc.nextInt(); // nhap vao so nguyen
       //input = sc.nextLine();
        //System.out.println("Gia tri a vua nhap vao la: " + input); // sout - 
        // ax + b = 0;
        
        float q = 3; // 10
        int p = 5; // 100
        String w = "thang";
        String o = "OOP";
        System.out.printf("p = %d \nq = %f\n",p,q); // %d decimal int, %s string, %c character, %f float 
        
        // wifi: CoStudying 2Ghz / 5Ghz 
        // pass: csam5000
        double aa,bb,cc;
        double result;
        System.out.println("Nhap vao a: ");
        aa = sc.nextDouble();
        System.out.println("Nhap vao b: ");
        bb = sc.nextDouble();
        System.out.println("Nhap vao c: ");
        cc = sc.nextDouble();
        
        result = (cc-bb)/aa;
        System.out.println("Ket qua la: "+result);
        
    }
    
}
