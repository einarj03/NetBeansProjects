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

public class S3E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int years, bonus = 50;
        
        System.out.print("How many years have you been with the company? ");
        years = scan.nextInt();
        
        if (years >= 20) {
            bonus += 100;
        } else if (years >= 10) {
            bonus += 50;
        }
        
        System.out.print("You will recieve a Christmas bonus of " + bonus + " pounds.");
        
        
    }
    
}
