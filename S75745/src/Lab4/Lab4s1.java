/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lab4s1 {
public class Activity1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter first integer:");
        int num1=sc.nextInt();
        System.out.println("Enter second integer:");
        int num2=sc.nextInt();
         
        int square1=num1*num1;
        int square2=num2*num2;
        int sumsquare=square1+square2;
        int diffsquare=square1-square2;
        
        System.out.println("The square of " +num1+ " is " +square1);
        System.out.println("The square of "+num2+" is "+ square2);
        System.out.println("The sum of  the square is  "+ sumsquare);
        System.out.println("The differences of the square is "+ diffsquare);
    }
    
}
    
}
