import java.util.ArrayList;
/**
 *  @version 2016-10-31
 *  @author Manfred Kerber 
 *
 *  The class is used to compute the mean and the standard deviation
 *  of an ArrayList of type Measurable with two corresponding static
 *  methods. The class does not contain a constructor and the methods
 *  are all static.
 */
public class Statistics {

    /**
     *  @param a An ArrayList of type Measurable.
     *  @return The mean value of the values (as given by
     *  getMeasure()) in the list.
     */
    public static double mean(ArrayList<Measurable> a) {
        double sum = 0;
        for (Measurable el : a) {
            sum += el.getMeasure();
        }
        return sum/a.size();
    }

    /**
     *  @param a An ArrayList of type Measurable.
     *  @return The standard deviation of the values (as given by
     *  getMeasure()) in the list.
     */
    public static double standardDeviation(ArrayList<Measurable> a) {
        double mu = mean(a);
        double sum = 0;
        double aux;
        for (Measurable el : a) {
            aux = (el.getMeasure() - mu);
            sum += aux * aux;
        }
        return Math.sqrt(sum/a.size());
    }

    public static void main(String[] args) {
        ArrayList<Measurable> p = new ArrayList<Measurable>();
        Patient p1 = new Patient("John", 20, 82);
        Patient p2 = new Patient("Mary", 22, 67);
        Patient p3 = new Patient("Sam", 22,  68);

        p.add(p1); p.add(p2); p.add(p3);

        System.out.println("Mean weight: " + mean(p));
        System.out.println("Standard deviation: " + standardDeviation(p));
    }
}
