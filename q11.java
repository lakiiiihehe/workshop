import java.util.Scanner;

/**
 * Write a description of class q11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q11
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your income");
        int income= scan.nextInt();
        if(income<=500000)
        {
            double tax= income*0.01d;
            System.out.println("The total tax is :Rs"+tax);
        }
        else if (income>500000 && income<=700000)
        {
            double tax= 0.01*500000 + (700000-income)*0.10d;
            System.out.println("The total tax is :Rs"+tax);
        }
         else if (income>700000 && income<=1000000)
        {
            double tax= 0.01*500000 + 0.10*200000d + (1000000-income)*0.20d;
            System.out.println("The total tax is :Rs"+tax);
        }
        else if (income>1000000 && income<=2000000)
        {
            double tax= 0.01*500000 + 0.10*200000d + 0.20*300000 +(2000000-income)*0.20d;
            System.out.println("The total tax is :Rs"+tax);
        }
        else if (income>2000000 && income<=5000000)
        {
            double tax= 0.01*500000 + 0.10*200000d + 0.20*300000 +0.30*1000000+(5000000-income)*0.20d;
            System.out.println("The total tax is :Rs"+tax);
        }
        else
        {
            double tax= 0.01*500000 + 0.10*200000d + 0.20*300000 +0.30*1000000+(income-5000000)*0.20d;
            System.out.println("The total tax is :Rs"+tax);
        }
        
    }
}