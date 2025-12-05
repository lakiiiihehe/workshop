
/**
 * Write a description of class dwhile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class dwhile
{
    public static void main(String[] args)
    {
        int i = 1;
        int sum = 0;
    
        do
        {
            int s=i*i;
            sum = sum+s;
            i++;
            
            
        }
        while (i<=10);
        System.out.println("the sum of the square is :"+sum);
        
    }
}