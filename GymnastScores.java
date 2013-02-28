
/**
 * Write a description of your program here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import javax.swing.*;
import java.text.*;
import java.util.*;

class GymnastScores
{
    /**
     * Method that does the work
     * All your code should go here between the curly brackets
     */
    public void go()
    {
        //Make a 4 Member array
        double Member1, Member2, Member3, Member4, average, total;
        //Make 'input' a string
       String input;
       
        //Show start-up warning message
       JOptionPane.showMessageDialog(null, "Scores cannot be greater than ten or less than zero!");
       
        //Start Collecting Data
      do
      {
             input=JOptionPane.showInputDialog("Enter Member 1's Score");
             Member1=Double.parseDouble(input);
             
            if ((Member1<0) || (Member1>10))
            {
                JOptionPane.showMessageDialog(null, "Please enter a valid number!");
            }
      }while ((Member1<0) || (Member1>10));
            
      do
      {
             input=JOptionPane.showInputDialog("Enter Member 2's Score");
             Member2=Double.parseDouble(input);
             if ((Member2<0) || (Member2>10))
            {
                JOptionPane.showMessageDialog(null, "Please enter a valid number!");
            }
      }while ((Member2<0) || (Member2>10));   
             
      do
      {
             input=JOptionPane.showInputDialog("Enter Member 3's Score");
             Member3=Double.parseDouble(input);
             if ((Member3<0) || (Member3>10))
            {
                JOptionPane.showMessageDialog(null, "Please enter a valid number!");
            }
      }while ((Member3<0) || (Member3>10));         
      
      do
      {
             input=JOptionPane.showInputDialog("Enter Member 4's Score");
             Member4=Double.parseDouble(input);
             if ((Member4<0) || (Member4>10))
            {
                JOptionPane.showMessageDialog(null, "Please enter a valid number!");
            }
      }while ((Member4<0) || (Member4>10));
            
            
       total=Member1+Member2+Member3+Member4;
       average=total/4;
       
        //Display Individual Scores and Average Team Score
       System.out.println("The team average was" +average);
       System.out.println("Member 1 scored" +Member1);
       System.out.println("Member 2 scored" +Member2);
       System.out.println("Member 3 scored" +Member3);
       System.out.println("Member 4 scored" +Member4);
       
       
       
       
       
       
    }
    
    /**
     *  Main method to set up your program
     *  Do not alter this code
     */
    public static void main(String[] args)
    {
        MyProg prog = new MyProg();
        prog.go();
    }
    
    
    /**
     * predefined method used to format doubles to a set number of decimal places
     * the double to be formatted and the number of decimal places it is formatted to
     * should both be passed in the function call
     */
    private String format(double number, int numberOfDecimalDigits)
    {
        String layout;
        
        NumberFormat numberFormat=NumberFormat.getInstance(Locale.UK);
        DecimalFormat decimalFormat =(DecimalFormat)numberFormat;
        layout="0.";
        
        for(int i=0;i<numberOfDecimalDigits;i++)
        {
            layout=layout+"0";
        }
        
        decimalFormat.applyPattern(layout);
        return(decimalFormat.format(number));
    }
}