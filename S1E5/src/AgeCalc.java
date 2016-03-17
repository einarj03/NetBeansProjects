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
        int year_now, month_now, age_now, birth_month, another_year, another_month, another_age_year = 0, another_age_month;
        
        System.out.print("Enter the current year then press RETURN: ");
        year_now = scan.nextInt();
        
        System.out.print("Enter the current month (number from 1 to 12): ");
        month_now = scan.nextInt();
        
        System.out.print("Enter your current age in years: ");
        age_now = scan.nextInt();
        
        System.out.print("Enter the month you were born (number from 1 to 12): ");
        birth_month = scan.nextInt();
        
        System.out.print("Enter the year in which you wish to know your age: ");
        another_year = scan.nextInt();
        
        System.out.print("Enter the month in that year (number from 1 to 12): ");
        another_month = scan.nextInt();
        
        
        if ((another_month >= birth_month && month_now >= birth_month) || (another_month < birth_month && month_now < birth_month)) {
            another_age_year = age_now + another_year - year_now;
        } else if (month_now < birth_month && another_month >= birth_month) {
            another_age_year = age_now + another_year - year_now + 1;
        } else if (month_now >= birth_month && another_month <= birth_month) {
            another_age_year = age_now + another_year - year_now - 1;
        }
        
        if (another_month - birth_month >= 0) {
            another_age_month = another_month - birth_month;
        } else {
            another_age_month = another_month - birth_month + 12;
        }
        
        
        String year_plural, month_plural;
        if (another_age_year == 1) {
            year_plural = "";
        } else {
            year_plural = "s";
        }
        
        if (another_age_month == 1) {
            month_plural = "";
        } else {
            month_plural = "s";
        }
        
        
        if (another_age_year > 150) {
            System.out.println("Sorry, but you'll probably be dead by " + another_year + "!");
        } else if (another_age_year < 0 || (another_age_year == 0 && another_age_month == 0)) {
            System.out.println("You weren't born in " + another_year + ".");
        } else  {
            System.out.print("Your age in " + another_month + "/" + another_year + ": " + another_age_year + " year" + year_plural + " and " + another_age_month + " month" + month_plural + ".");
        
        }
    }
}
