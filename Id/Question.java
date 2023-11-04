package Assignment2;

public abstract class Question {
    private int questionId;
    private String questionText;
    
    public Question() {
        this(1, "u");
    }

    public Question(int questionId, String questionText) {
        setQuestionId(questionId);
        setQuestionText(questionText);
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        if (questionId <= 0) {
            throw new IllegalArgumentException("Question ID must be greater than 0.");
        }
        this.questionId = questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        if (questionText == null || questionText.isEmpty()) {
            throw new IllegalArgumentException("Question text cannot be null.");
        }
        this.questionText = questionText;
    }

    public abstract boolean isCorrect(Object guess);

    @Override
    public String toString() {
        String displayText = questionText.equals("u") ? "No question text entered." : questionText;
        return "#" + questionId + ": " + displayText;
    }

    public static void main(String[] args) {
        Question question = new TFQuestion(134, "Maths is full theory?", false);
        System.out.println(question);
        System.out.println(question.isCorrect(true)); 
    }
}
