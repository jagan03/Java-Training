class Count extends Thread {
    public void run() {
        for(int i = 1; i<=50; i++) {    //runs till 50
            if (i%10==0) {
                System.out.println("Hello");
            }
            else {
                System.out.println(i);
            }
        }
    }
}

public class program5 {
    public static void main(String[] args) {
        Count c = new Count();    //creating object c
        c.run();      //calling run() method
    }
}