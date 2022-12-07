//Program - 5
import java.util.*;

public class Main {
    public static void main(String[] args)
    {

        HashMap<String, String> map = new HashMap<String, String>();
        System.out.println("Enter the String: ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        map.put("Bread","Butter");
        map.put("Pen","Pencil");
        map.put("Tall","Short");
        map.put("Big","Small");

        System.out.println("Search String: " + map);
        try {
            Integer i = Integer.parseInt(s);
            System.out.println("Wrong input");
        } catch (Exception e) {
            if(map.containsValue(s)){
                System.out.println("yes");
            }
            else {
                System.out.println("No");
            }
        }
    }
}