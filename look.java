class go {
    // data members declares as static
    static int a = 3;
    static int b;

    static void go(int x) {
        System.out.println("X : " + x);
        System.out.println("A : " + a);
        System.out.println("B : " + b);
    }

    static {
        System.out.println("-------------------");
        System.out.println("After value -->");
        b = a * 4;
        System.out.println("B : " + b);
    }
}

public class look {
    public static void main(String[] args) {
        go g1 = new go();
        g1.go(12);
    }
}
