/**
 *  The class contains two static methods to translate a numerical
 *  rating into a a verbal rating.
 *  @author: Manfred Kerber
 *  @version: 2016-10-20
 */
public class StarRating {

    /**
     *  The method takes in a rating and returns Strings with a verbal 
     *  description of the rating if the ratings are in a particular interval
     *  else it returns "not rated".
     *  
     *  @param rating The rating as a value above 1.0.
     *  @return A translation into English. "not rated" if less than 1.0
     */
    public static String interpret(double rating) {
        if (0.0 <= rating && rating < 4.0) {
            return "CRAP";
        } else if (4.0 <= rating && rating < 4.5) {
            return "OK";
        } else if (4.5 <= rating && rating < 5.0) {
            return "EXCELLENT";
        } else if (rating >= 5.0) {
            return "[HAS ONLY ONE REVIEW]";
        } else {
            return "not rated";
        }
    }

    /*
     *   Some few tests.
     */
    public static void main(String[] args) {
        System.out.println(interpret(1.0));
        System.out.println(interpret(2.0));
        System.out.println(interpret(3.0));
        System.out.println(interpret(4.0));
        System.out.println(interpret(4.5));
        System.out.println(interpret(5.0));
        System.out.println(interpret(2.1));
    }
}
