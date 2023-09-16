import java.util.Scanner;

class Student {
    int roll;
    String name;

    void gets() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your roll number-->");
        roll = s.nextInt();

        System.out.println("Enter your name -->");
        name = s.next();
        s.close();
    }

    void show() {
        System.out.println("Name --> " + name);
        System.out.println("Roll No. --> " + roll);
    }
}

public class j02 {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.gets();
        s1.show();
    }
}
