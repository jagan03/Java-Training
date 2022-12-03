class Data{
    protected int a = 5;
}

class second{
    void display(){
        Data a = new Data();
        a.a = 10;
        System.out.println(a.a);
    }
    public static void main(String[] args){
        second s = new second();
        s.display();
    }
}
//class info extends Data{
//    void display(){
//        int n= 20;
//        System.out.println(a);
//    }
//}
//public class second{
//    public static void main(String[] args){
//        info i = new info();
//        i.display();
//    }
//}