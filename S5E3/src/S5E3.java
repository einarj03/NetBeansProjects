/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author einarjonsson
 */

import java.util.Scanner;


public class S5E3 {

    /**
     * @param args the command line arguments
     */
        public final static int MARGIN = 10;
        public static char brickCharacter;
        public static int height; 
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the height of the diamond: ");
        height = scan.nextInt();
        
        height = (height % 2 == 0) ? height++ : height;
        
        System.out.print("Enter the character from which the diamond should be made: ");
        brickCharacter = scan.next().charAt(0);
        
        System.out.print(diamondString());

        
        
    }
    
    public static String diamondString()
    {
        String pattern = "\n";
        for (int lineCount = 1; lineCount <= height; lineCount++)
        {
            pattern += diamondLine(lineCount);
        }
        return pattern;
    }
    
    public static String diamondLine(int lineNumber)
    {
        String line = "";
        line += spacesForLine(lineNumber);
        line += symbolsForLine(lineNumber);
        line += "\n";
        return line;
    }
    
    public static String spacesForLine(int lineNum)
    {
        String spaces = "";
        
        if (lineNum < 0.5 * height + 1)
        {
            for(int spacesCount = 1; spacesCount <= height / 2.0 - lineNum + 0.5 + MARGIN; spacesCount++)
            {
                spaces += " ";
            }
        }
        else
        {
            for(int spacesCount = 1; spacesCount <= lineNum - height / 2.0 - 0.5 + MARGIN; spacesCount++)
            {
                spaces += " ";
            }
        }
        
        return spaces;
        
    }
    
    public static String symbolsForLine(int lineNum)
    {
        String symbols = "";
        
        if (lineNum < 0.5 * height + 1)
        {
            for(int symbolCount = 1; symbolCount <= 2 * lineNum - 1; symbolCount++)
            {
                symbols += brickCharacter;
            }
        }
        else
        {
            for(int symbolCount = 1; symbolCount <= 2 * (height - lineNum) + 1; symbolCount++)
            {
                symbols += brickCharacter;
            }
        }
        
        return symbols;
    }
    
}
