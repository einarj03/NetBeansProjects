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

public class S3E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        final int LOW_AGE = 16, HIGH_AGE = 60, MAX_AGE = 120;
        final double FULL_PRICE = 6.00;
        boolean inputError = false;
        int age;
        double cost = 0;
        DecimalFormat twoDecPlcFormatter = new DecimalFormat("0.00");
        
        System.out.println();
        
        System.out.print("\tEnter your age: ");
        age = scan.nextInt();
        
        if (age < 0 || age > MAX_AGE) {
            inputError = true;
        } else if (age < LOW_AGE) {
            cost = 0.5 * FULL_PRICE;
        } else if (age > HIGH_AGE) {
            cost = FULL_PRICE / 3;
        } else {
            cost = FULL_PRICE;
        }
        
        
        if (inputError) {
            System.out.print("\tInput Error!\n");
        } else {
            System.out.print("\tYour ticket costs £");
            System.out.print(twoDecPlcFormatter.format(cost) + ".");
            
        }
        
    }
    
}
