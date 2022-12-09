import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class program2
{
    public static void CountWords(String filename, Map< String, Integer> words) throws FileNotFoundException   //creating hashmap(key,value)
    {
        Scanner file=new Scanner (new File(filename));
        while(file.hasNext())  //boolean checks for next string
        {
            String word=file.next();
            Integer count=words.get(word);  //storing words in count
            if(count!=null)
                count++;   //incrementing count
            else
                count=1;
            words.put(word,count);
        }
        file.close();
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        Map<String,Integer> words=new HashMap<String, Integer>();
        CountWords("f.txt",words);
        System.out.println(words);
    }
}