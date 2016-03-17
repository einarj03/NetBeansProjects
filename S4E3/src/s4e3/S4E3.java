/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s4e3;

/**
 *
 * @author einarjonsson
 */
import java.util.Scanner;

public class S4E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int celsius1, celsius2;
                
        System.out.print("Enter the first amount in Celsius: ");
        celsius1 = scan.nextInt();
        
        System.out.print("Enter the second amount in Celsius: ");
        celsius2 = scan.nextInt();
        
        System.out.println();
        
        System.out.print("\tCELSIUS\t\tFAHRENHEIT\n");
        
        System.out.println();
        
        for (int celsiusTemp = celsius1; celsiusTemp <= celsius2; celsiusTemp++) {
            System.out.print("\t  " + celsiusTemp + "\t\t   ");
            System.out.println(celsiusTemp * 9.0 / 5 + 32);
        }
        
        
    }
    
}
