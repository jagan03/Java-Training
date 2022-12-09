class T1 extends Thread implements Runnable {  //extending thread
    @Override
    public void run()
    {
        System.out.println("T1");
    }
}
class T2 extends Thread implements Runnable {
    @Override
    public void run()  //creating method run
    {
        System.out.println("T2");
    }
}

public class Main {
    public static void main(String[] args) {

        T1 t1 = new T1();    //creating object for T1
        t1.setName("Jagan");
        System.out.println(t1.getName());

        T2 t2 = new T2();   //creating object for T2
        t2.setName("Jagadeesh");
        System.out.println(t2.getName());
    }
}
