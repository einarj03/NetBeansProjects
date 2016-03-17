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

public class S4E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int celsius1, numLines, diff;
                
        System.out.print("Enter the first amount in Celsius: ");
        celsius1 = scan.nextInt();
        
        System.out.print("Enter the number of lines for the table: ");
        numLines = scan.nextInt();
        
        System.out.print("Enter a whole number difference between lines in Celsius: ");
        diff = scan.nextInt();
        
        System.out.println();
        
        System.out.print("\tCELSIUS\t\tFAHRENHEIT\n");
        
        System.out.println();
        
        
        for (int celsiusTemp = celsius1; celsiusTemp <= (celsius1 + ((numLines - 1) * diff)); celsiusTemp += diff) {
            System.out.print("\t  " + celsiusTemp + "\t\t   ");
            System.out.println(celsiusTemp * 9.0 / 5 + 32);
        }
        
    }
    
}
