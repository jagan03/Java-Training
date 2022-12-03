class A {
    A() {
        System.out.println("I am A class");
    }
}
class B {
    B() {
        System.out.println("I am B class");
    }
}
class C extends A {

    C() {

        System.out.println("I am C class");
    }
    B b = new B();
}
class class1 {
    public static void main(String[] args) {

        C  c = new C();

    }
}