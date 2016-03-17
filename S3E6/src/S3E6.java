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

public class S3E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int year;
        boolean leapYear = false;
        
        System.out.print("Enter a year: ");
        year = scan.nextInt();
        
        if (year % 100 == 0 && year % 400 != 0) {
            leapYear = false;
        } else if (year % 4 == 0) {
            leapYear = true;
        }
            
        System.out.print("The year " + year + " is ");
        System.out.print(leapYear ? "a leap year." : "not a leap year.");
        
        
    }
    
}
