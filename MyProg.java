
/**
 * Program Title.
 * Description of what program does ...
 * ...
 * 
 * 
 * Andrew Montgomery-Fox
 * V2 - Re-coded it for better optimization 
 */

import javax.swing.*;
import java.text.*;
import java.util.*;

public class MyProg 
{
    
    
     //Main method - required by all programs
   
    public static void main(String[] args)
    {
        double score;
        int total=0, average=0;
        int[] members=new int[4];
        String[] membersNames=new String[4];
        String input; 
        
        
    for (int i=0;i<4;i++)
    {
        membersNames[i]=JOptionPane.showInputDialog("Enter a name for each member - one name per popup box");
    }
   
        
    for (int i=0;i<4;i++)
    {
        do
        {
            input=JOptionPane.showInputDialog("Enter a score");
            members[i]=Integer.parseInt(input);
            
                if (members[i]<0 || members[i]>10) 
                {
                    JOptionPane.showMessageDialog(null, "Please enter a score between 0 and 10");
                }
        }while (members[i]<0 || members[i]>10);
    }
    
    for( int i : members) 
    {
     total += i;
    }
    
    average=total/4;
    
    for (int i=0;i<4;i++)
    {
     System.out.printf(membersNames[i]+" scored "+members[i]+"\r\n");
    }
    System.out.println("Total team score is "+total);
    System.out.println("Team average score is "+average);
    }   
 }
