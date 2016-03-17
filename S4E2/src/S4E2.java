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

public class S4E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner scan = new Scanner(System.in);
      final int MIN_AGE = 18, MAX_AGE = 65, MIN_POSSIBLE_AGE = 0, MAX_POSSIBLE_AGE = 120;
      boolean criminalRecord = false;
      int age;
      
      System.out.println();
      
      System.out.print("\tEnter your age: ");
      age = scan.nextInt();
      
      while (age < MIN_POSSIBLE_AGE || age >  MAX_POSSIBLE_AGE) {
          System.out.print("\tThat's impossible, please enter your real age: ");
          age = scan.nextInt();
      }
         
      System.out.print("\tDo you have a criminal record? (y/n): ");
      char yesOrNo = scan.next().charAt(0);
      
      while (yesOrNo != 'y' && yesOrNo != 'n' && yesOrNo != 'Y' && yesOrNo != 'N') {
          System.out.print("\tPlease answer either yes or no (y/n): ");
          yesOrNo = scan.next().charAt(0);
      }
      
      if (yesOrNo == 'y' || yesOrNo == 'Y')
         criminalRecord = true;

      if (criminalRecord || age < MIN_AGE || age > MAX_AGE)
         System.out.println("\tYou are excluded from jury service.");   
      else 
         System.out.println("\tYou are required to do jury service.");   
         
      System.out.println();
        
    }
    
}
