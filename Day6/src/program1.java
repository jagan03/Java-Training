import java.util.*;
import java.util.ArrayList;
public class program1 {

    public static void main(String[] args) {

        ArrayList<String> theatres = new ArrayList<>();
        theatres.add("Kasi");
        theatres.add("AVM");
        theatres.add("Luxe");
        theatres.add("Sangam");
        theatres.add("Sathiyam");
        theatres.add("INOX");
        theatres.add("Rohini");
        ArrayList<String> closed = new ArrayList<>();
        //We are using removeAll so the below theaters are closed
        closed.add("Luxe");
        closed.add("INOX");
        closed.add("Sathiyam");
        System.out.println("Open theatres: " + theatres.removeAll(closed));
        System.out.println(theatres);
    }
}
