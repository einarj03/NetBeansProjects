// INCOMPLETE PROGRAM! - STILL NEEDS DECLARATION FOR printPoint(...)

// ProblemSolvingWithParams.java
// Author: Rob Miller
// Program last changed: 16 October 2005
    
/* This program outputs a quote from Lewis and Loftus about problem solving.      */ 

public class ProblemSolvingWithParams
{
   //-----------------------------------------------------------------
   //  Prints a quote from Lewis and Loftus about problem solving.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      printIntroduction();
      printPoints();
      printConclusion();
      printAcknowledgement();
   }
   
   //-----------------------------------------------------------------
   //  Prints the acknowledgement.
   //-----------------------------------------------------------------
   private static void printAcknowledgement()
   {
      System.out.println("\t\t\t\t\t(Lewis and Loftus, 2003)\n");
   }

   //-----------------------------------------------------------------
   //  Prints the concluding part of the quote.
   //-----------------------------------------------------------------
   private static void printConclusion()
   {
      System.out.println("\n\tAlthough this approach applies to any kind of problem,");
      System.out.println("\tit works particularly well when developing software.\"\n");
   }
   
   //-----------------------------------------------------------------
   //  Prints the introductory part of the quote.
   //-----------------------------------------------------------------
   private static void printIntroduction()
   {
      System.out.println("\n\t\"The purpose of writing a program is to solve a problem.");
      System.out.println("\tProblem solving, in general, consists of multiple steps:\n");
   }
   
   //-----------------------------------------------------------------
   //  Prints the points in the quote.
   //-----------------------------------------------------------------
   private static void printPoints()
   {
      printPoint(1);
      printPoint(2);
      printPoint(3);
      printPoint(4);
      printPoint(5);
      printPoint(6);
   }
   
   // ADD DECLARATION FOR printPoint(...) HERE
   
   private static void printPoint(int pointNum) {
       switch (pointNum) {
           case 1:
               System.out.println("\t\t1.\tUnderstanding the problem.");
               break;
           case 2:
               System.out.println("\t\t2.\tBreaking the problem into manageable pieces.");
               break;
           case 3:
               System.out.println("\t\t3.\tDesigning a solution.");
               break;
           case 4:
               System.out.println("\t\t4.\tConsidering alternatives to the solution");
               System.out.println("\t\t\tand refining the solution.");
               break;
           case 5:
               System.out.println("\t\t5.\tImplementing the solution.");
               break;
           case 6:
               System.out.println("\t\t6.\tTesting the solution and fixing any problems");
               System.out.println("\t\t\tthat exist.");
               break;
           
       }
   }
   
}
    