import java.util.Scanner;
class Student {
    String sName;
    int rollNo;
}
class Exam extends Student{
    int tamilMarks;
    int englishMarks;
    int mathsMarks;
}
class Result extends Exam{
    int totalMarks;
    public int totalMarks() {

        return tamilMarks+englishMarks+mathsMarks;
    }
}

class student1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result res = new Result();
        System.out.println("Enter the marks scored in Tamil: " );
        res.tamilMarks = sc.nextInt();
        System.out.println("Enter the marks scored in English: ");
        res.englishMarks = sc.nextInt();
        System.out.println("Enter the marks scored in Maths: ");
        res.mathsMarks = sc.nextInt();
        System.out.println("The total marks scored is " + res.totalMarks());
        sc.close();
    }
}