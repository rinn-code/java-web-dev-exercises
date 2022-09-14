package studios.candyQuiz;

public class Questions {
    String correctAns;
    String wrongAns;
    String question;

    public Questions(String correctAns, String wrongAns, String question) {
        this.correctAns = correctAns;
        this.wrongAns = wrongAns;
        this.question = question;
    }

    public String getCorrectAns() {
        return correctAns;
    }

    public String getWrongAns() {
        return wrongAns;
    }

    public String getQuestion() {
        return question;
    }

    public void setCorrectAns(String correctAns) {
        this.correctAns = correctAns;
    }

    public void setWrongAns(String wrongAns) {
        this.wrongAns = wrongAns;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

}
