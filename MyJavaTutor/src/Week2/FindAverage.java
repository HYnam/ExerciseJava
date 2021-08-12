package Week2;

public class FindAverage
{
    /**
     * Calculates the average for an array of numbers.
     *
     * @param nums An array of numbers. Can include positive numbers, negative numbers, and zero.
     * @return The average of the array of numbers.
     */
    public static double average(int[] nums) {
        double sum = 0;
        for (double val : nums)
            sum += val;
        return sum / nums.length;
    }
}
