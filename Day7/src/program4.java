public class program4 extends Thread{
    public void run(){
        System.out.println("running...");
    }

    public static void main(String args[]){
        program4 p=new program4();     //creating object
        p.start();     //starting thread
        p.start();    //illegalthreadstateEcxeption
    }
}