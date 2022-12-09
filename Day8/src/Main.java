import java.io.*;
class Main {
    public static void readFile(String file_name1) throws IOException {
        FileInputStream in = new FileInputStream(file_name1);
        int a= in.read();
        while(a!=-1){   ////end of file not reached, continue reading the file contents
            System.out.print((char)a);
            a=in.read();
        }
    }

    public static void main(String[] args) throws IOException {
        readFile("readFile.txt");
    }
}