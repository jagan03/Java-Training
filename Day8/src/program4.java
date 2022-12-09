import java.io.*;
import java.util.Scanner;
class program4 {
    public static void readFile(String file_name1,String file_name2) throws IOException {
        FileInputStream in = new FileInputStream(file_name1);   //creating Fin
        FileOutputStream out= new FileOutputStream(file_name2);   //creating Fout
        int a=0;    //initializing a to 0
        while(a!=-1){  //end of file not reached, continue reading the file contents
            a=in.read();
            out.write(a);
        }
        in.close();
        out.flush();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        String file_name1= sc.nextLine();   //creating file1
        String file_name2= sc.nextLine();   //creating file2
        readFile(file_name1,file_name2);
    }
}