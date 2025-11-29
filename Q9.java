import java.util.Scanner;

/**
 * Write a description of class Q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q9
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println ("Enter GPA");
        float gpa= scan.nextFloat();
        System.out.println ("Enter ATTENDANCE");
        float att= scan.nextFloat();
        System.out.println ("Enter Attitude Score(1-10)");
        int score= scan.nextInt();
        
        if (gpa<=4.0 && gpa>=0.0)
        {
        System.out.println ("Valid GPA");
             if (gpa>=3.2 && gpa<=4.00)
             {
                 if (att>80)
                 {
                     if (score<5)
                     {
                         System.out.println("THE STUDENT IS ELIGIBLE FOR SCOLARSHIP");
                     }
                     else 
                     {
                         System.out.println ("not eligible: Aggressive");
                     }
                     
                 }
                 else 
                {
                    System.out.println ("not eligible: :LOW ATTENDANCE");
                }
             }
             else 
             {
                 System.out.println ("not aligible due to low gpa");
                
             }
             
         }
        else 
        {
             System.out.println ("Invalid GPA");
        }
        
        
    }
}