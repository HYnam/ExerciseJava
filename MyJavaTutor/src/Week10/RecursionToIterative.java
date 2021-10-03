package Week10;

public class RecursionToIterative {

    /**
     * Returns whether the given array of integers is in ascending order.
     *
     * @param a array of integers to check
     * @return true if in ascending order; false otherwise
     */
    public static boolean ascendingRecursive(int[] a) {
        // Call the helper, starting at array index 0
        return ascendingHelper(a, 0);
    }

    /**
     * Recursive helper to check whether an array of integers is in ascending
     * order.
     *
     * @param a array to check
     * @param i array index position to check in this call to the helper
     * @return whether the subarray from i to the end of the array is in
     *         ascending order
     */
    public static boolean ascendingHelper(int[] a, int i) {
        // If we have reached the end of the array, it must be in ascending order
        if (i + 1 >= a.length) {
            return true;
        }
        /*
         * If the pair of consecutive elements at positions i and i+1 are not in
         * ascending order, return false
         */
        if (a[i] > a[i + 1]) {
            return false;
        } else {
            // Call the helper again, advancing the position to check (i) by 1
            return ascendingHelper(a, i + 1);
        }
    }

    public static boolean ascendingIterative(int[] a) {
        // write your code here

        for (int i = 0; i<a.length-1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

