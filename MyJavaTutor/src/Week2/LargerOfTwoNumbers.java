package Week2;

public class LargerOfTwoNumbers
{
    /**
     * Finds the biggest of two numbers and returns the biggest number.
     * If the numbers are equal, return the first operand.
     *
     * @param firstNumber First value of operation.
     * @param secondNumber Second value of operation.
     * @return The bigger of the two operands.
     */
    public int largerOfTwoNumbers(int firstNumber, int secondNumber)
    {
        // write your code here
        int result;
        if (firstNumber > secondNumber)
        {
            result = firstNumber;
        }
        else if (secondNumber > firstNumber)
        {
            result = secondNumber;
        }
        else
        {
            result = firstNumber;
        }
        return result;
    }
}
