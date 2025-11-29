import java.util.Scanner;

public class CinemaTicket
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the age:");
        int age = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter the language (nepali, hindi, english):");
        String language = scan.nextLine();

        System.out.println("Is the person a student? (yes/no)");
        String stud = scan.nextLine();

        System.out.println("Is it a festival day? (yes/no)");
        String fes = scan.nextLine();

        if (age < 18)
        {
            if (language.equals("nepali"))
            {
                if (stud.equals("yes") && fes.equals("yes"))
                {
                    double child1 = 150 - 0.35 * 150d;
                    System.out.println("The total price is : Rs" + child1);
                }
                else if (stud.equals("yes") && fes.equals("no"))
                {
                    double child2 = 150 - 0.20 * 150d;
                    System.out.println("The total price is : Rs" + child2);
                }
                else if (stud.equals("no") && fes.equals("yes"))
                {
                    double child3 = 150 - 0.15 * 150d;
                    System.out.println("The total price is : Rs" + child3);
                }
                else
                {
                    int child = 150;
                    System.out.println("The total price is : Rs" + child);
                }

            }
            else if (language.equals("hindi"))
            {
                if (stud.equals("yes") && fes.equals("yes"))
                {
                    double child1 = 150 + 50 - 0.35 * 150d;
                    System.out.println("The total price is : Rs" + child1);
                }
                else if (stud.equals("yes") && fes.equals("no"))
                {
                    double child2 = 150 + 50 - 0.20 * 150d;
                    System.out.println("The total price is : Rs" + child2);
                }
                else if (stud.equals("no") && fes.equals("yes"))
                {
                    double child3 = 150 + 50 - 0.15 * 150d;
                    System.out.println("The total price is : Rs" + child3);
                }
                else
                {
                    int child = 150 + 50;
                    System.out.println("The total price is : Rs" + child);
                }
            }
            else
            {
                if (stud.equals("yes") && fes.equals("yes"))
                {
                    double child1 = 150 + 100 - 0.35 * 150d;
                    System.out.println("The total price is : Rs" + child1);
                }
                else if (stud.equals("yes") && fes.equals("no"))
                {
                    double child2 = 150 + 100 - 0.20 * 150d;
                    System.out.println("The total price is : Rs" + child2);
                }
                else if (stud.equals("no") && fes.equals("yes"))
                {
                    double child3 = 150 + 100 - 0.15 * 150d;
                    System.out.println("The total price is : Rs" + child3);
                }
                else
                {
                    int child = 150 + 100;
                    System.out.println("The total price is : Rs" + child);
                }
            }
        }
        else if (age > 18 && age < 66)
        {
            if (language.equals("nepali"))
            {
                if (stud.equals("yes") && fes.equals("yes"))
                {
                    double a1 = 250 - 0.35 * 250d;
                    System.out.println("The total price is : Rs" + a1);
                }
                else if (stud.equals("yes") && fes.equals("no"))
                {
                    double a2 = 250 - 0.20 * 250d;
                    System.out.println("The total price is : Rs" + a2);
                }
                else if (stud.equals("no") && fes.equals("yes"))
                {
                    double a3 = 250 - 0.15 * 250d;
                    System.out.println("The total price is : Rs" + a3);
                }
                else
                {
                    int a = 250;
                    System.out.println("The total price is : Rs" + a);
                }

            }
            else if (language.equals("hindi"))
            {
                if (stud.equals("yes") && fes.equals("yes"))
                {
                    double a1 = 250 + 50 - 0.35 * 250d;
                    System.out.println("The total price is : Rs" + a1);
                }
                else if (stud.equals("yes") && fes.equals("no"))
                {
                    double a2 = 250 + 50 - 0.20 * 250d;
                    System.out.println("The total price is : Rs" + a2);
                }
                else if (stud.equals("no") && fes.equals("yes"))
                {
                    double a3 = 250 + 50 - 0.15 * 250d;
                    System.out.println("The total price is : Rs" + a3);
                }
                else
                {
                    int a = 250 + 50;
                    System.out.println("The total price is : Rs" + a);
                }
            }
            else
            {
                if (stud.equals("yes") && fes.equals("yes"))
                {
                    double a1 = 250 + 100 - 0.35 * 250d;
                    System.out.println("The total price is : Rs" + a1);
                }
                else if (stud.equals("yes") && fes.equals("no"))
                {
                    double a2 = 250 + 100 - 0.20 * 250d;
                    System.out.println("The total price is : Rs" + a2);

                }
                else if (stud.equals("no") && fes.equals("yes"))
                {
                    double a3 = 250 + 100 - 0.15 * 250d;
                    System.out.println("The total price is : Rs" + a3);
                }
                else
                {
                    int a = 250 + 100;
                    System.out.println("The total price is : Rs" + a);
                }

            }

        }
        else
        {
            if (language.equals("nepali"))
            {
                if (stud.equals("yes") && fes.equals("yes"))
                {
                    double s1 = 200 - 0.35 * 200d;
                    System.out.println("The total price is : Rs" + s1);
                }
                else if (stud.equals("yes") && fes.equals("no"))
                {
                    double s2 = 200 - 0.20 * 200d;
                    System.out.println("The total price is : Rs" + s2);
                }
                else if (stud.equals("no") && fes.equals("yes"))
                {
                    double s3 = 200 - 0.15 * 200d;
                    System.out.println("The total price is : Rs" + s3);
                }
                else
                {
                    int s = 200;
                    System.out.println("The total price is : Rs" + s);
                }

            }
            else if (language.equals("hindi"))
            {
                if (stud.equals("yes") && fes.equals("yes"))
                {
                    double s1 = 200 + 50 - 0.35 * 200d;
                    System.out.println("The total price is : Rs" + s1);
                }
                else if (stud.equals("yes") && fes.equals("no"))
                {
                    double s2 = 200 + 50 - 0.20 * 200d;
                    System.out.println("The total price is : Rs" + s2);
                }
                else if (stud.equals("no") && fes.equals("yes"))
                {
                    double s3 = 200 + 50 - 0.15 * 200d;
                    System.out.println("The total price is : Rs" + s3);
                }
                else
                {
                    int s = 200 + 50;
                    System.out.println("The total price is : Rs" + s);
                }
            }
            else
            {
                if (stud.equals("yes") && fes.equals("yes"))
                {
                    double s1 = 200 + 100 - 0.35 * 200d;
                    System.out.println("The total price is : Rs" + s1);
                }
                else if (stud.equals("yes") && fes.equals("no"))
                {
                    double s2 = 200 + 100 - 0.20 * 200d;
                    System.out.println("The total price is : Rs" + s2);

                }
                else if (stud.equals("no") && fes.equals("yes"))
                {
                    double s3 = 200 + 100 - 0.15 * 200d;
                    System.out.println("The total price is : Rs" + s3);
                }
                else
                {
                    int s = 200 + 100;
                    System.out.println("The total price is : Rs" + s);
                }

            }
        }

    }
}
