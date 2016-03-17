/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S7E2;

/**
 *
 * @author einarjonsson
 */
import java.util.Random;

public class Penny
{
   private final int HEADS = 0;
   private final int TAILS = 1;
   private static int headsSoFar = 0;
   private static int tailsSoFar = 0;

   private int face;

   //-----------------------------------------------------------------
   //  Sets up the penny by flipping it initially.
   //-----------------------------------------------------------------
   public Penny ()
   {
      flip();
      if (isHeads()) 
         headsSoFar++;
      else
         tailsSoFar++;
   }

   //-----------------------------------------------------------------
   //  Returns the current value of headsSoFar.
   //-----------------------------------------------------------------
   public static int getHeadsSoFar ()
   {
      return headsSoFar;
   }

   //-----------------------------------------------------------------
   //  Returns the current value of tailsSoFar.
   //-----------------------------------------------------------------
   public static int getTailsSoFar ()
   {
      return tailsSoFar;
   }

   //-----------------------------------------------------------------
   //  Flips the penny by randomly choosing a face value.
   //-----------------------------------------------------------------
   private void flip ()
   {
      face = (int) (Math.random() * 2);
   }

   //-----------------------------------------------------------------
   //  Returns true if the current face of the penny is heads.
   //-----------------------------------------------------------------
   public boolean isHeads ()
   {
      return (face == HEADS);
   }

   //-----------------------------------------------------------------
   //  Returns the current face of the penny as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String faceName;

      if (face == HEADS)
         faceName = "Heads";
      else
         faceName = "Tails";

      return faceName;
   }
}