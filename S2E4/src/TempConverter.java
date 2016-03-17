//********************************************************************
//  TempConverter.java       Author: Lewis/Loftus
//
// 
//  Computes the Fahrenheit equivalent of a specific Celsius
//  value using the formula F = (9/5)C + 32.
//
//********************************************************************

import java.util.Scanner;

public class TempConverter
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner(System.in);
      final int BASE = 32;
      final double CONVERSION_FACTOR = 9.0 / 5.0;

      int fahrenheitTemp;
      double celsiusTemp;  // value to convert
      
      System.out.print ("\nEnter temperature in Fahrenheit: ");
      fahrenheitTemp = scan.nextInt();

      celsiusTemp = (fahrenheitTemp - BASE) / CONVERSION_FACTOR;
        
      System.out.println ("Fahrenheit Temperature: " + fahrenheitTemp);
      System.out.println ("Celsius Equivalent: " + celsiusTemp);
      
   }
}
