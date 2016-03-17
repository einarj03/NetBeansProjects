/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author einarjonsson
 */
import java.util.Scanner;
import java.text.DecimalFormat;


public class S2E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        
        
        System.out.print("Enter the first number: ");
        num1 = scan.nextInt();
        
        System.out.print("Enter the second number: ");
        num2 = scan.nextInt();
        
        System.out.print("Enter the third number: ");
        num3 = scan.nextInt();
        
        DecimalFormat threeDecPlcFormatter = new DecimalFormat("0.###");
        
        
        double avg = average(num1, num2, num3);
        
        
        System.out.print("The average of " + num1 + ", " + num2 + " and " + num3 + " is " + threeDecPlcFormatter.format(avg) + ".");
      
        
    }
        public static double average (int num1, int num2, int num3) {
            return (num1 + num2 + num3) / 3.0;
        }   
}
