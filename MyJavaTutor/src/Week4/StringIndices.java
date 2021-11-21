package Week4;

import java.util.List;
import java.util.ArrayList;

public class StringIndices {

    public static List<Integer> positionsInString(String text, char searchingFor) {
        List<Integer> resultPosition = new ArrayList<>();

        for (int i = -1; (i = text.indexOf(searchingFor, i + 1)) != -1;) {
            resultPosition.add(i);
        }
        return resultPosition;
    }
}
