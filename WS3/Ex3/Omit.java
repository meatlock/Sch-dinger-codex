import java.util.ArrayList;

/** 
 *  The class is used to write a method that collects all elements
 *  that do not contain a given digit.
 *
 *  @author Manfred Kerber
 *  @version 2016-10-20
 */

public class Omit {

    /**
     *  The method checks for a number whether it does not contain a
     *  particular number.
     *  @param n The number which is checked.
     *  @param omittedDigit The digit that is supposed to occur in n.
     *  @return true if the omittedDigit occurs in n, false else.
     *  e.g. on (n,omittedDigit)  as (21,3) return false, on (23,3) true
     *  and on (31,3) return true.
     */
    public static boolean contains(int n, int omittedDigit) {
        n = Math.abs(n);
        boolean result = false;
        /*
         * The loop invariant is that the original n contains the
         * omittedDigit either in the last digit of n (computed as
         * n%10 and in this case true is returned) or in the other
         * digits (that is, in n/10).
         */
        while (n > 0) {
            if (n%10 == omittedDigit) {
                return true;
            }
            n = n/10;
        }
        return result;
    }

    /**
     *  @param from The first integer to be considered.
     *  @param to The last integer to be considered.
     *  @param omittedDigit The digit that is supposed to not occur in n.
     *  @return An ArrayList of all digits between from and to (each
     *  inclusively) that do not contain the omittedDigit.
     */
    public static ArrayList<Integer> allIntegersWithout(int from, int to,
                                                        int omittedDigit) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = from; i <= to; i++) {
            if (!contains(i, omittedDigit)){
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(allIntegersWithout(20, 45, 3));
    }
}
