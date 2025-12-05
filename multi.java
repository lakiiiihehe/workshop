import java.util.Scanner;

/**
 * Write a description of class multi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class multi
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.pritnln("enter a number");
        for (int i=1; i<=10; i++)
        {
            int m=a*i;
            System.out.println("3 x" + i + "=" +m);
            
        }
        
    }
}