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

public class S2E7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        int totalSecs, hours, mins, secs;
        
        
        System.out.print("Enter a number of seconds: ");
        totalSecs = scan.nextInt();
        
        hours = totalSecs / 3600;
        
        mins = (totalSecs % 3600) / 60;
        
        secs = totalSecs % 60;
        
        String isHoursPlural, isMinsPlural, isSecsPlural, isTotalSecsPlural;
        
        if (hours != 1) {
            isHoursPlural = "s";
        } else {
            isHoursPlural = "";
        }
        
        if (mins != 1) {
            isMinsPlural = "s";
        } else {
            isMinsPlural = "";
        }
        
        if (secs != 1) {
            isSecsPlural = "s";
        } else {
            isSecsPlural = "";
        }
        
        if (totalSecs != 1) {
            isTotalSecsPlural = "s";
        } else {
            isTotalSecsPlural = "";
        }
        
        System.out.print(totalSecs + " second" + isTotalSecsPlural + " is equivalent to " + hours + " hour" + isHoursPlural + ", " + mins + " minute" + isMinsPlural + " and " + secs + " second" + isSecsPlural + ".");
        
    }
    
}
