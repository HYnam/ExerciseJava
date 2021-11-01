package FinalExam;

public class L {

    public static void main(String[] args) {
        int i = 42;
        int t = 0;

        do {
            if (i % 7 == 0) {
                i = i / (t + 1);
            } else {
                i -= 1;
            }
            t += 1;
        } while (i > 0);

        System.out.println(t);
    }
}
