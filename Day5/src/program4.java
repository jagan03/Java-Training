import java.util.Scanner;

public class program4
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("Enter the number " + i + " : ");
            String str = sc.nextLine();
            try
            {
                Integer a = Integer.parseInt(str);
                sum += a;
            }

            catch (Exception e)
            {

                System.out.println("Invalid Input");
            }
        }
        System.out.println("The average of the marks: " + sum/10);
        sc.close();
    }
}