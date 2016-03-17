// GuessTwoRandomsDecomposed.java
// Author: Rob Miller
// Program last changed: 21 September 2005
    
/* This program asks the user to guess two random numbers in either order.             */ 

import java.util.Scanner;

public class GuessTwoRandomsDecomposed
{
   //--------------------------------------------------------------------------
   // Asks the user to guess two random numbers.
   //--------------------------------------------------------------------------
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      final int MIN = 1, MAX = 3;
      int firstAnswer = ((int)(Math.random() * (MAX + 1 - MIN))) + MIN;
      int secondAnswer = ((int)(Math.random() * (MAX + 1 - MIN))) + MIN;
      int firstGuess, secondGuess;

      System.out.println();
      System.out.print("\tGuess the first number between " + MIN + " and " + MAX + ": ");
      firstGuess = scan.nextInt();
      System.out.print("\tGuess the second number between " + MIN + " and " + MAX + ": ");
      secondGuess = scan.nextInt();
      
      if (guessesOK(firstGuess,secondGuess,firstAnswer,secondAnswer))
      {
           System.out.println("\tCorrect - well done!");
      }
      else
      {
           System.out.print("\tNo, the answers were ");
           System.out.println(firstAnswer + " and " + secondAnswer + ".");
      }
      System.out.println();
   }
   
   //--------------------------------------------------------------------------
   // Returns true if guess parameters match answer parameters.
   //--------------------------------------------------------------------------
   public static boolean guessesOK(int guessA, int guessB, int ans1, int ans2)
   {
      boolean okOneWay = (guessA == ans1 && guessB == ans2);
      boolean okOtherWay = (guessA == ans2 && guessB == ans1);
      return (okOneWay || okOtherWay);
   }
}