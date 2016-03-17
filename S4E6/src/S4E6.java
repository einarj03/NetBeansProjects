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

public class S4E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int startYear, endYear, yearCounter = 0;
        
        System.out.print("Enter start year: ");
        startYear = scan.nextInt();
        
        System.out.print("Enter end year: ");
        endYear = scan.nextInt();
        
        System.out.println();
        System.out.println("Here is a list of leap years between " + startYear + " and " + endYear + ":");
        System.out.println();
        
        for (int year = startYear; year <= endYear; year++) {
            if (year % 100 == 0 && year % 400 != 0) {
                //do nothing
            } else if (year % 4 == 0) {
                System.out.print(year);
                yearCounter++;
                
                
                if (year + 5 > endYear
                        || ((year + 4) % 100 == 0 && (year + 4) % 400 != 0) && year + 8 > endYear) {
                    System.out.print(".");
                } else {
                    System.out.print(", ");
                }
                
                if (yearCounter % 10 == 0) {
                    System.out.println();
                }
                
                
            }
        }
        
        
    }
    
}
