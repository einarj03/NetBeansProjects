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

public class S2E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int hours, mins, secs, totalSecs;
        String isHoursPlural, isMinsPlural, isSecsPlural, isTotalSecsPlural;
        
        System.out.print("Enter a number of hours: ");
        hours = scan.nextInt();
        
        if (hours != 1) {
            isHoursPlural = "s";
        } else {
            isHoursPlural = "";
        }
        
        
        System.out.print("Enter a number of minutes: ");
        mins = scan.nextInt();
        
        if (mins != 1) {
            isMinsPlural = "s";
        } else {
            isMinsPlural = "";
        }
        
        System.out.print("Enter a number of seconds: ");
        secs = scan.nextInt();
        
        if (secs != 1) {
            isSecsPlural = "s";
        } else {
            isSecsPlural = "";
        }
        
        totalSecs = hours * 3600 + mins * 60 + secs;
        
        if (totalSecs != 1) {
            isTotalSecsPlural = "s";
        } else {
            isTotalSecsPlural = "";
        }
        
        System.out.print(hours + " hour" + isHoursPlural + ", " + mins + " minute" + isMinsPlural + " and " + secs + " second" + isSecsPlural + " is equivalent to " + totalSecs + " second" + isTotalSecsPlural + ".");
       
        
    }
    
}
