package studios.candyQuiz;

public class Checkbox extends Questions{
    private String question;
    private String correctAns1;
    private String correctAns2;
    private String wrongAns1;
    private String wrongAns2;

    public Checkbox(String correctAns, String wrongAns, String question, String question1, String correctAns1, String correctAns2, String wrongAns1, String wrongAns2) {
        super(correctAns, wrongAns, question);
        this.question = question1;
        this.correctAns1 = correctAns1;
        this.correctAns2 = correctAns2;
        this.wrongAns1 = wrongAns1;
        this.wrongAns2 = wrongAns2;

    }
    /*
    public static correctSelection(){
        if()//correctAns1 & 2
            return true;
            else() return false;
    }*/

}
