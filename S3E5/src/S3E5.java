/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author einarjonsson
 */
public class S3E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int MIN = 1, MAX = 15;
        int ticketQuant = 0, ticketOdds = ((int)(Math.random() * (MAX + 1 - MIN))) + MIN;
        
        switch (ticketOdds) {
            case 1:
                ticketQuant = 3;
                break;
            case 2:
            case 3:
                ticketQuant = 2;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                ticketQuant = 1;
                break;
            default:
                ticketQuant = 0;
        }
        
        System.out.print("You have won " + ticketQuant);
        System.out.println(ticketQuant == 1 ? " ticket." : " tickets.");
    }
    
}
