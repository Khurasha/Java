package Assignment2;
public class TFQuestion extends Question {
    private boolean answer;

    public TFQuestion() {
        this(1, "u", false);
    }

    public TFQuestion(int questionId, String questionText, boolean answer) {
        super(questionId, questionText);
        this.answer = answer;
    }

    public boolean getAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    @Override
    public boolean isCorrect(Object guess) {
        if (guess instanceof Boolean || guess instanceof String) {
            String guessString = guess.toString().toLowerCase();
            String answerString = String.valueOf(answer).toLowerCase();
            return guessString.equals(answerString);
        }
        return false;
    }

    @Override
    public String toString() {
        String questionText = getQuestionText();
        String answerText = answer ? "true" : "false";
        return super.toString() + " [" + answerText + "]";
    }

    public static void main(String[] args) {
        TFQuestion tfQuestion = new TFQuestion(134, "Is 4 greater than 2?",true);
        System.out.println(tfQuestion);
        System.out.println(tfQuestion.isCorrect(true)); 
        System.out.println(tfQuestion.isCorrect("False")); 
    }
}

