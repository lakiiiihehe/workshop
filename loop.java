
/**
 * Write a description of class loop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class loop
{
    public static void main(String[] args)
    {
        for(int i=1;i<=5;i++)
        {
            System.out.print(i);
        }
        int sum=0;
        for(int i=1;i<=5;i++)
        {
            sum= sum+i;
            System.out.println(sum);
        }
        System.out.println(sum);
        int fact=1;
        for(int i=1;i<=5;i++)
        {
            sum= fact*i;
            
        }
        System.out.println(fact);
        long whi=54567890990l;
        while(whi< 4l)
        {
            System.out.println(whi);
        }
        int d=1;
        do 
        {
            System.out.println(d);
            d++;
        }
        while (d<1); // d ko value 2 check garxa 
        
        for(int i=1;i<=5;i++)
        {
          System.out.println(i);
          break;
        }
    }
}