import java.util.Scanner;

class BCA {
    int roll;
    String name;
    String course;

    void get() {
        Scanner takes = new Scanner(System.in);
        System.out.println("------------MASMS--------");
        System.out.println("Enter your roll number");
        roll = takes.nextInt();
        System.out.println("Enter your name");
        name = takes.next();
        System.out.println("Enter your course name");
        course = takes.next();
        takes.close();
    }

    void display() {
        System.out.println("-------MASMS-----");
        System.out.println("Student info");
        System.out.println("---------------------");
        System.out.println("Name --> " + name);
        System.out.println("Roll no. --> " + roll);
        System.out.println("Course --> " + course);
    }
}

public class info {
    public static void main(String[] args) {
        BCA b1 = new BCA();
        b1.get();
        b1.display();
    }
}
