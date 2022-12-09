import java.io.*;
import java.util.Scanner;
class program3 {
    public static void writeFile(String file_name, int m) throws IOException{
        FileOutputStream out=new FileOutputStream(file_name);  //creating fout
        for(int i=1;i<=10;i++){
            int ans=i*m;   //multiplying the values of i to the user input value m
            String content= i + " X " + m + " = " + ans + "\n";   //displaying in tables format
            out.write(content.getBytes());  //changing string to sequence of bytes and storing in bytes
        }
        out.flush();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        String file_name= sc.nextLine();
        int m=sc.nextInt();
        writeFile(file_name, m);
    }
}