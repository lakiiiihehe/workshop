import java.util.Scanner;

/**
 * Write a description of class q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q2
{
    public static void main(String[] args)
    
{   
    System.out.println("ENTER THE NUMBER");
    Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        if (num%2==0)
        {
            System.out.println("THE NUMBER IS EVEN");
        }
        else
        {
        System.out.println("THE NUMBER IS ODD");
        
        }
    }
}