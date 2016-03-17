/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author einarjonsson
 */

package S8E2;

public class DiceWithSix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dice theDice = new Dice();
        
        if (theDice.toString() == "six")
        {
            System.out.print("A " + theDice.toString() + " - you won!");
        }
        else
        {
            System.out.print("A " + theDice.toString() + " - you lost!");
        }
        
    }
    
}
