import java.util.ArrayList;

/**
 *  In addition to the field variables for ExamQuestion, the
 *  ExamQuestionMultipleChoice provides an answer in form of two
 *  additional field variables, the possibleAnswers in form of an
 *  ArrayList of String and the numbers of the correctAnswers in form
 *  of an ArrayList of the numbers of the elements in the ArrayList of
 *  answers (start counting from 1, we start counting from 1, since is
 *  a part that is to interface with a user who would typically start
 *  counting from 1).
 *
 *  @version 2016-10-30
 *  @author Manfred Kerber
 */
public class ExamQuestionMultipleChoice extends ExamQuestion {

    private ArrayList<String> possibleAnswers;
    private ArrayList<Integer> correctAnswers;
    /**
     * In order to construct an object we need four parts, the
     * question, the maximal mark, the possible answers, and the
     * positions of the correct answer. The first two are handed
     * through to the superclass via the super construct, the other
     * two are used to set the corresponding field variables.
     * @param question The exam question.
     * @param maximalMark The maximal possible mark.
     * @param possibleAnswers The array list of possible answers from
     * which the candidate has to choose one.
     * @param correctAnswers The correct answers from the possible
     * answers, counted from 1.
     */
    public ExamQuestionMultipleChoice(String question,
                                      int maximalMark,
                                      ArrayList<String> possibleAnswers,
                                      ArrayList<Integer> correctAnswers) {
        super(question, maximalMark);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswers = correctAnswers;
    }

    /**
     *  mark computes the points by scaling the difference between
     *  the number of correct answers and the number of incorrect
     *  answers to the the maximal points (but not returning less than
     *  0).
     *  @param answersProvided The answers the candidate provides.
     *  @return The maximum of the 0 and the number of correct minus
     *  the number of incorrect answers scaled to the full marks.
     */
    public int mark(ArrayList<Integer> answersProvided) {
        int difference = 0;
        /*
         *  Loop invariant: difference states how many more correct
         *  than incorrect answers have been seen so far.
         */
        for (int el : answersProvided) {
            if (correctAnswers.contains(el)) {
                difference++;
            } else {
                difference--;
            }
        }
        if (difference < 0) {
            // If the difference is less than 0, a mark of 0 is returned.
            return 0;
        } else {
            // For bigger differences the difference is scaled up and rounded.
            return (int) Math.round(((double) difference) /
                                    correctAnswers.size()
                                    * getMaximalMark());
        }
    }
    
    /**
     *  toString method of numeric exam questions.
     *  @return The question displayed as specified.
     */
    @Override
    public String toString() {
        return super.toString() +
            "Possible answers are: " + possibleAnswers + "\n" +
            "Correct answer positions are: " + correctAnswers + "\n";
    }

    /*
     *  A main method to test with a simple example.
     */
    public static void main(String[] args) {
        ArrayList<String> q = new ArrayList<String>();
        q.add("-2"); q.add("0"); q.add("2"); q.add("3");
        ArrayList<Integer> correct = new ArrayList<Integer>();
             correct.add(1); correct.add(3);
        ExamQuestionMultipleChoice q1 =
            new ExamQuestionMultipleChoice("x*x = 4", 10, q, correct);
        ArrayList<Integer> given1 = new ArrayList<Integer>();
             given1.add(2); given1.add(3);
        ArrayList<Integer> given2 = new ArrayList<Integer>();
             given2.add(1); given2.add(3);
        ArrayList<Integer> given3 = new ArrayList<Integer>();
             given3.add(1);
        ArrayList<Integer> given4 = new ArrayList<Integer>();
            given4.add(1); given4.add(3); given4.add(4);
        ArrayList<Integer> given5 = new ArrayList<Integer>();
            given5.add(1); given5.add(2); given5.add(3); given5.add(4);
        
        System.out.println(q1);
        System.out.println(q1.mark(given1));
        System.out.println(q1.mark(given2));
        System.out.println(q1.mark(given3));
        System.out.println(q1.mark(given4));
        System.out.println(q1.mark(given5));
    }
}
