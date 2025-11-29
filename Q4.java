import java.util.Scanner;

/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q4
{
        public static void main(String[] args)
    
{   
    System.out.println("ENTER THE NUMBER");
    Scanner scan = new Scanner(System.in);
        int num= scan.nextInt();
        int n=scan.nextInt();
        if (n%2==0 && n%5==0)
        {
            System.out.println("the number is divisible by 3 and 5");
            
        }
        else 
        {
            System.out.println("the number is not divisible");
            
        }
        
        
    
        
        // NESTED
        if (num%5==0)
        {
            if(num%3==0){
            System.out.println("THE NUMBER IS DIVISIBLE BY 3 AND 5");
            }
            else {
                
                 System.out.println("THE NUMBER IS DIVISIBLE BY 5 ONLY");
            }
        }
        else if(num%3==0)
        {
        System.out.println("THE NUMBER IS DIVISIBLE BY 3 ONLY ");
        
        }
        else {
            System.out.println("THE NUMBE IS NOT DIVISIBLE BY NON");
        }
    }
}
