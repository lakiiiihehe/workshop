import java.util.Scanner;

/**
 * Write a description of class no7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class no7
{
    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    System.out.println("do you want to operate(y/n)");
    char l= scan.next().charAt(0);
    while(l=='y')
    {
    
    
    System.out.println("Enter number 1");
    int a = scan.nextInt();
    System.out.println("Enter number 2");
    int b = scan.nextInt();
    scan.nextLine();
    System.out.println("Enter the operation(sum/div/minus/multi)");
    String op=scan.nextLine();
    if(op.equals("sum"))
    {
        int sum=a+b;
        System.out.println("the output is:"+sum);
        break;
        
    }
    else if(op.equals("div"))
    {
        int sum=a/b;
        System.out.println("the output is:"+sum);
        break;
    }
    else if(op.equals("minus"))
    {
        int sum=a-b;
        System.out.println("the output is:"+sum);
        break;
    }
    else if (op.equals("multi"))
    {
        int sum=a*b;
        System.out.println("the output is:"+sum);
        break;
    }
    else
    {
       System.out.println("RAMRARI HER KEI WRONG LEKHSI ");
       break;
    }
   
    }
    System.out.println("byebye  "); 
 }
 
 
    
    
}