/**
 *  In addition to the field variables for ExamQuestion, the
 *  ExamQuestionNumeric provides an answer in form of an additional
 *  field variable, the correctAnswer which will be compared to the
 *  answer provided by the candidate.
 *
 *  @version 2016-10-29
 *  @author Manfred Kerber
 */
public class ExamQuestionNumeric extends ExamQuestion {

    private int correctAnswer;
    /**
     * In order to construct an object we need four parts, the
     * question, the maximal mark, the possible answers, and the
     * position of the correct answer. The first two are handed
     * through to the superclass via the super construct, the other
     * two are used to set the corresponding field variables.
     * @param question The exam question.
     * @param maximalMark The maximal possible mark.
     * @param correctAnswer The correct answer to the question.
     */
    public ExamQuestionNumeric(String question,
                               int maximalMark,
                               int correctAnswer) {
        super(question, maximalMark);
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
        return super.toString() + "Correct answer is: " + correctAnswer + "\n";
    }

    /*
     *  A main method to test with a simple example.
     */
    public static void main(String[] args) {
        ExamQuestionNumeric q2 =
            new ExamQuestionNumeric("2+3 = ?", 10, 5);
        System.out.println(q2);
        System.out.println(q2.mark(5));
        System.out.println(q2.mark(6));
    }
}
