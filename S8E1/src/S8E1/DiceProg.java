// DiceProg.java
// Author: Rob Miller
// Program last changed: 16 October 2005
    
/* This program tests the Dice class.             */ 

package S8E1;

import java.util.Scanner;

public class DiceProg
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Dice theDice = new Dice();

        char selection = 'a';
        while (selection != 'q')
        {
            System.out.println();
            System.out.println("\tType: ");
            System.out.println("\t\tt - to cast the dice");
            System.out.println("\t\tq - to quit\n");
            System.out.print("\tEnter selection: ");
            selection = scan.next().charAt(0);
            if (selection == 't')
            {
                theDice.cast();
                System.out.println("\tThe result was " + theDice.toString());
            }
        }
        System.out.println("\tPROGRAM ENDED\n");
    }
}