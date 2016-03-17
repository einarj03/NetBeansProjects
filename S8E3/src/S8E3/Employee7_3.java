/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S8E3;

/**
 *
 * @author einarjonsson
 */
public class Employee7_3
{
    public final int STARTING_SALARY = 10000;
    public final int INCREMENT = 1000;

    private String name;
    private int salary;
    
   //-----------------------------------------------------------------
   //  Constructor - assigns the argument as the name of the employee.
   //-----------------------------------------------------------------
    public Employee7_3 (String employeeName)
    {
        name = employeeName;
        salary = STARTING_SALARY;
    }
    
   //-----------------------------------------------------------------
   //  Promotes the employee by increasing the salary by INCREMENT.
   //-----------------------------------------------------------------
    public void promote ()
    {
        salary += INCREMENT;
    }
    
   //-----------------------------------------------------------------
   //  Demotes the employee by decreasing the salary by INCREMENT.
   //-----------------------------------------------------------------
    public void demote ()
    {
        if (salary >= INCREMENT) 
            salary -= INCREMENT;
    }
    
   //-----------------------------------------------------------------
   //  Returns the name and salary of the employee as a string.
   //-----------------------------------------------------------------
    public String toString ()
    {
        return ("Name: " + name + ", salary: " + salary);
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
    
}