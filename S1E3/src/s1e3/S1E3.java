/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s1e3;

/**
 *
 * @author einarjonsson
 */

import java.util.Scanner;

public class S1E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int number;
        
        System.out.print("Enter a value for 'number': ");
        number = scan.nextInt();
        
        int twice_number = number * 2;
        
        System.out.println("The value of 'number' is " + number + ".");
        System.out.println("The value of 'twice_number' is " + twice_number + ".");
    }
    
}
