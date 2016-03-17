// GuessOneRandom.java
// Author: Rob Miller
// Program last changed: 21 September 2005
    
/* This program asks the user to guess a random number.             */ 

import java.util.Scanner;

public class GuessOneRandom
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      final int MIN = 1, MAX = 5;
      int answer = ((int)(Math.random() * (MAX + 1 - MIN))) + MIN;
      int guess;

      System.out.println();
      System.out.print("\tGuess the number between " + MIN + " and " + MAX + ": ");
      guess = scan.nextInt();
      
      while (guess != answer) {
          System.out.print("\tNo, guess again: ");
          guess = scan.nextInt();
      }
      
      System.out.println("\tCorrect - well done!");
      
      System.out.println();
   }
}