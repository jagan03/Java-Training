import java.io.*;
class fib extends Thread {   //fibonacci
    public void run() {
        try {
            int a=0,b=1,c=0;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the Limit");
            int n=Integer.parseInt(br.readLine());
            System.out.println("Fibonacci series:");
            while(n>0) {
                System.out.println(c);
                a=b;
                b=c;
                c=a+b;
                n=n-1;
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
class rev extends Thread {   //reverse
    public void run() {
        try {
            System.out.println("Reverse is");
            for(int i=10;i>=1;i--)     //reverses from 10 to 1
                System.out.println(i);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}

class program8 {
    public static void main(String args[]) {
        try {
            fib t1=new fib();   //creating object
            t1.start();     //starting thread
            t1.sleep(5000);    //thread waits for 5 second
            rev t2=new rev();
            t2.start();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}