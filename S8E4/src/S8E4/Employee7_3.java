/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S8E4;

/**
 *
 * @author einarjonsson
 */
import java.util.Scanner;

public class Employee7_3
{
    public final int STARTING_SALARY = 10000;
    public final int INCREMENT = 1000;

    private String name;
    private int salary;
    private boolean hired;
    
   //-----------------------------------------------------------------
   //  Constructor - assigns the argument as the name of the employee.
   //-----------------------------------------------------------------
    public Employee7_3 (String employeeName)
    {
        name = employeeName;
        salary = STARTING_SALARY;
        hired = true;
    }
    
   //-----------------------------------------------------------------
   //  Promotes the employee by increasing the salary by INCREMENT.
   //-----------------------------------------------------------------
    public void promote ()
    {
        if (hired)
        {
            salary += INCREMENT;
        }
        else
        {
            firedErrorMessage();
        }
    }
    
   //-----------------------------------------------------------------
   //  Demotes the employee by decreasing the salary by INCREMENT.
   //-----------------------------------------------------------------
    public void demote ()
    {
        if (hired)
        {
            if (salary >= INCREMENT) 
            salary -= INCREMENT;
        }
        else
        {
            firedErrorMessage();
        }
    }
    
   //-----------------------------------------------------------------
   //  Returns the name and salary of the employee as a string.
   //-----------------------------------------------------------------
    public String toString ()
    {
        return ("Name: " + name + ", salary: " + salary);
    }
    
    public void raise ()
    {
        if (hired)
        {
            Scanner scan = new Scanner(System.in);
            System.out.print("\tEnter amount of rise: ");
            int rise = scan.nextInt();
            raiseSalaryBy(rise);
        }
        else
        {
            firedErrorMessage();
        }
        
    }
    
    public void raiseSalaryBy (int amount)
    {
        
        if (amount > 0 && amount < INCREMENT)
        {
            salary += amount;
        }
        else
        {
            System.out.print("\tINPUT ERROR! Raise must be between 1 and 999.");
        }
        
    }
    
    public void fire ()
    {
        if (hired)
        {
            salary = 0;
            hired = false;
        }
        else
        {
            firedErrorMessage();
        }
    }
    
    public void firedErrorMessage()
    {
        System.out.print("\tERROR! This employee no longer works here.");
    }
    
}