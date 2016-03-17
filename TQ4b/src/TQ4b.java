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

public class TQ4b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        int userInput;
        int[] myArray = new int[10];
        
        
        for (int index = 0; index < myArray.length; index++)
        {
            System.out.print("Enter an integer: ");
            userInput = scan.nextInt();
            myArray[index] = userInput;
        }
        
        
        
        
        
    }
    
}
