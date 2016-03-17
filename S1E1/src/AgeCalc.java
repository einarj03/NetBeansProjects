// AgeCalc.java
// Author: Rob Miller
// Program last changed: 21 September 2005
    
/* This program calculates how old someone will be in a given year,
   after prompting for the current year and user's age.             */ 

import java.util.Scanner;

public class AgeCalc
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int year_now, age_now, another_year, another_age;
        
        System.out.print("Enter the current year then press RETURN: ");
        year_now = scan.nextInt();
        
        System.out.print("Enter your current age in years: ");
        age_now = scan.nextInt();
        
        System.out.print("Enter the year in which you wish to know your age: ");
        another_year = scan.nextInt();
        
        another_age = another_year - (year_now - age_now);
        
        System.out.print("Your age in " + another_year + ": ");
        System.out.println(another_age);
    }
}
