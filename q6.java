import java.util.Scanner;

/**
 * Write a description of class q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q6
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marked price");
        float mp = scan.nextFloat();
        char cat = scan.next().charAt(0);
        System.out.println("Enter the catagory");
        
        
        
        if(cat =='A'){
            float sp=mp-mp*0.60f;
            System.out.println("the selling price is Rs"+sp);
            }
            else if(cat =='B')
            {
            float sp=mp-mp*0.40f;
            System.out.println("the selling price is Rs"+sp);
            }
            else if(cat =='C')
            {
            float sp=mp-mp*0.20f;
            System.out.println("the selling price is Rs"+sp);
            }
            else if(cat =='D')
            {
            float  sp=mp-mp*0.10f;
            System.out.println("the selling price is Rs"+sp);
            }
            else
            {
                System.out.println("NO DISCOUNT FOR YOU PAY "+mp);
            }
        
        
        
        
    }
}