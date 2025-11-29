import java.util.Scanner;

/**
 * Write a description of class q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q7
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the marked price");
        float mp = scan.nextFloat();
        char cat = scan.next().charAt(0);
        System.out.println("Enter the catagory");
        switch (cat)
        {
            case 'A':
            {
            float sp=mp-mp*0.60f;
            System.out.println("the selling price is Rs"+sp);
                
            }
            break;
            case 'B':
                {
            float sp=mp-mp*0.40f;
            System.out.println("the selling price is Rs"+sp);
            }
            break;
            case 'C':
                {
            float sp=mp-mp*0.20f;
            System.out.println("the selling price is Rs"+sp);
            }
            break;
            case 'D':
            {
            float  sp=mp-mp*0.10f;
            System.out.println("the selling price is Rs"+sp);
            }
            break ;
            
            default:System.out.println("Xaina discount"+mp);
            
            
        }
        
   
    }
}
