// INCOMPLETE PROGRAM! - STILL NEEDS FULL DECLARATIONS FOR  
// inputDetails(...) and outputAdvice(...)

// HowMuchMedicineDecomposed.java
// Author: Rob Miller
// Program last changed: 16 October 2005
    
/* This program works out how many headache tablets the user should take.      */ 

package S7E1;

import java.util.Scanner;
public class HowMuchMedicineDecomposed
{
   final static int AGE_LIMIT = 6, MAX_AGE = 120;
   
   //--------------------------------------------------------------------------
   //  Main - works out how many headache tablets the user should take.
   //--------------------------------------------------------------------------
   public static void main(String[] args)
   {
      Patient thePatient = new Patient();
      inputDetails(thePatient);
      outputAdvice(thePatient);
   }
   
   //--------------------------------------------------------------------------
   //  Should input the details of a patient passed as a parameter.
   //--------------------------------------------------------------------------
   private static void inputDetails(Patient aPatient)
   {
       Scanner scan = new Scanner(System.in);
       
       System.out.print("\tIs the patient allergic to gluten? (y/n): ");
       char yesOrNo = scan.next().charAt(0);
       while (yesOrNo != 'n' && yesOrNo != 'N' && yesOrNo != 'y' && yesOrNo != 'Y')
       {
           System.out.print("\tInput Error! - Please enter either \'y\' or \'n\': ");
           yesOrNo = scan.next().charAt(0);
       }
       if (yesOrNo == 'y' || yesOrNo == 'Y')
       {
           aPatient.setAllergicToGluten(true);
       }
      
       
       System.out.print("\tIs the patient pregnant? (y/n): ");
       yesOrNo = scan.next().charAt(0);
       while (yesOrNo != 'n' && yesOrNo != 'N' && yesOrNo != 'y' && yesOrNo != 'Y')
       {
           System.out.print("\tInput Error! - Please enter either 'y' or 'n': ");
           yesOrNo = scan.next().charAt(0);
       }
       if (yesOrNo == 'y' || yesOrNo == 'Y')
       {
           aPatient.setPregnant(true);
       }
       
       
       System.out.print("\tEnter the age of the patient: ");
       int age = scan.nextInt();
       while (age < 0 || age > MAX_AGE)
       {
           System.out.print("\tInput Error! - Please enter the patient\'s real age: ");
           age = scan.nextInt();
       }
       aPatient.setAge(age);
       
       
   }
         
   //--------------------------------------------------------------------------
   //  Should output advice for a patient passed as a parameter.
   //--------------------------------------------------------------------------
   private static void outputAdvice(Patient aPatient)
   {
       if (aPatient.getAllergicToGluten())
       {
           System.out.print("\tYou should not take any tablets.");
       }
       else if (aPatient.getAge() < AGE_LIMIT || aPatient.getPregnant())
       {
           System.out.print("\tYou should take 1 tablet.");
       }
       else
       {
           System.out.print("\tYou should take 2 tablets.");
       }
     
   }
}