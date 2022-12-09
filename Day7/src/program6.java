import java.util.ArrayList;
import java.util.List;
public class program6 {
    public static void main(String[] args) throws InterruptedException {
        Shop ab = new Shop();                   //Shop is a class that is a shared resource for both t1 and t2
        Thread t1 = new Thread(new Runnable(){   //creating threads T1 & T2 using Runnable
            @Override                            //T1 uses produce
            public void run() {
                try {
                    ab.produce();    //calling the produce method
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {    //T2 uses Consume
            @Override
            public void run() {   //creating method
                try {
                    ab.consume();   //calling the method consume
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
        t1.join();    //[Join method allows one thread to wait until another thread completes its execution
        t2.join();
    }
}
class Shop {
    List<Integer> list = new ArrayList<>();
    public void produce() throws InterruptedException {

        int val = 0;
        while(true) {
            synchronized (this) {
                if(list.size() != 0)          //Checks if the list size is equal or not
                    this.wait();
                System.out.println("Produced : " + val);
                list.add(val++);
                notify();
                Thread.sleep(1000);
            }
        }
    }
    public void consume() throws InterruptedException {

        while(true) {
            synchronized (this) {
                if(list.size() == 0)         //if its equal thread has to wait ,if its not equal consumer consumes
                    this.wait();
                System.out.println("Consumed : " + list.get(0));
                list.remove(0);
                notify();
                Thread.sleep(1000);
            }
        }
    }
}
