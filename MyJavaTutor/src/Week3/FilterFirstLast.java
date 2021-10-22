package Week3;

public class FilterFirstLast {

    /** Searches text for the first and last instances of a given character.
     * Returns the text with the first and last instances of character removed.
     * If the character does not appear in the text, the whole text must be returned intact.
     * If the character only appears in the text once, then then the text must
     * be returned with the first instance of character removed.
     * e.g. "revere" and 'e' would return "rver"
     * @param text Text to be searched.
     * @param searchingFor A character to search for in the text.
     * @return Text with first and last instances of character removed.
     * */
    public static String filterFirstLast(String text, char searchingFor) {
        String filterResult;
        String one;
        String two;

        int firstOccurance = text.indexOf(searchingFor);
        int lastOccurance = text.lastIndexOf(searchingFor);

        if (firstOccurance == -1 && lastOccurance == -1){
            return text;
        }
        // text = "Mila" length -> 4
        // searchingFor = "i"
        else if (firstOccurance == lastOccurance){
            filterResult = text.substring(0, firstOccurance) + text.substring(firstOccurance + 1, text.length());
            return filterResult;
        }
        // text = "Ritvik"
        // searchingFor = "i"
        // We have to return -> Rtvk
        else{
            one = text.substring(0, firstOccurance) + text.substring(firstOccurance + 1, lastOccurance);
            two = text.substring(lastOccurance + 1, text.length());
            filterResult = one + two;
            return filterResult;
        }
    }
}
