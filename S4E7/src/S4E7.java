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

public class S4E7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        int height;
        
        System.out.print("Enter the number of lines in the triangle: ");
        height = scan.nextInt();
        
        for (int lineCount = height; lineCount >= 1; lineCount--) {
            for (int starCount = lineCount; starCount >= 1; starCount--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
