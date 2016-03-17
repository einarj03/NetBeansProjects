// RandomTickets.java
// Author: Rob Miller
// Program last changed: 21 September 2005
    
/* This program selects a number of tickets at random as a prize.             */ 

public class RandomTickets
{
   public static void main(String[] args)
   {
      final int MIN = 1, MAX = 15;
      int ticketQuant = 0, ticketOdds = ((int)(Math.random() * (MAX + 1 - MIN))) + MIN;

      if (ticketOdds == 1) {
          ticketQuant = 3;
      } else if (ticketOdds < 4) {
          ticketQuant = 2;
      } else if (ticketOdds < 8) {
          ticketQuant = 1;
      }
      
      System.out.println();
      System.out.print("You have won " + ticketQuant);
      System.out.println(ticketQuant == 1 ? " ticket." : " tickets.");
      System.out.println();
   }
}