
import java.util.Scanner;

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

public class S4E8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        int height;
        
        System.out.print("Enter the number of lines in the pyramid: ");
        height = scan.nextInt();
        
        for (int lineCount = 1; lineCount <= height; lineCount++) {
            for (int spaceCount = height - lineCount; spaceCount >= 1; spaceCount--) {
                System.out.print(" ");
            }
            for (int starCount = 1; starCount <= 2 * lineCount - 1; starCount++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
