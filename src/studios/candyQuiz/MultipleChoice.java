package studios.candyQuiz;

public class MultipleChoice extends Questions{
   public MultipleChoice(String question, String correctAns, String wrongAns, boolean selectOne) {
      super(question, correctAns, wrongAns);
      //this.selectOne = selectOne; //method

   }
   String answerA = "Candy Apples";
   String answerB = "Raisins" ;
   String answerC = "Chocolate";
   String answerD = "Tootsie Rolls";
/*
   private String question(){
      question = new Questions("What is the best candy?","Tootsie Rolls", "Raisins", True);

      return null;
   }*/




}
