import java.util.Arrays;
public class Parity {
    /**
     * @param numbers An array of integers. The method prints a one
     * dimensional array in a readable format.
     */
    public static void printArray(int[] numbers) {
        int size = numbers.length;
        System.out.print("[");
        for (int i = 0; i < size-1; i++) {
            System.out.print(numbers[i] + ", ");
        }
        System.out.print(numbers[size-1] + "]");
    }

    /**
     * @param numbers A two-dimensional array of integers. The method
     * prints a two-dimensional array in a readable format.
     */
    public static void printArray(int[][] numbers) {
        int size = numbers.length;
        System.out.print("[");
        for (int i = 0; i < size-1; i++) {
            printArray(numbers[i]);
            System.out.println(",");
        }
        printArray(numbers[size-1]);
        System.out.println("]\n");
    }

    /**
     *  @param a A two-dimensional array of rectangular size of 0s and 1s
     *  @return A two-dimensional array of rectangular with one more
     *  column and row containing the parity bits.
     *
     */
    public static int[][] addParity(int[][] a) {
        int height = a.length;
        int width = a[0].length;
        int temp;
        int[][] result = new int[height + 1][width + 1];
        for (int i = 0; i < height; i++) {
            temp = 0;
            /* The values of the row are copied over. The values in
             * each row are added up.
             */
            for (int j = 0; j < width; j++) {
                result[i][j] = a[i][j];
                temp += a[i][j];
            }
            /* The last value in the extended row is the sum modulo 2 */
            result[i][width] = temp%2;
        }
        /* The last row is computed by summing up the columns and
         * taking the value modulo 2
         */
        for (int j = 0; j < width; j++) {
            temp = 0;
            for (int i = 0; i < height; i++) {
                temp += a[i][j];
            }
            result[height][j] = temp%2;
        }
            
        return result;
    }

    public static boolean checkParity(int[][] a) {
        int height = a.length;
        int width = a[0].length;
        int temp;
        /* Check whether the final column is correct */
        for (int i = 0; i < height; i++) {
            /* Sum up the elements in a row except last element */
            temp = 0;
            for (int j = 0; j < width -1; j++) {
                temp += a[i][j];
            }
            /* Check whether the last bit is correct */
            if (a[i][width-1] != temp %2) {
                return false;
            }
        }
        /* Check whether the final row is correct */
        for (int j = 0; j < width; j++) {
            temp = 0;
            for (int i = 0; i < height -1; i++) {
                temp += a[i][j];
            }
            /* Check whether the last bit is correct */
            if (a[height-1][j] != temp %2) {
                return false;
            }
        }
        /* If no false bit has been found */
        return true;
    }

    public static void main(String[] args) {
        int[][] test1 = {{0,1,1,1,0},
                         {1,0,0,0,1},
                         {1,0,1,0,1}};

        int[][] test2 = {{0,1,1,1,0,1},
                         {1,0,0,0,1,0},
                         {1,0,1,0,1,1},
                         {0,1,0,1,0,0}};
        printArray(test1);
        printArray(addParity(test1));
        System.out.println(checkParity(addParity(test1)));
        System.out.println(checkParity(test1));
        System.out.println(checkParity(test2));
    }
}
