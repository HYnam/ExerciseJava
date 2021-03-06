package FinalExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class arrayIterate {

    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4};
        List<Integer> l = new ArrayList<>(Arrays.asList(a));
        ListIterator<Integer> li = l.listIterator();

        while (li.hasNext()) {
            int i = li.next();

            if (i % 2 == 0) {
                li.add(i + 1);
            }
        }
        System.out.println(l);
    }
}
