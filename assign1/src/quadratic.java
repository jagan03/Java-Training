public class quadratic
{
    int a, b, c;
    //creating no arguments constructor
    quadratic()
    {
        a=1;
        b=1;
        c=1;
    }
    //creating parameterized constructor
    quadratic(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    //creating "get values" method for printing values of a,b,c
    public void getValues() {

        System.out.println("a = " + a + ", b = " + b +", c = " + c );
    }
    //creating "quadfunction" method for calculating f(x)
    public void quadFunction(int x) {

        System.out.println(a*(x*x) + b*(x)+ c);
    }

    public static void main (String [] args)
    {
        quadratic obj1 = new quadratic(1,2,3);
        obj1.getValues();

        obj1.quadFunction(3);

    //using extractors
        obj1.setA(1);
        obj1.setB(2);
        obj1.setC(3);

        System.out.println();
        System.out.println("a="+obj1.getA());
        System.out.println("b="+obj1.getB());
        System.out.println("c="+obj1.getC());
        obj1.quadFunction(2);


    }
    //declaring the extractors
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}