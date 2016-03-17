// PennyProg.java
// Author: Rob Miller
// Program last changed: 21 September 2005
    
/* This program tests the Penny class.             */ 

package S7E2;

import java.util.Scanner;

public class PennyProg
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Penny thePenny = null;
        char selection = 'a';
        while (selection != 'q')
        {
            System.out.println("\n\tType: ");
            System.out.println("\t\tc - to create the next penny");
            System.out.println("\t\tv - to view the heads/tails count");
            System.out.println("\t\tq - to quit\n");
            System.out.print("\tEnter selection: ");
            selection = scan.next().charAt(0);
            if (selection == 'c')
            {
               thePenny = new Penny();
               System.out.println("\tThis penny landed on " + thePenny.toString());
            }
            if (selection == 'v')
            {
                int totalFlips = thePenny.getHeadsSoFar() + thePenny.getTailsSoFar();
                int percentageHeads = (int) ((float) thePenny.getHeadsSoFar() / totalFlips * 100);
                int percentageTails = 100 - percentageHeads;
                
                System.out.print("\theads: " + percentageHeads + "%");
                System.out.print("\ttails: " + percentageTails + "%");
                
               
            }
        }
        System.out.println("\tPROGRAM ENDED\n");
    }
}