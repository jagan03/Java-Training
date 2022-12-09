import java.util.*;
public class program2 {
    static int contr = 1;   //initialising counter value to 1
    static int NUM;
    public void displayEvenNumbers() {  //method for displaying even numbers
        synchronized (this) {
            while (contr < NUM) {
                while (contr % 2 == 0) {   //condition for even
                    try {
                        wait();
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Odd : " + contr + " ");
                contr = contr + 1;  //incrementing counter value to 1
                notify();
            }
        }
    }
    public void displayOddNumber() {    ////method for displaying odd numbers
        synchronized (this) {
            while (contr < NUM) {
                while (contr % 2 != 0) {    ////condition for odd
                    try {
                        wait();
                    }
                    catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Even : " + contr + " ");
                contr = contr + 1;
                notify();
            }
        }
    }
    public static void main(String[] args) {
        NUM = 100;    //initializing num value to 100
        program2 num = new program2();
        Thread t1 = new Thread(new Runnable() {   //creating thread1 implements runnable
            @Override
            public void run() {
                num.displayEvenNumbers();
            }
        });
        Thread t2 = new Thread(new Runnable() {   ////creating thread2 implements runnable
            @Override
            public void run() {
                num.displayOddNumber();
            }
        });
        t1.start();   //starting the threads 1 & 2
        t2.start();
    }
}