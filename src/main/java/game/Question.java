package game;

public class Question {
    private String question;
    private String firstAnswer;
    private String secondAnswer;
    private String thirdAnswer;
    private String fourthAnswer;
    private final int CORRECT_NUMBER_INDEX;

    public Question(int CORRECT_NUMBER_INDEX) {
        this.CORRECT_NUMBER_INDEX = CORRECT_NUMBER_INDEX;
    }

    public String getQuestion() {
        return question;
    }

    public String getFourthAnswer() {
        return fourthAnswer;
    }

    public String getThirdAnswer() {
        return thirdAnswer;
    }

    public String getSecondAnswer() {
        return secondAnswer;
    }

    public String getFirstAnswer() {
        return firstAnswer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setFourthAnswer(String fourthAnswer) {
        this.fourthAnswer = fourthAnswer;
    }

    public void setThirdAnswer(String thirdAnswer) {
        this.thirdAnswer = thirdAnswer;
    }

    public void setSecondAnswer(String secondAnswer) {
        this.secondAnswer = secondAnswer;
    }

    public void setFirstAnswer(String firstAnswer) {
        this.firstAnswer = firstAnswer;
    }
}
