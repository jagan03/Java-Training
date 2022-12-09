class T31 extends Thread {
    @Override
    public void run() {
        System.out.println("Hello");
    }
}
class T32 extends Thread {
    @Override
    public void run() {
        System.out.println("QA Ace 2023");
    }
}

public class program3 {
    public static void main(String[] args) {
        T31 t1 = new T31();     //creating object
        T32 t2 = new T32();
        for (int i = 0;; i++) {  //infinite loop
            t1.run();     //calling run method
            t2.run();
        }
    }
}
