package Week4;

import java.util.List;
import java.util.ListIterator;

public class ListPrintStrings {
    /**
     * Prints the given list of strings to System.out, skipping every second
     * string. Then, prints the list of strings in reverse order, skipping
     * every second string. All output should be printed on the same line.
     *
     * For example, if the list of strings is ["a", "b", "c", "d"], the output
     * should be "acdb". If the list of strings is ["a", "b", "c"], the output
     * should be "acca".
     *
     * @param strings strings to print
     */
    public static void printStrings(List<String> strings) {
        // write your code here
        ListIterator<String> stringWithIterator = strings.listIterator();

        while(stringWithIterator.hasNext()){
            System.out.print(stringWithIterator.next());
            if (stringWithIterator.hasNext())
                stringWithIterator.next();
        }


        while (stringWithIterator.hasPrevious()) {
            System.out.print(stringWithIterator.previous());
            if (stringWithIterator.hasPrevious())
                stringWithIterator.previous();
        }

        System.out.println();
    }
}
