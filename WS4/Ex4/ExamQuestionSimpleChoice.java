import java.util.ArrayList;

/**
 *  In addition to the field variables for ExamQuestion, the
 *  ExamQuestionSimleChoice provides an answer in form of two
 *  additional field variables, the possibleAnswers in form of an
 *  ArrayList of String and the correctAnswer as the number of the
 *  element in the ArrayList (start counting from 1, we start counting
 *  from 1, since is a part that is to interface with a user who would
 *  typically start counting from 1).
 *
 *  @version 2016-10-29
 *  @author Manfred Kerber
 */
public class ExamQuestionSimpleChoice extends ExamQuestion {

    private ArrayList<String> possibleAnswers;
    private int correctAnswer;
    /**
     * In order to construct an object we need four parts, the
     * question, the maximal mark, the possible answers, and the
     * position of the correct answer. The first two are handed
     * through to the superclass via the super construct, the other
     * two are used to set the corresponding field variables.
     * @param question The exam question.
     * @param maximalMark The maximal possible mark.
     * @param possibleAnswers The array list of possible answers from
     * which the candidate has to choose one.
     * @param correctAnswer The correct answer from the possible
     * answers, counted from 1.
     */
    public ExamQuestionSimpleChoice(String question,
                                    int maximalMark,
                                    ArrayList<String> possibleAnswers,
                                    int correctAnswer) {
        super(question, maximalMark);
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
    }

    /**
     *  mark is to return the maximal points if the answer
     *  provided agrees with the model answer provided, else 0.
     *  @param answerProvided The answer the candidate provides.
     *  @return Full marks (i.e., maximalMark) if the answer provided
     *  is equal to the correct answer, 0 else.
     */
    public int mark(int answerProvided) {
        if (this.correctAnswer == answerProvided) {
            return this.getMaximalMark();
        } else {
            return 0;
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
            "Correct answer position is: " + correctAnswer + "\n";
    }

    /*
     *  A main method to test with a simple example.
     */
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("4"); a.add("5"); a.add("10"); a.add("20");
        ExamQuestionSimpleChoice q1 =
            new ExamQuestionSimpleChoice("2+3 = ?", 10, a, 2);
        System.out.println(q1);
        System.out.println(q1.mark(2));
        System.out.println(q1.mark(3));
    }
}
