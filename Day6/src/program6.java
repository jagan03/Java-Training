import java.util.*;
public class program6 {
    public static void main(String[] args) {

        LinkedList<String> l_list = new LinkedList<>();

        LinkedList<String> rev_list = new LinkedList<>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");

        for (String element : l_list) {
            System.out.println(element);
        }
        System.out.println();
        l_list.sort(null);
        for (String element : l_list) {
            System.out.println(element);
        }
        System.out.println();



        for (Iterator iterator = l_list.iterator(); iterator.hasNext();) {

            rev_list.add(l_list.pollLast());

        }
        for (String element : rev_list) {

            System.out.println(element);

        }

    }
}