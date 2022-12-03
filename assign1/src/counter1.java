class Counter {
    static int count;
    Counter() {
        count++;
    }
}

class counter1 {

    public static void main(String[] args) {
        Counter c1 = new Counter();
        System.out.println("The value of the counter is " + Counter.count);
        Counter c2 = new Counter();
        System.out.println("The value of the counter is " + Counter.count);
        Counter c3 = new Counter();
        System.out.println("The value of the counter is " + Counter.count);
        Counter c4 = new Counter();
        System.out.println("The value of the counter is " + Counter.count);
        Counter c5 = new Counter();
        System.out.println("The value of the counter is " + Counter.count);
    }
}