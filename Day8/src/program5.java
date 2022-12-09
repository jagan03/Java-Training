import java.io.*;
public class program5
{
    public static void main(String[] args)
    {
        String path = "/Users/jagadeeshd/Desktop/test.txt";   //initializing path of the text file
        String text = "Hi Keerthana!";      //appending the text
        try
        {
            FileWriter fw = new FileWriter(path, true);   //creating filewriter
            fw.write(text);
            fw.close();
        }
        catch(IOException e)
        {

        }
    }
}