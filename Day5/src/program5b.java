class Test5b1 {
    Test5b1() {
        System.out.println(10/0);
    }
}
class Test5b2 extends Test5b1{
    Test5b2() {
        try {
            Test5b1 a = new Test5b1();

        } catch (Exception e) {
            System.out.println("Divided by zero");
        }
    }
}

public class program5b {
    public static void main(String[] args) {
        Test5b2 a =  new Test5b2();
    }
}