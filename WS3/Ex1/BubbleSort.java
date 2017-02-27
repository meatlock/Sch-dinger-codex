/**
 * The class is used to implement the bubble sort algorithm.
 * @author A. Evangelidis and M. Kerber
 * @version 2015-10-29, last modified 2016-10-20
 *
 */
public class BubbleSort {

    /**
     *  @param numbers The array takes an (unsorted) array of integers.
     *  @return The same numbers, but in ascending order.
     */
    public static int[] bubbleSort(int[] numbers) {
        int tmp;
        int size = numbers.length;
        /* The loop invariant for the outer loop is that the first i
         * elements will be in the correct order. Initially that is
         * the first 0 elements will be in the correct order, then the
         * first, then the first two and so on, that is in each round
         * one more element will be in the right order from the left.
         * Furthermore, the arrays will always contain the same elements.
         */
        for (int i=1; i<size; i++){
            /* The loop invariant for the inner loop is that the
             * smallest element between i and the end of the array can
             * be found among the elements between i and j.  If the
             * smallest element is toward the right of the array it
             * will be moved forward. As a consequence the smallest
             * element will be in position i after the loop
             * terminates.
             */
            for (int j = size-1; j >= i; j--){
                if (numbers[j] < numbers[j-1]){
                    tmp = numbers[j];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = tmp;
                }
            }
        }
        return numbers;
    }

    /**
     * @param numbers An array of integers
     * The method prints the array in a readable format.
     */
    public static void printArray(int[] numbers) {
        int size = numbers.length;
        System.out.print("[");
        for (int i = 0; i < size-1; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println(numbers[size-1] + "]");
    }

    public static void main(String[] args) {
        int[] test1 = {6,3,4,2,2,1,3,1};
        printArray(test1);
        bubbleSort(test1);
        printArray(test1);
    }
}

