// Checkouts.java
// Author: Rob Miller
// Program last changed: 16 Octorber 2005
    
/* This program stores takings for a list of checkout desks.    */ 

import java.util.Scanner;
import java.text.DecimalFormat;

public class Checkouts
{
   static final int NUMBER_OF_CHECKOUTS = 6, MAX_TAKING = 1000000;

   public static void main(String[] args)
   {
      DecimalFormat twoDecPlcFormatter = new DecimalFormat("0.##"); 
       
       
      Scanner scan = new Scanner(System.in);
      double[] checkoutList = new double[NUMBER_OF_CHECKOUTS];

      System.out.println();
      for (int index = 0; index < checkoutList.length; index++)
      {
         System.out.print("\tEnter takings for checkout number ");
         System.out.print((index + 1) + ": ");
         checkoutList[index] = scan.nextDouble();
         while (checkoutList[index] < 0 || checkoutList[index] > MAX_TAKING)
         {
            System.out.print("\tImpossible! - enter takings for checkout number ");
            System.out.print((index + 1) + " again: ");
            checkoutList[index] = scan.nextDouble();
         } 
      }
      System.out.println();
      
      System.out.print("\tThe total takings for the supermarket is ");
      System.out.print(twoDecPlcFormatter.format(totalTakings(checkoutList)));
      System.out.print(".");
      
   }
   
   public static double totalTakings(double[] checkoutList)
   {
       double total = 0;
       
       for (int index = 0; index < checkoutList.length; index++)
       {
           total += checkoutList[index];
       }
       
       return total;
       
   }
   
}
