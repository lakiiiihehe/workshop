import java.util.Scanner;

/**
 * Write a description of class FixedDepositNIB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FixedDepositNIB
{
    public static void main (String[] args)
    {
        
        int loop =1;
        while(loop==1)
        {
            
            Scanner scan = new Scanner(System.in);
            System.out.println("Do You Want to BREAK FD (Yes/No)");
            char inp= scan.next().charAt(0);
            if(inp=='y')
            {
                System.out.println("Enter the Amount");
                int p = scan.nextInt();
                System.out.println("Enter the time in year");
                int t = scan.nextInt();
                System.out.println("Enter the Rate (annual %)");
                int r = scan.nextInt();
                double monthlyRate = (r / 100.0) / 12;
                int months = t * 12;
                System.out.println("Total Months="+months);
                System.out.println("Monthly Interest="+monthlyRate);
                double amount = p * Math.pow(1 + monthlyRate, months);
                double ci = amount - p;

                System.out.println("Total Months = " + months);
                System.out.println("Monthly Rate = " + monthlyRate);
                System.out.println("Compound Interest = " + ci);
                System.out.println("Total Amount = " + amount);
            }
            else
            {
                System.out.println("Thank you");
            }
            
            
        }
        
    }
}