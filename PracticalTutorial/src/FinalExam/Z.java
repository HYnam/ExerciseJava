package FinalExam;

public class Z {

    public static void z(int[] a, int[] b) {
        a = new int[a.length];

        for (int i = 0; i < b.length; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4};
        int[] y = {5, 6, 7, 8};

        z(x, y);

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        System.out.println();

        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
        }
    }
}
