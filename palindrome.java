import java.util.Scanner;

/**
 * Write a description of class palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class palindrome
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int a= scan.nextInt();
        int sum =0;
        while(a!=0)
        {
            int rem= a%10;
            sum = sum*10+rem;
            a =a/10;
            
            
            
            
        }
        System.out.println(sum);
    }
}