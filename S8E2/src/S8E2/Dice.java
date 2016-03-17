/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S8E2;

/**
 *
 * @author einarjonsson
 */
import java.util.Random;

public class Dice
{
   private int face;

   //-----------------------------------------------------------------
   //  Sets up the coin by flipping it initially.
   //-----------------------------------------------------------------
   public Dice ()
   {
      cast();
   }

   //-----------------------------------------------------------------
   //  Flips the coin by randomly choosing a face value.
   //-----------------------------------------------------------------
   public void cast ()
   {
      face = (int) (Math.random() * 6) + 1;
   }

   //-----------------------------------------------------------------
   //  Returns the current face of the coin as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      String faceName;

      switch (face)
      {
          
          case 1:
              faceName = "one";
              break;
          case 2:
              faceName = "two";
              break;
          case 3:
              faceName = "three";
              break;
          case 4:
              faceName = "four";
              break;
          case 5:
              faceName = "five";
              break;
          case 6:
              faceName = "six";
              break;
          default:
              faceName = "Problem";
      }

      return faceName;
   }
}