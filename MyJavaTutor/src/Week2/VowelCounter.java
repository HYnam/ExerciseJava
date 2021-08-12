package Week2;

public class VowelCounter
{
    /**
     * Calculates the number of vowels in some given text.
     * Both upper case and lower case vowels count towards the total.
     *
     * @param text The text which to be searched.
     * @return The number of vowels in the given text.
     */
    public int numberVowels(String text)
    {
        // write your code here
        int count = 0;
        for (int i = 0; i < text.length(); i++)
        {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'A' ||text.charAt(i) == 'e' || text.charAt(i) == 'E'
                    ||text.charAt(i) == 'i' || text.charAt(i) == 'I' || text.charAt(i) == 'o' || text.charAt(i) == 'O'
                    || text.charAt(i) == 'u' || text.charAt(i) == 'U')
            {
                count++;
            }
        }
        return count;
    }
}
