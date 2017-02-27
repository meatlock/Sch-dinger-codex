/** 
 *  The class deals with an exam question consisting of the question
 *  itself in form of a String and a maximal mark as an int. It will
 *  come in three different forms (and possibly more), each in a
 *  sub-class.
 *  @version 2016-10-29
 *  @author Manfred Kerber
 */
public class ExamQuestion {

    private String question;
    private int maximalMark;
    
    /**
     *  Constructor to set the two field variables.
     *  @param question The exam question in form of a String.
     *  @param maximalMark The maximal mark in form of an int.
     */
    public ExamQuestion(String question, int maximalMark) {
        this.question = question;
        this.maximalMark = maximalMark;
    }

    /**
     *  Getter for question.
     *  @return The question in form of a String. 
     */
    public String getQuestion() {
        return this.question;
    }

    /**
     *  Getter for maximal mark.
     *  @return The  maximal mark in form of an int.
     */
    public int getMaximalMark() {
        return this.maximalMark;
    }

    /**
     *  Setter for question.
     *  @param question The new question in form of a String. 
     */
    public void setQuestion(String question) {
                this.question = question;
    }

    /**
     *  Setter for maximal mark.
     *  @param maximalMark The new maximal mark in form of an int.
     */
    public void setMaximalMark(int maximalMark) {
        this.maximalMark = maximalMark;
    }

    /**
     *  toString method of exam questions.
     *  @return The question displayed as specified.
     */
    public String toString() {
        return "Question (Maximal mark: " + getMaximalMark() + ")\n" +
            getQuestion() + "\n";
    }
}
