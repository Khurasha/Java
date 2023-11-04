package Assignment2;

public class SAQuestion extends Question {
    private String answer;

    public SAQuestion() {
        super();
        answer = "u";
    }

    public SAQuestion(int questionId, String questionText, String answer) {
        super(questionId, questionText);
        setAnswer(answer);
    }

    public void setAnswer(String answer) {
        if (answer == null || answer.isEmpty()) {
            throw new IllegalArgumentException("Answer cannot be null or empty.");
        }
        this.answer = answer;
    }

    @Override
    public boolean isCorrect(Object guess) {
        if (guess instanceof String) {
            String guessString = (String) guess;
            return guessString.equalsIgnoreCase(answer);
        }
        return false;
    }

    @Override
    public String toString() {
        return "#" + getQuestionId() + ": " + getQuestionText();
    }

    public static void main(String[] args) {
        SAQuestion question = new SAQuestion(134, "What is my name ?", "khurana");
        System.out.println(question);
        System.out.println(question.isCorrect("shabd")); // true
    }
}
