package Week4;

import java.util.Iterator;
import java.util.List;

public class ListHasGreater {

    public static boolean hasGreater(List<Integer> numbers, int number) {
        Iterator<Integer> selectedNum = numbers.iterator();

        while (selectedNum.hasNext()) {
            int result = selectedNum.next();

            if (result > number) {
                return true;
            }
        }
        return false;
    }
}
