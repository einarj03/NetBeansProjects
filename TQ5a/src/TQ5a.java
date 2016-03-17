/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author einarjonsson
 */
public class TQ5a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        rectangle (3, 6);
        
    }
    
    static void rectangle (int height, int width)
    {
        if (height >= 3 && width >= 3)
        {
            for (int lineCount = 1; lineCount <= height; lineCount++)
            {
                for (int symbolCount = 1; symbolCount <= width; symbolCount++)
                {
                    if (lineCount != 1 && lineCount != height && (symbolCount == 1 || symbolCount == width))
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print("+");
                    }
                }
                
                System.out.println();
                
            }
        }
    }
    
}
