import java.util.InputMismatchException;
import java.util.Scanner;
public class program3 {
static String str;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creating infinite for loop, because things to be repeated for an infinite no. of times

        for (int i = 0;; i++)
        {
            try {
                System.out.println("Enter a numerator: ");
                 str = sc.next();
                System.out.println("Enter a divisor: ");
                int div = sc.nextInt();
                if (str.equalsIgnoreCase("Q")) { //q=113, Q=81
                    System.out.println("End");
                    break;
                }
                System.out.println(Integer.parseInt(str)/div);
            }
//            catch (InputMismatchException ie) {
//                System.out.println("Exception Handled");
//
//            }
            catch (Exception e) {
                System.out.println("Poor Input Data / Divide by zero");
            }
        }
        sc.close();
    }
}