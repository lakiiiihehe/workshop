import java.util.Scanner;

/**
 * Write a description of class q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q8
{
    public static void main (String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println ("Enter GPA");
        float gpa= scan.nextFloat();
        if (gpa<=4.0 && gpa>=0.0)
        {
             System.out.println ("Valid GPA");
             if (gpa >= 3.2)
         {
              System.out.println ("A");
              
         }
         else if(gpa >= 2.61 && gpa < 3.2)
         {
              System.out.println ("B");
         }
         else if(gpa >= 1.2 && gpa < 2.61)
         {
              System.out.println ("c");
         }
         else 
         {
             System.out.print("FAIL VAIS"); 
         }
            
        }
        else 
        {
             System.out.println ("Invalid GPA");
        }
        
        // grade calculatuojn 
         
        
        
            
            
        
    }
}