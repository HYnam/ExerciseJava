package FinalExam;

import java.util.Arrays;
import java.util.List;

public class equalList {

    public static void main(String[] args) {
        Integer[] a1 = {1, 2, 3};
        Integer[] a2 = {1, 3, 2};
        Integer[] a3 = {1, 2, 3};

        List<Integer> l1 = Arrays.asList(a1);
        List<Integer> l2 = Arrays.asList(a2);
        List<Integer> l3 = Arrays.asList(a3);

        System.out.println(l1 == l2);
        System.out.println(l1 == l3);
        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l3));
    }
}
