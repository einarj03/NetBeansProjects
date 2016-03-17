// Employee6_3Prog.java
// Author: Rob Miller
// Program last changed: 16 October 2005
    
/* This program tests the Employee6_3 class.             */ 

package S8E3;

import java.util.Scanner;

public class Employee7_3Prog
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n\tEnter the employee's name: ");
        String aName = scan.nextLine();
        Employee7_3 theEmployee = new Employee7_3(aName);

        char selection = 'a';
        while (selection != 'q')
        {
            System.out.println();
            System.out.println("\tType: ");
            System.out.println("\t\tp - to promote the employee");
            System.out.println("\t\td - to demote the employee");
            System.out.println("\t\tr - to raise the employee's salary by a given amount");
            System.out.println("\t\tv - to view the employee's details");
            System.out.println("\t\tq - to quit\n");
            System.out.print("\tEnter selection: ");
            selection = scan.next().charAt(0);
            switch (selection)
            {
                case 'p':
                    theEmployee.promote();
                    break;
                case 'd':
                    theEmployee.demote();
                    break;
                case 'r':
                    System.out.print("\tEnter amount of rise: ");
                    int rise = scan.nextInt();
                    theEmployee.raiseSalaryBy(rise);
                    break;
                case 'v':
                    System.out.println("\t" + theEmployee.toString());
                    break;
            }
        }
        System.out.println("\tPROGRAM ENDED\n");
    }
}
