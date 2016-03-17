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

public class S2E3 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        double num1, num2, sum, diff, product;
      
        
        System.out.print("Enter the first number: ");
        num1 = scan.nextDouble();
        
        System.out.print("Enter the second number: ");
        num2 = scan.nextDouble();
        
        sum = num1 + num2;
        diff = num1 - num2;
        product = num1 * num2;
        
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + diff);
        System.out.println(num1 + " * " + num2 + " = " + product);
        
    }
    
}
