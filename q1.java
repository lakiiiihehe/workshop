import java.util.Scanner;

/**
 * Write a description of class q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q1
{
    public static void main(String[] args)
    {
        System.out.println("ENTER THE MARKS");
        Scanner scan = new Scanner(System.in);
        int marks= scan.nextInt();
        if (marks>40)
        {
            System.out.println("PASSED");
        }
        else
        {
        System.out.println("FAILED");
        
        }
    }
}