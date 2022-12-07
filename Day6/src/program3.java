import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class program3 {
    static Scanner s = new Scanner(System.in);
    static ArrayList<String> words = new ArrayList<>();
    public void display(){
        String str;
        System.out.print("Type Your Paragraph " );
        //words of paragraph as list
        while (s.hasNext()) {
            str = s.next();
            if (str.equals("q")) {
                break;
            }
            words.add(str);
        }
        System.out.println(words);
    }
    public void plural() {
        //capitalizing plural words
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).endsWith("s")) {
                words.set(i, words.get(i).toUpperCase());
            }
        }
        ArrayList<String> Updatedwords = new ArrayList<String>();
        Updatedwords.addAll(words);
        System.out.println("Plural words:"+Updatedwords);
    }
    public void remove(){
        words.removeIf(s -> s.length() % 2 != 0);
        System.out.println("After removing odd length words:"+words);
    }
    public void reverse(){
        Collections.reverse(words);
        System.out.println(words);
    }
    public static void main(String[] args) {
        program3 p=new program3();
        p.display();
        p.plural();
        p.remove();
        p.reverse();
    }
}
