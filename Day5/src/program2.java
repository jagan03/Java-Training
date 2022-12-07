import java.util.Scanner;
class MarkException extends RuntimeException {
}
class Mark {
    int mark;
    Mark() {}
    Mark(int mark) {
        if (mark<0) {
            throw new MarkException();
        }
        else {
            this.mark = mark;
        }
    }
    public void checkResult() {
        if (this.mark > 45) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}
public class program2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Mark: ");
        Mark m = new Mark();

        try {
            m = new Mark(sc.nextInt());
        }
        catch (Exception e) {
            System.out.println("Mark cannot be negative");
        }
        m.checkResult();
        sc.close();
    }
}