public class ParityCorrection {
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
     *  @return The first row in which the parity bit is incorrect, or if all
     *  are correct -1.
     */
    public static int findRow(int[][] a) {
        int height = a.length;
        int width = a[0].length;
        int temp;
        for (int i = 0; i < height; i++) {
            temp = 0;
            /* The values in each row are added up.
             */
            for (int j = 0; j < width - 1; j++) {
                temp += a[i][j];
            }
            /* It is checked whether the last bit is correct. */
            if (a[i][width-1] != temp%2) {
                return i;
            }
        }
        return -1;
    }

    /**
     *  @param a A two-dimensional array of rectangular size of 0s and 1s
     *  @return The first column in which the parity bit is incorrect,
     *  or if all are correct -1.
     */
    public static int findColumn(int[][] a) {
        int height = a.length;
        int width = a[0].length;
        int temp;
        for (int j = 0; j < width; j++) {
            temp = 0;
            /* The values in each row are added up.
             */
            for (int i = 0; i < height - 1; i++) {
                temp += a[i][j];
            }
            /* It is checked whether the last bit is correct. */
            if (a[height-1][j] != temp%2) {
                return j;
            }
        }
        return -1;
    }

    /**
     *  @param a A two-dimensional array of rectangular size of 0s and 1s
     *  with parity bits in which at most one bit is wrong.
     *  @return The corrected array with parity bits.
     */
    public static int[][] correctMatrix(int[][] a) {
        int row = findRow(a);
        int column = findColumn(a);
        if (row == -1){
            return a;
        } else {
            a[row][column] = (a[row][column]+1)%2;
            return a;
        }
    }
    
    public static void main(String[] args) {
        /* correct */
        int[][] test1 = {{0,1,1,1,0,1},
                         {1,0,0,0,1,0},
                         {1,0,1,0,1,1},
                         {0,1,0,1,0,0}};
        /* incorrect in row 2, column 3 */
        int[][] test2 = {{0,1,1,1,0,1},
                         {1,0,0,0,1,0},
                         {1,0,1,1,1,1},
                         {0,1,0,1,0,0}};
        
        printArray(test1);
        printArray(test2);
        System.out.print("1st matrix faulty row: " + findRow(test1));
        System.out.println(" faulty column: " + findColumn(test1));
        System.out.print("2nd matrix faulty row : " + findRow(test2));
        System.out.println(" faulty column: " + findColumn(test2));
        printArray(correctMatrix(test1));
        printArray(correctMatrix(test2));
    }
}
