import java.util.Scanner;

/**
 * Write a description of class Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q3
{
        public static void main(String[] args)
    
   {   
    System.out.println("ENTER THE NUMBER");
    Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        if (num>=1)
        {
            System.out.println("THE NUMBER IS POSITIVE");
        }
        else if (num==0)
        {
        System.out.println("THE NUMBER IS ZERO");
        
        
        }
        else 
        {
            System.out.println("THE NUMBER IS NEGETIVE");
            
        }
    }
}
