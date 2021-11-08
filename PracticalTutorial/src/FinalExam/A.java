package FinalExam;

public class A {
    public int x;
    public static int y;
    public String z;

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        a1.x = 5;
        a1.y = -5;
        a1.z = "Hi";
        a2.x = 1;
        a2.y = -1;
        a2.z = "Hi";

        System.out.printf("%d %d %d %d %b%n",
                a1.x, a1.y, a2.x, a2.y,
                a1.z == a2.z);
    }
}


