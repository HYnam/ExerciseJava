package Week3;

public class Delimiters
// Use split()
{
    /**
     * Determines the number number of tokens which exist when the given
     * delimiter is applied to the given string.
     * @param toSplit the string to be split
     * @param delimiter the delimiter used to split the string
     * @return the number of tokens
     */
    public static int countTokens(String toSplit, String delimiter)
    {
        int token;
        String[] str1 = toSplit.split(delimiter);
        token = str1.length;

        return token;
    }
}
