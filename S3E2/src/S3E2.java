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
import java.text.DecimalFormat;

public class S3E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        final int MIN_AGE = 18, MAX_AGE = 65, MAX_POSSIBLE_AGE = 120;
        boolean criminalRecord = false, inputError = false, withinAgeRange = true;
        int age;
        
        System.out.print("Enter your age: ");
        age = scan.nextInt();
        
        if (age < 0 || age > MAX_POSSIBLE_AGE) {
            inputError = true;
        } else if (age < 18 || age > 65) {
            withinAgeRange = false;
        }
        
        System.out.print("Do you have a criminal record? (y/n): ");
        char yesOrNo = scan.next().charAt(0);
        if (yesOrNo == 'y' || yesOrNo == 'Y') {
            criminalRecord = true;
        } else if (yesOrNo != 'n' && yesOrNo != 'N') {
            inputError = true;
        }
        
        if (inputError) {
            System.out.print("Input Error!\n");
        } else if (withinAgeRange && !criminalRecord) {
            System.out.print("You are required to do jury service.");
        } else {
            System.out.print("You are excluded from jury service.");
        }
        
    }
    
}
